const sharp = require('sharp');
const fs = require('fs');
const path = require('path');

const inputDir = path.join(__dirname, 'src', 'assets');
const outputDir = path.join(inputDir, 'compressed');

// Create output directory if it doesn't exist
if (!fs.existsSync(outputDir)) {
  fs.mkdirSync(outputDir);
}

// Read all files in the input directory
fs.readdirSync(inputDir).forEach(file => {
  const ext = path.extname(file).toLowerCase();
  const baseName = path.basename(file, ext);

  // Only process JPG, JPEG, PNG
  if (['.jpg', '.jpeg', '.png'].includes(ext)) {
    sharp(path.join(inputDir, file))
      .resize({ width: 1200 }) // Optional: resize large images
      .toFormat('webp', { quality: 75 }) // Compress to WebP
      .toFile(path.join(outputDir, `${baseName}.webp`))
      .then(() => console.log(`✅ Compressed: ${file}`))
      .catch(err => console.error(`❌ Error compressing ${file}:`, err));
  }
});