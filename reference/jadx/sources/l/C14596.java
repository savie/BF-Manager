package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܳܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: E5JO */
/* JADX INFO: loaded from: classes4.dex */
public final class C14596 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public HashMap f47759;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashSet f47760;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C17140 f47761;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f47762;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Boolean f47763;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C7660 f47764;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f47765;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f47766;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f47767;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f47768;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final HashSet f47769;

    /* JADX WARN: Code duplicated, block: B:173:0x03f9 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:230:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:241:0x0506  */
    /* JADX WARN: Code duplicated, block: B:252:0x0549 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:282:0x05c7  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
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
    public C14596(java.io.ByteArrayInputStream r26, l.C17140 r27) {
        /*
            Method dump skipped, instruction units count: 2222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14596.<init>(java.io.ByteArrayInputStream, l.ܿۚۨ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m35065() {
        return this.f47762;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35064(XmlResourceParserC11068 xmlResourceParserC11068) {
        int i = 1;
        while (true) {
            int next = xmlResourceParserC11068.next();
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
