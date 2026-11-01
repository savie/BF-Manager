package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W92O */
/* JADX INFO: loaded from: classes2.dex */
public final class C3117 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public char f11750;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public StringBuilder f11753;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public StringBuilder f11754;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f11755;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public EnumC9469 f11748 = EnumC9469.START_DEFINITION;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f11749 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f11751 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f11756 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f11752 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9380(C11647 c11647) {
        ArrayList arrayList = this.f11749;
        arrayList.add(c11647);
        if (this.f11748 == EnumC9469.PARAGRAPH) {
            return;
        }
        C2473 c2473 = new C2473();
        c2473.m7584(c11647);
        C6707 c6707M18124 = C6707.m18124(c2473);
        while (c6707M18124.m18132()) {
            int iOrdinal = this.f11748.ordinal();
            if (iOrdinal == 0) {
                m9376();
                c6707M18124.m18126();
                if (!c6707M18124.m18136('[')) {
                    this.f11748 = EnumC9469.PARAGRAPH;
                    m9376();
                    return;
                } else {
                    this.f11748 = EnumC9469.LABEL;
                    this.f11753 = new StringBuilder();
                    if (!c6707M18124.m18132()) {
                        this.f11753.append('\n');
                    }
                }
            } else {
                if (iOrdinal == 1) {
                    C3884 c3884M18139 = c6707M18124.m18139();
                    if (C3335.m9936(c6707M18124)) {
                        this.f11753.append(c6707M18124.m18130(c3884M18139, c6707M18124.m18139()).m7583());
                        if (!c6707M18124.m18132()) {
                            this.f11753.append('\n');
                        } else if (c6707M18124.m18136(']') && c6707M18124.m18136(':') && this.f11753.length() <= 999 && !C6270.m17351(this.f11753.toString()).isEmpty()) {
                            this.f11748 = EnumC9469.DESTINATION;
                            c6707M18124.m18126();
                        }
                    }
                    this.f11748 = EnumC9469.PARAGRAPH;
                    m9376();
                    return;
                }
                if (iOrdinal == 2) {
                    c6707M18124.m18126();
                    C3884 c3884M181310 = c6707M18124.m18139();
                    if (C3335.m9933(c6707M18124)) {
                        String strM7583 = c6707M18124.m18130(c3884M181310, c6707M18124.m18139()).m7583();
                        if (strM7583.startsWith("<")) {
                            strM7583 = C20630.m46498(1, 1, strM7583);
                        }
                        this.f11755 = strM7583;
                        int iM18126 = c6707M18124.m18126();
                        if (!c6707M18124.m18132()) {
                            this.f11752 = true;
                            arrayList.clear();
                        } else if (iM18126 == 0) {
                        }
                        this.f11748 = EnumC9469.START_TITLE;
                    }
                    this.f11748 = EnumC9469.PARAGRAPH;
                    m9376();
                    return;
                }
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new IllegalStateException("Unknown parsing state: " + this.f11748);
                    }
                    C3884 c3884M181311 = c6707M18124.m18139();
                    if (C3335.m9934(c6707M18124, this.f11750)) {
                        this.f11754.append(c6707M18124.m18130(c3884M181311, c6707M18124.m18139()).m7583());
                        if (c6707M18124.m18132()) {
                            c6707M18124.m18138();
                            c6707M18124.m18126();
                            if (c6707M18124.m18132()) {
                                this.f11754 = null;
                            } else {
                                this.f11752 = true;
                                arrayList.clear();
                                this.f11748 = EnumC9469.START_DEFINITION;
                            }
                        } else {
                            this.f11754.append('\n');
                        }
                    } else {
                        this.f11754 = null;
                    }
                    this.f11748 = EnumC9469.PARAGRAPH;
                    m9376();
                    return;
                }
                c6707M18124.m18126();
                if (c6707M18124.m18132()) {
                    this.f11750 = (char) 0;
                    char cM18135 = c6707M18124.m18135();
                    if (cM18135 == '\"' || cM18135 == '\'') {
                        this.f11750 = cM18135;
                    } else if (cM18135 == '(') {
                        this.f11750 = ')';
                    }
                    if (this.f11750 != 0) {
                        this.f11748 = EnumC9469.TITLE;
                        this.f11754 = new StringBuilder();
                        c6707M18124.m18138();
                        if (!c6707M18124.m18132()) {
                            this.f11754.append('\n');
                        }
                    } else {
                        this.f11748 = EnumC9469.START_DEFINITION;
                    }
                } else {
                    this.f11748 = EnumC9469.START_DEFINITION;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9379(C0316 c0316) {
        this.f11756.add(c0316);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2473 m9382() {
        return C2473.m7581(this.f11749);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList m9381() {
        return this.f11756;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m9377() {
        m9376();
        return this.f11751;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m9378(int i) {
        ArrayList arrayList = this.f11756;
        List listUnmodifiableList = C0561.unmodifiableList(new ArrayList(arrayList.subList(Math.max(arrayList.size() - i, 0), arrayList.size())));
        ArrayList arrayList2 = this.f11749;
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m9376() {
        if (this.f11752) {
            String strM17350 = C6270.m17350(this.f11755);
            StringBuilder sb = this.f11754;
            C17955 c17955 = new C17955(this.f11753.toString(), strM17350, sb != null ? C6270.m17350(sb.toString()) : null);
            ArrayList arrayList = this.f11756;
            c17955.m44384(arrayList);
            arrayList.clear();
            this.f11751.add(c17955);
            this.f11753 = null;
            this.f11752 = false;
            this.f11755 = null;
            this.f11754 = null;
        }
    }
}
