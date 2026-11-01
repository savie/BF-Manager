package l;

/* JADX INFO: renamed from: l.ᩳۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 068W */
/* JADX INFO: loaded from: classes4.dex */
public final class C17756 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f56326 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final char[] f56327;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f56328;

    public C17756(char[] cArr, int i) {
        this.f56327 = cArr;
        this.f56328 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [char] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0039 -> B:21:0x003b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:6:0x0012
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final java.lang.String m41316() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.f56326
            char[] r2 = r6.f56327
            int r3 = r2.length
            r4 = -1
            if (r1 < r3) goto Lf
            r3 = r6
            goto L3b
        Lf:
            char r1 = r2[r1]
            r3 = r6
        L12:
            if (r1 == r4) goto L40
            r5 = 60
            if (r1 == r5) goto L40
            r5 = 62
            if (r1 == r5) goto L40
            r5 = 61
            if (r1 == r5) goto L40
            r5 = 34
            if (r1 == r5) goto L40
            r5 = 39
            if (r1 == r5) goto L40
            boolean r5 = java.lang.Character.isWhitespace(r1)
            if (r5 != 0) goto L40
            char r1 = (char) r1
            r0.append(r1)
            int r1 = r3.f56326
            int r1 = r1 + 1
            r3.f56326 = r1
            int r5 = r2.length
            if (r1 < r5) goto L3d
        L3b:
            r1 = -1
            goto L12
        L3d:
            char r1 = r2[r1]
            goto L12
        L40:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17756.m41316():java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d A[LOOP:0: B:6:0x000c->B:11:0x001d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:14:0x001b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [char] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0019 -> B:10:0x001b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m41314() {
        /*
            r4 = this;
            int r0 = r4.f56326
            char[] r1 = r4.f56327
            int r2 = r1.length
            if (r0 < r2) goto L9
            r2 = r4
            goto L1b
        L9:
            char r0 = r1[r0]
            r2 = r4
        Lc:
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L20
            int r0 = r2.f56326
            int r0 = r0 + 1
            r2.f56326 = r0
            int r3 = r1.length
            if (r0 < r3) goto L1d
        L1b:
            r0 = -1
            goto Lc
        L1d:
            char r0 = r1[r0]
            goto Lc
        L20:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17756.m41314():void");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m41317() {
        int i = this.f56326;
        char[] cArr = this.f56327;
        if (i >= cArr.length) {
            return -1;
        }
        this.f56326 = i + 1;
        return cArr[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41315() {
        return this.f56326 + this.f56328;
    }
}
