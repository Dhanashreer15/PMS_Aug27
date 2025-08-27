
package com.pms.backend.repository;

import com.pms.backend.entity.Security;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SecurityRepository extends JpaRepository<Security, Long> {

    Optional<Security> findByIsin(String isin);

    Optional<Security> findBySymbol(String symbol);

    List<Security> findBySector(String sector);



    @Query("SELECT DISTINCT s.currency FROM Security s WHERE s.currency IS NOT NULL")
    List<String> findDistinctCurrencies();

    @Query("SELECT DISTINCT s.exchange FROM Security s WHERE s.exchange IS NOT NULL")
    List<String> findDistinctExchanges();

    @Query("SELECT DISTINCT s.industry FROM Security s WHERE s.industry IS NOT NULL")
    List<String> findDistinctIndustries();



}
