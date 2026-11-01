package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۨ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GAOL */
/* JADX INFO: loaded from: classes4.dex */
public final class C12020 implements InterfaceC2846, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f40262;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f40263;

    public C12020(int i, int i2) {
        this.f40262 = i;
        this.f40263 = i2;
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۨ */
    public final Object mo7338() {
        return Integer.valueOf(mo8610());
    }

    @Override // l.InterfaceC2846
    /* JADX INFO: renamed from: ۟ */
    public final int mo8610() {
        return this.f40262;
    }

    @Override // l.InterfaceC2846
    /* JADX INFO: renamed from: ۡ */
    public final int mo8611() {
        return this.f40263;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean z = obj instanceof InterfaceC2846;
        int i = this.f40263;
        int i2 = this.f40262;
        if (z) {
            InterfaceC2846 interfaceC2846 = (InterfaceC2846) obj;
            return i2 == interfaceC2846.mo8610() && i == interfaceC2846.mo8611();
        }
        if (!(obj instanceof InterfaceC14924)) {
            return false;
        }
        InterfaceC14924 interfaceC14924 = (InterfaceC14924) obj;
        return Integer.valueOf(i2).equals(interfaceC14924.mo7338()) && Integer.valueOf(i).equals(interfaceC14924.mo7339());
    }

    @Override // l.InterfaceC2846
    /* JADX INFO: renamed from: ᩵ */
    public final int mo8613() {
        return mo8610();
    }

    public final int hashCode() {
        return (this.f40262 * 19) + this.f40263;
    }

    @Override // l.InterfaceC14924
    public final Object first() {
        return Integer.valueOf(mo8613());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.f40262);
        sb.append(",");
        return C12441.m30911(this.f40263, ">", sb);
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ᩹ */
    public final Object mo7339() {
        return Integer.valueOf(mo8611());
    }

    @Override // l.InterfaceC2846
    /* JADX INFO: renamed from: ۤ */
    public final int mo8612() {
        return mo8611();
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۖ */
    public final Object mo7335() {
        return Integer.valueOf(mo8612());
    }
}
