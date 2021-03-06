/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.routines;


import com.oneops.crawler.jooq.cms.Kloopzcm;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DjDeleteRelease extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1368513037;

    /**
     * The parameter <code>kloopzcm.dj_delete_release.p_release_id</code>.
     */
    public static final Parameter<Long> P_RELEASE_ID = createParameter("p_release_id", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public DjDeleteRelease() {
        super("dj_delete_release", Kloopzcm.KLOOPZCM);

        addInParameter(P_RELEASE_ID);
    }

    /**
     * Set the <code>p_release_id</code> parameter IN value to the routine
     */
    public void setPReleaseId(Long value) {
        setValue(P_RELEASE_ID, value);
    }
}
