package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: W92O */
/* JADX INFO: loaded from: classes4.dex */
public final class C12604 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public char f40446;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public StringBuilder f40448;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public StringBuilder f40449;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f40453;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EnumC20809 f40450 = EnumC20809.START_DEFINITION;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f40454 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f40447 = new ArrayList();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f40451 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f40452 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31312(C14228 c14228) {
        ArrayList arrayList = this.f40454;
        arrayList.add(c14228);
        if (this.f40450 == EnumC20809.PARAGRAPH) {
            return;
        }
        C20942 c20942 = new C20942();
        c20942.m47874(c14228);
        C0805 c0805M3226 = C0805.m3226(c20942);
        while (c0805M3226.m3232()) {
            int iOrdinal = this.f40450.ordinal();
            if (iOrdinal == 0) {
                m31308();
                c0805M3226.m3236();
                if (!c0805M3226.m3235('[')) {
                    this.f40450 = EnumC20809.PARAGRAPH;
                    m31308();
                    return;
                } else {
                    this.f40450 = EnumC20809.LABEL;
                    this.f40449 = new StringBuilder();
                    if (!c0805M3226.m3232()) {
                        this.f40449.append('\n');
                    }
                }
            } else {
                if (iOrdinal == 1) {
                    C9753 c9753M3237 = c0805M3226.m3237();
                    if (C12295.m30692(c0805M3226)) {
                        this.f40449.append(c0805M3226.m3230(c9753M3237, c0805M3226.m3237()).m47873());
                        if (!c0805M3226.m3232()) {
                            this.f40449.append('\n');
                        } else if (c0805M3226.m3235(']') && c0805M3226.m3235(':') && this.f40449.length() <= 999 && !C16991.m40052(this.f40449.toString()).isEmpty()) {
                            this.f40450 = EnumC20809.DESTINATION;
                            c0805M3226.m3236();
                        }
                    }
                    this.f40450 = EnumC20809.PARAGRAPH;
                    m31308();
                    return;
                }
                if (iOrdinal == 2) {
                    c0805M3226.m3236();
                    C9753 c9753M3238 = c0805M3226.m3237();
                    if (C12295.m30689(c0805M3226)) {
                        String strM47873 = c0805M3226.m3230(c9753M3238, c0805M3226.m3237()).m47873();
                        if (strM47873.startsWith("<")) {
                            strM47873 = C1402.m5124(1, 1, strM47873);
                        }
                        this.f40453 = strM47873;
                        int iM3236 = c0805M3226.m3236();
                        if (!c0805M3226.m3232()) {
                            this.f40452 = true;
                            arrayList.clear();
                        } else if (iM3236 == 0) {
                        }
                        this.f40450 = EnumC20809.START_TITLE;
                    }
                    this.f40450 = EnumC20809.PARAGRAPH;
                    m31308();
                    return;
                }
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new IllegalStateException("Unknown parsing state: " + this.f40450);
                    }
                    C9753 c9753M3239 = c0805M3226.m3237();
                    if (C12295.m30690(c0805M3226, this.f40446)) {
                        this.f40448.append(c0805M3226.m3230(c9753M3239, c0805M3226.m3237()).m47873());
                        if (c0805M3226.m3232()) {
                            c0805M3226.m3240();
                            c0805M3226.m3236();
                            if (c0805M3226.m3232()) {
                                this.f40448 = null;
                            } else {
                                this.f40452 = true;
                                arrayList.clear();
                                this.f40450 = EnumC20809.START_DEFINITION;
                            }
                        } else {
                            this.f40448.append('\n');
                        }
                    } else {
                        this.f40448 = null;
                    }
                    this.f40450 = EnumC20809.PARAGRAPH;
                    m31308();
                    return;
                }
                c0805M3226.m3236();
                if (c0805M3226.m3232()) {
                    this.f40446 = (char) 0;
                    char cM3234 = c0805M3226.m3234();
                    if (cM3234 == '\"' || cM3234 == '\'') {
                        this.f40446 = cM3234;
                    } else if (cM3234 == '(') {
                        this.f40446 = ')';
                    }
                    if (this.f40446 != 0) {
                        this.f40450 = EnumC20809.TITLE;
                        this.f40448 = new StringBuilder();
                        c0805M3226.m3240();
                        if (!c0805M3226.m3232()) {
                            this.f40448.append('\n');
                        }
                    } else {
                        this.f40450 = EnumC20809.START_DEFINITION;
                    }
                } else {
                    this.f40450 = EnumC20809.START_DEFINITION;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31311(C5280 c5280) {
        this.f40451.add(c5280);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20942 m31314() {
        return C20942.m47872(this.f40454);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList m31313() {
        return this.f40451;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m31309() {
        m31308();
        return this.f40447;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m31310(int i) {
        ArrayList arrayList = this.f40451;
        List listUnmodifiableList = C4681.unmodifiableList(new ArrayList(arrayList.subList(Math.max(arrayList.size() - i, 0), arrayList.size())));
        ArrayList arrayList2 = this.f40454;
        if (i >= arrayList2.size()) {
            arrayList2.clear();
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.remove(arrayList2.size() - 1);
            }
        }
        if (i >= arrayList.size()) {
            arrayList.clear();
            return listUnmodifiableList;
        }
        for (int i3 = 0; i3 < i; i3++) {
            arrayList.remove(arrayList.size() - 1);
        }
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m31308() {
        if (this.f40452) {
            String strM40051 = C16991.m40051(this.f40453);
            StringBuilder sb = this.f40448;
            C8787 c8787 = new C8787(this.f40449.toString(), strM40051, sb != null ? C16991.m40051(sb.toString()) : null);
            ArrayList arrayList = this.f40451;
            c8787.m14255(arrayList);
            arrayList.clear();
            this.f40447.add(c8787);
            this.f40449 = null;
            this.f40452 = false;
            this.f40453 = null;
            this.f40448 = null;
        }
    }
}
