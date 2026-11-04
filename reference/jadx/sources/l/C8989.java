package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۠᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5JO */
/* JADX INFO: loaded from: classes3.dex */
public final class C8989 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12558 f29283;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f29284;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f29285;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f29286;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2329 f29287;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public HashMap f29288;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f29289;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Boolean f29290;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f29291;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashSet f29292;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashSet f29293;

    /* JADX WARN: Code duplicated, block: B:173:0x03f9 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:230:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:241:0x0506  */
    /* JADX WARN: Code duplicated, block: B:252:0x0549 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:282:0x05c7  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public C8989(java.io.ByteArrayInputStream r26, l.C12558 r27) {
        /*
            Method dump skipped, instruction units count: 2222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8989.<init>(java.io.ByteArrayInputStream, l.ۨᩴۤ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m23985() {
        return this.f29284;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23984(XmlResourceParserC9734 xmlResourceParserC9734) {
        int i = 1;
        while (true) {
            int next = xmlResourceParserC9734.next();
            if (next == 1) {
                return;
            }
            if (next == 2) {
                i++;
            } else if (next == 3 && (i = i - 1) == 0) {
                return;
            }
        }
    }
}
