package com.dangdang.ddframe.rdb.sharding.parsing.parser.dialect.oracle.clause.facade;

import com.dangdang.ddframe.rdb.sharding.api.rule.ShardingRule;
import com.dangdang.ddframe.rdb.sharding.parsing.lexer.LexerEngine;
import com.dangdang.ddframe.rdb.sharding.parsing.parser.clause.facade.AbstractSelectClauseParserFacade;
import com.dangdang.ddframe.rdb.sharding.parsing.parser.clause.HavingClauseParser;
import com.dangdang.ddframe.rdb.sharding.parsing.parser.clause.SelectRestClauseParser;
import com.dangdang.ddframe.rdb.sharding.parsing.parser.dialect.oracle.clause.OracleDistinctClauseParser;
import com.dangdang.ddframe.rdb.sharding.parsing.parser.dialect.oracle.clause.OracleGroupByClauseParser;
import com.dangdang.ddframe.rdb.sharding.parsing.parser.dialect.oracle.clause.OracleOrderByClauseParser;
import com.dangdang.ddframe.rdb.sharding.parsing.parser.dialect.oracle.clause.OracleSelectListClauseParser;
import com.dangdang.ddframe.rdb.sharding.parsing.parser.dialect.oracle.clause.OracleTableReferenceClauseParser;
import com.dangdang.ddframe.rdb.sharding.parsing.parser.dialect.oracle.clause.OracleWhereClauseParser;

/**
 * Oracle的SELECT从句解析器门面类.
 *
 * @author zhangliang
 */
public final class OracleSelectClauseParserFacade extends AbstractSelectClauseParserFacade {
    
    public OracleSelectClauseParserFacade(final ShardingRule shardingRule, final LexerEngine lexerEngine) {
        super(new OracleDistinctClauseParser(lexerEngine), new OracleSelectListClauseParser(shardingRule, lexerEngine),
                new OracleTableReferenceClauseParser(shardingRule, lexerEngine), new OracleWhereClauseParser(lexerEngine), new OracleGroupByClauseParser(lexerEngine),
                new HavingClauseParser(lexerEngine), new OracleOrderByClauseParser(lexerEngine), new SelectRestClauseParser(lexerEngine));
    }
}
