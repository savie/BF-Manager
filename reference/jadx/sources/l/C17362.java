package l;

/* JADX INFO: renamed from: l.ܽۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R78M */
/* JADX INFO: loaded from: classes4.dex */
public final class C17362 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13216 f56505 = new C13216();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40793(String str) {
        C13216 c13216 = this.f56505;
        if (str != null) {
            c13216.getClass();
            if (str.length() >= 2 && str.charAt(0) == 'L' && C22313.m50373(1, str) == ';') {
                c13216.m32745(str);
                return;
            }
        }
        c13216.m32749(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16616 m40792(C10671 c10671, C20871 c20871) throws C10186 {
        C12666 c12666 = c10671.f33858;
        boolean zEquals = "exact".equals(c12666.f40588);
        C13216 c13216 = this.f56505;
        if (zEquals) {
            C3717 c3717M47696 = c20871.m47696(c13216.m32740(), "dexClassSimpleName");
            if (c3717M47696 != null) {
                return m40790(c10671, c3717M47696);
            }
            C3717 c3717M47697 = c20871.m47696(c13216.m32734(), "dexClassSimpleName");
            if (c3717M47697 != null) {
                return m40790(c10671, c3717M47697);
            }
            C3717 c3717M47698 = c20871.m47696(c13216.m32735(), "dexClassName");
            if (c3717M47698 != null) {
                return m40790(c10671, c3717M47698);
            }
            C3717 c3717M47699 = c20871.m47696(c13216.m32737(), "dexClassName");
            if (c3717M47699 != null) {
                return m40790(c10671, c3717M47699);
            }
            C3717 c3717M476910 = c20871.m47696(c13216.m32741(), "dexClassName");
            if (c3717M476910 != null) {
                return m40790(c10671, c3717M476910);
            }
            C3717 c3717M476911 = c20871.m47696(c13216.m32750(), "dexClassName");
            if (c3717M476911 == null) {
                return null;
            }
            return m40790(c10671, c3717M476911);
        }
        if (c12666.f40590) {
            C3717 c3717M476912 = c20871.m47696(c13216.m32735(), "dexClassName");
            if (c3717M476912 != null) {
                return m40790(c10671, c3717M476912);
            }
            C3717 c3717M476913 = c20871.m47696(c13216.m32737(), "dexClassName");
            if (c3717M476913 != null) {
                return m40790(c10671, c3717M476913);
            }
            C3717 c3717M476914 = c20871.m47696(c13216.m32750(), "dexClassName");
            if (c3717M476914 != null) {
                return m40790(c10671, c3717M476914);
            }
            C3717 c3717M476915 = c20871.m47696(c13216.m32741(), "dexClassName");
            if (c3717M476915 == null) {
                return null;
            }
            return m40790(c10671, c3717M476915);
        }
        C3717 c3717M47695 = c20871.m47695(c13216.m32742(), c13216.m32744(), c13216.m32735());
        if (c3717M47695 != null) {
            return m40790(c10671, c3717M47695);
        }
        C3717 c3717M476916 = c20871.m47695(c13216.m32748(), c13216.m32738(), c13216.m32737());
        if (c3717M476916 != null) {
            return m40790(c10671, c3717M476916);
        }
        C3717 c3717M476917 = c20871.m47695(c13216.m32748(), c13216.m32738(), c13216.m32750());
        if (c3717M476917 != null) {
            return m40790(c10671, c3717M476917);
        }
        C3717 c3717M476918 = c20871.m47695(c13216.m32748(), c13216.m32738(), c13216.m32741());
        if (c3717M476918 == null) {
            return null;
        }
        return m40790(c10671, c3717M476918);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C16616 m40790(C10671 c10671, C3717 c3717) {
        if (c10671.f33865) {
            c3717.m12102();
        } else {
            c3717 = null;
        }
        return new C16616(this.f56505.m32746(), c3717);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m40791() {
        return this.f56505.m32746();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40794(C21860 c21860) {
        String str = c21860.f69690;
        if ("none".equals(str)) {
            return true;
        }
        String str2 = c21860.f69691;
        boolean zEquals = "descriptorExact".equals(str);
        C13216 c13216 = this.f56505;
        if (zEquals) {
            return str2 != null && c13216.m32736(str2);
        }
        return str2 == null || str2.isEmpty() || c13216.m32747(str2) || c13216.m32743(str2) || c13216.m32739(str2);
    }
}
