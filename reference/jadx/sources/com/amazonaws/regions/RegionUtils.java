package com.amazonaws.regions;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class RegionUtils {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Log f399 = LogFactory.m297("com.amazonaws.request");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList f400;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m418() {
        if (System.getProperty("com.amazonaws.regions.RegionUtils.fileOverride") != null) {
            try {
                m419();
            } catch (FileNotFoundException e) {
                throw new RuntimeException("Couldn't find regions override file specified", e);
            }
        }
        if (f400 == null) {
            Log log = f399;
            if (log.mo287()) {
                log.mo291("Initializing the regions with default regions");
            }
            f400 = RegionDefaults.m413();
        }
        if (f400 == null) {
            throw new RuntimeException("Failed to initialize the regions.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Region m417(String str) {
        ArrayList<Region> arrayList;
        synchronized (RegionUtils.class) {
            if (f400 == null) {
                m418();
            }
            arrayList = f400;
        }
        for (Region region : arrayList) {
            if (region.m409().equals(str)) {
                return region;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m419() {
        String property = System.getProperty("com.amazonaws.regions.RegionUtils.fileOverride");
        Log log = f399;
        if (log.mo287()) {
            log.mo291("Using local override of the regions file (" + property + ") to initiate regions data...");
        }
        FileInputStream fileInputStream = new FileInputStream(new File(property));
        try {
            new RegionMetadataParser();
            f400 = RegionMetadataParser.m416(fileInputStream);
        } catch (Exception e) {
            log.mo289("Failed to parse regional endpoints", e);
        }
    }
}
