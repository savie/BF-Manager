package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes3.dex */
public final class C9158 extends AbstractC10569 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C9158[] f31129;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C1395 f31130;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C11316 f31131;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C19741[] f31132;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16213[] f31133;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7040[] f31134;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2806[] f31135;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C9158[] f31136;

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ܰ */
    public final C9158 mo8528() {
        return this;
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC1332 mo8524() {
        return this.f31131;
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ۜ */
    public final C11316 mo8524() {
        return this.f31131;
    }

    @Override // l.AbstractC10569
    public final String getName() {
        return this.f31131.getName();
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ۚ */
    public final String mo8523() {
        return this.f31131.getName();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String m23482() {
        return this.f31131.m28354();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List m23484() {
        return C0561.unmodifiableList(Arrays.asList(this.f31135));
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final List m23488() {
        return C0561.unmodifiableList(Arrays.asList(this.f31134));
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final List m23483() {
        return C0561.unmodifiableList(Arrays.asList(this.f31132));
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final List m23485() {
        return C0561.unmodifiableList(Arrays.asList(this.f31129));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m23489() {
        return C0561.unmodifiableList(Arrays.asList(this.f31136));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final EnumC12167 m23487() {
        C11316 c11316 = this.f31131;
        String strM28347 = c11316.m28347();
        if (strM28347.equals("proto3")) {
            return EnumC12167.EDITION_PROTO3;
        }
        if (strM28347.equals("editions")) {
            return c11316.m28341();
        }
        return EnumC12167.EDITION_PROTO2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9158 m23477(C11316 c11316, C9158[] c9158Arr) throws C13391 {
        C9158 c9158 = new C9158(c11316, c9158Arr, new C1395(c9158Arr));
        for (C2806 c2806 : c9158.f31135) {
            c2806.m8520();
        }
        for (C16213 c16213 : c9158.f31133) {
            C16213.m38325(c16213);
        }
        for (C19741 c19741 : c9158.f31132) {
            C19741.m44896(c19741);
        }
        return c9158;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9158 m23478(String[] strArr, C9158[] c9158Arr) {
        byte[] bytes;
        if (strArr.length == 1) {
            bytes = strArr[0].getBytes(C9779.f33480);
        } else {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
            }
            bytes = sb.toString().getBytes(C9779.f33480);
        }
        try {
            C11316 from = C11316.parseFrom(bytes);
            try {
                return m23477(from, c9158Arr);
            } catch (C13391 e) {
                throw new IllegalArgumentException("Invalid embedded descriptor for \"" + from.getName() + "\".", e);
            }
        } catch (C4529 e2) {
            throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e2);
        }
    }

    public C9158(C11316 c11316, C9158[] c9158Arr, C1395 c1395) throws C13391 {
        C2806[] c2806Arr;
        C7040[] c7040Arr;
        C16213[] c16213Arr;
        C19741[] c19741Arr;
        super(0);
        this.f31130 = c1395;
        this.f31131 = c11316;
        this.f31129 = (C9158[]) c9158Arr.clone();
        HashMap map = new HashMap();
        for (C9158 c9158 : c9158Arr) {
            map.put(c9158.f31131.getName(), c9158);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c11316.m28355(); i++) {
            int iM28343 = c11316.m28343(i);
            if (iM28343 < 0 || iM28343 >= c11316.m28350()) {
                throw new C13391(this, "Invalid public dependency index.");
            }
            C9158 c9159 = (C9158) map.get(c11316.m28342(iM28343));
            if (c9159 != null) {
                arrayList.add(c9159);
            }
        }
        C9158[] c9158Arr2 = new C9158[arrayList.size()];
        this.f31136 = c9158Arr2;
        arrayList.toArray(c9158Arr2);
        c1395.m4886(this, this.f31131.m28354());
        if (c11316.m28352() <= 0) {
            c2806Arr = C20446.f66287;
        } else {
            c2806Arr = new C2806[c11316.m28352()];
        }
        this.f31135 = c2806Arr;
        for (int i2 = 0; i2 < c11316.m28352(); i2++) {
            this.f31135[i2] = new C2806(c11316.m28340(i2), this);
        }
        if (c11316.m28344() <= 0) {
            c7040Arr = C20446.f66285;
        } else {
            c7040Arr = new C7040[c11316.m28344()];
        }
        this.f31134 = c7040Arr;
        for (int i3 = 0; i3 < c11316.m28344(); i3++) {
            this.f31134[i3] = new C7040(c11316.m28351(i3), this, null);
        }
        if (c11316.m28346() <= 0) {
            c16213Arr = C20446.f66279;
        } else {
            c16213Arr = new C16213[c11316.m28346()];
        }
        this.f31133 = c16213Arr;
        for (int i4 = 0; i4 < c11316.m28346(); i4++) {
            this.f31133[i4] = new C16213(c11316.m28360(i4), this);
        }
        if (c11316.m28361() <= 0) {
            c19741Arr = C20446.f66280;
        } else {
            c19741Arr = new C19741[c11316.m28361()];
        }
        this.f31132 = c19741Arr;
        for (int i5 = 0; i5 < c11316.m28361(); i5++) {
            this.f31132[i5] = new C19741(c11316.m28349(i5), this, null, i5, true);
        }
    }

    public C9158(String str, C2806 c2806) {
        super(0);
        this.f36173 = null;
        C1395 c1395 = new C1395(new C9158[0]);
        this.f31130 = c1395;
        C6376 c6376NewBuilder = C11316.newBuilder();
        c6376NewBuilder.m17502(c2806.mo8523() + ".placeholder.proto");
        c6376NewBuilder.m17506(str);
        c6376NewBuilder.m17503(c2806.mo8524());
        C11316 c11316BuildPartial = c6376NewBuilder.buildPartial();
        if (c11316BuildPartial.isInitialized()) {
            this.f31131 = c11316BuildPartial;
            this.f31129 = new C9158[0];
            this.f31136 = new C9158[0];
            this.f31135 = new C2806[]{c2806};
            this.f31134 = C20446.f66285;
            this.f31133 = C20446.f66279;
            this.f31132 = C20446.f66280;
            c1395.m4886(this, str);
            c1395.m4887(c2806);
            return;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c11316BuildPartial);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m23486() {
        try {
            m23479();
        } catch (C13391 e) {
            throw new IllegalArgumentException("Invalid features for \"" + this.f31131.getName() + "\".", e);
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m23479() {
        if (this.f36172 != null) {
            return;
        }
        synchronized (this) {
            if (this.f36172 != null) {
                return;
            }
            m26727(this.f31131.m28359().m10534());
            for (C2806 c2806 : this.f31135) {
                c2806.m8517();
            }
            for (C7040 c7040 : this.f31134) {
                C7040.m18881(c7040);
            }
            for (C16213 c16213 : this.f31133) {
                C16213.m38324(c16213);
            }
            for (C19741 c19741 : this.f31132) {
                C19741.m44893(c19741);
            }
        }
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C23539 mo23481() {
        C19305 c19305NewBuilder = C23539.newBuilder();
        if (m23487().getNumber() >= EnumC12167.EDITION_2023.getNumber()) {
            return c19305NewBuilder.build();
        }
        if (m23487() == EnumC12167.EDITION_PROTO2 && this.f31131.m28359().m10529()) {
            C15424 c15424 = C1001.f4676;
            C11586 c11586NewBuilder = C22169.newBuilder();
            c11586NewBuilder.m28880(EnumC5235.VERIFY);
            C22169 c22169BuildPartial = c11586NewBuilder.buildPartial();
            if (!c22169BuildPartial.isInitialized()) {
                throw AbstractC3967.m11452((InterfaceC1332) c22169BuildPartial);
            }
            c19305NewBuilder.m31300(c15424, c22169BuildPartial);
        }
        return c19305NewBuilder.build();
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean mo23480() {
        return m23487().getNumber() < EnumC12167.EDITION_2023.getNumber() && m23487() == EnumC12167.EDITION_PROTO2 && this.f31131.m28359().m10529();
    }
}
