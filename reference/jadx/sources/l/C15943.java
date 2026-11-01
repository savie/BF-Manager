package l;

import com.alipay.sdk.m.y.l;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺ۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K608 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15943 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C15943 f51637;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Set f51638;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AbstractC7124 f51643;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Set f51635 = null;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Set f51634 = null;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Set f51640 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Set f51636 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Set f51642 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Set f51641 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public EnumC12643 f51639 = EnumC12643.UNKNOWN;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f51633 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37901(C15943 c15943) {
        C15943 c15943M37898 = c15943.m37898();
        if (this == c15943M37898) {
            return;
        }
        c15943M37898.f51637 = this;
        m37897(this, c15943M37898, EnumC7475.f24886);
        m37897(this, c15943M37898, EnumC7475.f24889);
        m37897(this, c15943M37898, EnumC7475.f24890);
        m37897(this, c15943M37898, EnumC7475.f24891);
        m37897(this, c15943M37898, EnumC7475.f24887);
        m37897(this, c15943M37898, EnumC7475.f24885);
        String str = this.f51633;
        if (str == null) {
            this.f51633 = c15943M37898.f51633;
        } else {
            String str2 = c15943M37898.f51633;
            if (str2 != null) {
                this.f51633 = C20881.m46933(str, str2);
            }
        }
        c15943M37898.f51633 = null;
        Set set = c15943M37898.f51638;
        if (set != null) {
            Set set2 = this.f51638;
            if (set2 == null) {
                this.f51638 = set;
            } else {
                set2.addAll(set);
            }
            c15943M37898.f51638 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37897(C15943 c15943, C15943 c15944, EnumC7475 enumC7475) {
        Set setMo19969 = enumC7475.mo19969(c15944);
        if (setMo19969 != null) {
            Set setMo199610 = enumC7475.mo19969(c15943);
            if (setMo199610 == null) {
                enumC7475.mo19970(c15943, setMo19969);
            } else {
                setMo199610.addAll(setMo19969);
                setMo19969 = setMo199610;
            }
            setMo19969.remove(c15943);
            setMo19969.remove(c15944);
            enumC7475.mo19970(c15944, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C15943 m37898() {
        C15943 c15943 = this;
        while (true) {
            C15943 c15944 = c15943.f51637;
            if (c15944 == null) {
                break;
            }
            c15943 = c15944;
        }
        if (c15943 != this) {
            this.f51637 = c15943;
        }
        return c15943;
    }

    public C15943(AbstractC7124 abstractC7124) {
        this.f51643 = abstractC7124;
    }

    public final String toString() {
        C15943 c15943M37898 = m37898();
        Set set = c15943M37898.f51638;
        String string = set == null ? "[]" : set.toString();
        return c15943M37898.f51639 + "::" + this.f51643 + ": " + c15943M37898.f51633 + " > {" + string.substring(1, string.length() - 1) + l.d;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m37903() {
        C15943 c15943M37898 = m37898();
        EnumC12643 enumC12643 = c15943M37898.f51639;
        if (enumC12643 == EnumC12643.OBJECT) {
            return c15943M37898.f51633.length() == 1 ? "Ljava/lang/Object;" : c15943M37898.f51633;
        }
        if (enumC12643.f42238 && enumC12643 != EnumC12643.INT) {
            String str = c15943M37898.f51633;
            if (str != null) {
                return str;
            }
            throw new RuntimeException();
        }
        if (enumC12643 == EnumC12643.JD) {
            return "J";
        }
        if (c15943M37898.f51638 != null) {
            String[] strArr = C20176.f65490;
            for (int i = 0; i < 4; i++) {
                String str2 = strArr[i];
                if (c15943M37898.f51638.contains(str2)) {
                    return str2;
                }
            }
        }
        switch (C21586.f70043[enumC12643.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return "I";
            case 4:
            case 5:
            case 6:
                return "Z";
            default:
                throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37902(EnumC12643 enumC12643) {
        EnumC12643 enumC12644 = this.f51639;
        EnumC12643 enumC12643M31423 = EnumC12643.m31423(enumC12644, enumC12643);
        if (enumC12643M31423 == enumC12644) {
            return false;
        }
        this.f51639 = enumC12643M31423;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m37900() {
        return m37898().f51633;
    }
}
