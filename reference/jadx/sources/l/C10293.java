package l;

/* JADX INFO: renamed from: l.ۢᩳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: QIY2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10293 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f32868;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC19244 f32869;

    public C10293(int i, EnumC19244 enumC19244) {
        this.f32868 = i;
        this.f32869 = enumC19244;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10293 m26530() {
        int i = this.f32868;
        return (i & 8) != 0 ? this : new C10293(i | 8, this.f32869);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10293 m26546(int i) {
        int i2 = this.f32868;
        return (i2 & i) != 0 ? new C10293((~i) & i2, this.f32869) : this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26533(int... iArr) {
        for (int i : iArr) {
            if ((i & this.f32868) == 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10293 m26531(int i) {
        int i2 = this.f32868;
        return (i2 & 7) == i ? this : new C10293(i | (i2 & (-8)), this.f32869);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10293 m26545() {
        return new C10293(this.f32868 & 7, this.f32869);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26532(C10293 c10293) {
        int i = this.f32868 & 7;
        int i2 = c10293.f32868 & 7;
        return i != i2 && m26526(i) < m26526(i2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m26526(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 3;
        }
        throw new C8597(C13645.m33382(i, "Unexpected visibility flag: "));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m26542() {
        return (this.f32868 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m26541() {
        return (this.f32868 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m26549() {
        return (this.f32868 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m26536() {
        return (this.f32868 & 7) == 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m26534() {
        return (this.f32868 & 512) != 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m26535() {
        return (this.f32868 & 8192) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m26540() {
        return (this.f32868 & 8) != 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m26538() {
        return (this.f32868 & 16) != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m26543() {
        return (this.f32868 & 65536) != 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m26539() {
        return (this.f32868 & 16384) != 0;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m26528() {
        return (this.f32868 & 4096) != 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m26547() {
        return (this.f32868 & 64) != 0;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m26544() {
        return (this.f32868 & 128) != 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m26548() {
        return (this.f32868 & 131104) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m26527() {
        return (this.f32868 & 32768) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m26529(boolean z) {
        StringBuilder sb = new StringBuilder();
        if (m26542()) {
            sb.append("public ");
        }
        if (m26549()) {
            sb.append("private ");
        }
        if (m26541()) {
            sb.append("protected ");
        }
        if (m26540()) {
            sb.append("static ");
        }
        if (m26538()) {
            sb.append("final ");
        }
        int i = this.f32868;
        if ((i & 1024) != 0) {
            sb.append("abstract ");
        }
        if ((i & 256) != 0) {
            sb.append("native ");
        }
        int iOrdinal = this.f32869.ordinal();
        if (iOrdinal == 0) {
            if ((i & 2048) != 0) {
                sb.append("strict ");
            }
            if (z) {
                if ((i & 262144) != 0) {
                    sb.append("/* data */ ");
                }
                if (m26527()) {
                    sb.append("/* module-info */ ");
                }
            }
        } else if (iOrdinal == 1) {
            if ((i & 64) != 0) {
                sb.append("volatile ");
            }
            if ((i & 128) != 0) {
                sb.append("transient ");
            }
        } else if (iOrdinal == 2) {
            if (m26548()) {
                sb.append("synchronized ");
            }
            if (z && m26547()) {
                sb.append("/* bridge */ ");
            }
        }
        if (m26528() && z) {
            sb.append("/* synthetic */ ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m26537() {
        return this.f32868;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10293) {
            C10293 c10293 = (C10293) obj;
            if (this.f32868 == c10293.f32868 && this.f32869 == c10293.f32869) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f32869.hashCode() * 31) + this.f32868;
    }

    public final String toString() {
        return "AccessInfo: " + this.f32869 + " 0x" + Integer.toHexString(this.f32868) + " (" + m26529(true) + ')';
    }
}
