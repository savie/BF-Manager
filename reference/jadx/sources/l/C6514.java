package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۛܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: RIV5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6514 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12479 f21862;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12479 f21863;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f21864;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f21865;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f21866;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f21867;

    public C6514(C12479 c12479, C12479 c124710) {
        this.f21863 = c12479;
        this.f21862 = c124710;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6514 m18380() {
        return new C6514(this.f21863.m30987(), this.f21862.m30987());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m18382(int i) {
        this.f21865 = i;
        if (i == 0) {
            this.f21866 = 0;
            this.f21867 = 0;
            this.f21864 = 0;
        } else {
            C12479 c12479 = this.f21863;
            c12479.m30995(i);
            c12479.m30991(4);
            this.f21866 = c12479.m30990();
            this.f21867 = c12479.m30990();
            this.f21864 = c12479.m30990();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m18384() {
        int i = this.f21865;
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        C12479 c12479 = this.f21863;
        c12479.m30988(i);
        return m18379(c12479.m30990());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Map m18381() {
        if (this.f21866 == 0) {
            return Collections.EMPTY_MAP;
        }
        C12479 c12479 = this.f21863;
        c12479.m30991(16);
        HashMap map = new HashMap(this.f21866);
        for (int i = 0; i < this.f21866; i++) {
            map.put(Integer.valueOf(c12479.m30990()), Integer.valueOf(c12479.m30990()));
        }
        return map;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Map m18383() {
        if (this.f21867 == 0) {
            return Collections.EMPTY_MAP;
        }
        int i = (this.f21866 * 8) + 16;
        C12479 c12479 = this.f21863;
        c12479.m30991(i);
        HashMap map = new HashMap(this.f21867);
        for (int i2 = 0; i2 < this.f21867; i2++) {
            map.put(Integer.valueOf(c12479.m30990()), Integer.valueOf(c12479.m30990()));
        }
        return map;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Map m18386() {
        if (this.f21864 == 0) {
            return Collections.EMPTY_MAP;
        }
        int i = (this.f21867 * 8) + (this.f21866 * 8) + 16;
        C12479 c12479 = this.f21863;
        c12479.m30991(i);
        HashMap map = new HashMap(this.f21864);
        for (int i2 = 0; i2 < this.f21864; i2++) {
            map.put(Integer.valueOf(c12479.m30990()), Integer.valueOf(c12479.m30990()));
        }
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m18379(int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        C12479 c12479 = this.f21863;
        c12479.m30988(i);
        int iM30990 = c12479.m30990();
        if (iM30990 == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iM30990);
        int iM31005 = c12479.m31005();
        for (int i2 = 0; i2 < iM30990; i2++) {
            c12479.m30988((i2 * 4) + iM31005);
            c12479.m30988(c12479.m30990());
            arrayList.add(m18377(c12479, this.f21862, true));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m18385(int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        C12479 c12479 = this.f21863;
        c12479.m30988(i);
        int iM30990 = c12479.m30990();
        if (iM30990 == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iM30990);
        for (int i2 = 0; i2 < iM30990; i2++) {
            int iM30991 = c12479.m30990();
            int iM31005 = c12479.m31005();
            arrayList.add(m18379(iM30991));
            c12479.m30988(iM31005);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5886 m18377(C12479 c12479, C12479 c124710, boolean z) {
        EnumC11105 enumC11105;
        if (z) {
            int iM31002 = c12479.m31002();
            if (iM31002 == 0) {
                enumC11105 = EnumC11105.BUILD;
            } else if (iM31002 == 1) {
                enumC11105 = EnumC11105.RUNTIME;
            } else {
                if (iM31002 != 2) {
                    throw new C13817(C13645.m33382(iM31002, "Unknown annotation visibility value: "));
                }
                enumC11105 = EnumC11105.SYSTEM;
            }
        } else {
            enumC11105 = null;
        }
        c12479.getClass();
        int iM50647 = C22463.m50647(c12479);
        int iM50648 = C22463.m50647(c12479);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM50648);
        for (int i = 0; i < iM50648; i++) {
            linkedHashMap.put(c124710.m30998(C22463.m50647(c12479)), C24414.m54617(c12479, c124710));
        }
        return new C5886(enumC11105, c124710.m30997(iM50647), linkedHashMap);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m18378(C12479 c12479) {
        return C24414.m54616(c12479, this.f21862);
    }
}
