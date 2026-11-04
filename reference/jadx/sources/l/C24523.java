package l;

import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import java.io.IOException;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.᩺᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01UY */
/* JADX INFO: loaded from: classes.dex */
public final class C24523 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C6623 f79523;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C20793 f79524 = new C20793();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f79525;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C6623 f79526;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20793 f79527;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54793(C6623 c6623) {
        this.f79526 = c6623;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6623 m54795() {
        return this.f79526;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54792() {
        this.f79525 = true;
    }

    public C24523(C6623 c6623) {
        this();
        this.f79526 = c6623;
        this.f79525 = true;
    }

    public C24523() {
        this.f79527 = f79524;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC12588 m54791(AbstractC22044 abstractC22044) {
        this.f79526 = null;
        if (abstractC22044.mo4295()) {
            try {
                C20793 c20793 = this.f79527;
                String strMo4294 = abstractC22044.mo4294();
                c20793.getClass();
                StructStat structStatStat = Os.stat(strMo4294);
                this.f79526 = new C6623(structStatStat.st_mode & 4095, structStatStat.st_uid, structStatStat.st_gid);
                return EnumC12588.SUCCESS;
            } catch (ErrnoException | SecurityException unused) {
                return EnumC12588.FAILED;
            }
        }
        if (abstractC22044 instanceof C0678) {
            C0678 c0678Mo2948 = abstractC22044.mo2948();
            if (!c0678Mo2948.m2950()) {
                return EnumC12588.FAILED;
            }
            C18577 c18577M2947 = c0678Mo2948.m2947();
            this.f79526 = new C6623(c18577M2947.m43155(), c18577M2947.m43154(), c18577M2947.m43152());
            return EnumC12588.SUCCESS;
        }
        C7302 c7302M54790 = m54790(abstractC22044);
        if (c7302M54790 == null || !C4013.m12986().mo29537()) {
            return EnumC12588.UNAVAILABLE;
        }
        C21694 c21694Mo15567 = c7302M54790.mo15567();
        if (c21694Mo15567 == null) {
            try {
                c21694Mo15567 = C14453.m34906(c7302M54790.mo4294());
            } catch (IOException unused2) {
                return EnumC12588.FAILED;
            }
        }
        this.f79526 = new C6623(c21694Mo15567);
        return EnumC12588.SUCCESS;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC12588 m54794(AbstractC22044 abstractC22044) {
        boolean z;
        boolean z2;
        C20793 c20793 = this.f79527;
        C6623 c6623 = this.f79526;
        if (c6623 == null) {
            return EnumC12588.UNAVAILABLE;
        }
        int i = c6623.f22122;
        int i2 = c6623.f22121;
        boolean z3 = true;
        if (!abstractC22044.mo4295()) {
            if (abstractC22044 instanceof C0678) {
                if (abstractC22044.mo2948().m2941(c6623.f22123)) {
                    return (i == -1 && i2 == -1) ? EnumC12588.SUCCESS : EnumC12588.PARTIAL;
                }
                return EnumC12588.FAILED;
            }
            C7302 c7302M54790 = m54790(abstractC22044);
            if (c7302M54790 == null || !C4013.m12986().mo29537()) {
                return EnumC12588.UNAVAILABLE;
            }
            String strMo4294 = c7302M54790.mo4294();
            if (i == -1 || i2 == -1) {
                z2 = i == -1 && i2 == -1;
            } else {
                if (!abstractC22044.mo19981() || !abstractC22044.mo19983().m19980()) {
                    try {
                        C14453.m34907(strMo4294, i, i2, false, false);
                    } catch (IOException unused) {
                    }
                }
            }
            try {
                C14453.m34908(strMo4294, c6623.f22123, false, false);
            } catch (IOException unused2) {
                z3 = false;
            }
            if (z3 && z2) {
                return EnumC12588.SUCCESS;
            }
            return (z3 || z2) ? EnumC12588.PARTIAL : EnumC12588.FAILED;
        }
        try {
            String strMo4295 = abstractC22044.mo4294();
            c20793.getClass();
            StructStat structStatStat = Os.stat(strMo4295);
            int i3 = structStatStat.st_mode & 4095;
            boolean z4 = (structStatStat.st_uid == i && structStatStat.st_gid == i2) ? false : true;
            if (z4) {
                try {
                    String strMo4296 = abstractC22044.mo4294();
                    c20793.getClass();
                    Os.chown(strMo4296, i, i2);
                } catch (ErrnoException | SecurityException unused3) {
                    z = false;
                }
            }
            z = true;
            if (z4 || i3 != c6623.f22123) {
                try {
                    String strMo4297 = abstractC22044.mo4294();
                    int i4 = c6623.f22123;
                    c20793.getClass();
                    Os.chmod(strMo4297, i4);
                } catch (ErrnoException | SecurityException unused4) {
                    z3 = false;
                }
            }
            if (z3 && z) {
                return EnumC12588.SUCCESS;
            }
            return (z3 || z) ? EnumC12588.PARTIAL : EnumC12588.FAILED;
        } catch (ErrnoException | SecurityException unused5) {
            return EnumC12588.FAILED;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C7302 m54790(AbstractC22044 abstractC22044) {
        if (abstractC22044.mo19981()) {
            return abstractC22044.mo19983();
        }
        if (Build.VERSION.SDK_INT < 30 || !(abstractC22044 instanceof C18379)) {
            return null;
        }
        return abstractC22044.mo42890().m42889();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54796(AbstractC22044 abstractC22044) {
        C7302 c7302M42889;
        if (this.f79525) {
            return;
        }
        C21694 c21694Mo15567 = null;
        this.f79526 = null;
        if (abstractC22044.mo7468()) {
            if (abstractC22044 instanceof C0678) {
                C0678 c0678Mo2948 = abstractC22044.mo2948();
                if (c0678Mo2948.m2950()) {
                    C18577 c18577M2947 = c0678Mo2948.m2947();
                    this.f79526 = new C6623(c18577M2947.m43155(), c18577M2947.m43154(), c18577M2947.m43152());
                    return;
                }
                return;
            }
            return;
        }
        if (C4013.m12986().mo29537()) {
            boolean z = false;
            if (abstractC22044.mo19981()) {
                c21694Mo15567 = abstractC22044.mo19983().mo15567();
            } else if ((abstractC22044 instanceof C18379) && (c7302M42889 = abstractC22044.mo42890().m42889()) != null) {
                c21694Mo15567 = c7302M42889.mo15567();
                if (c21694Mo15567 == null) {
                    try {
                        c21694Mo15567 = C14453.m34906(c7302M42889.mo4294());
                    } catch (IOException unused) {
                    }
                }
            } else if (abstractC22044.mo4295() && abstractC22044.mo4292() && C14584.m35214(abstractC22044.mo4294())) {
                C6623 c6623 = f79523;
                if (c6623 != null) {
                    this.f79526 = c6623;
                    return;
                }
                z = true;
            }
            if (c21694Mo15567 == null) {
                try {
                    c21694Mo15567 = C14453.m34906(abstractC22044.mo4294());
                } catch (IOException unused2) {
                }
            }
            if (c21694Mo15567 != null) {
                C6623 c6624 = new C6623(c21694Mo15567);
                this.f79526 = c6624;
                if (z) {
                    c6624.f22123 = SecP521R1Field.P16;
                    f79523 = c6624;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m54797(AbstractC22044 abstractC22044) {
        C6623 c6623;
        C7302 c7302M42889;
        if (!(abstractC22044.mo19981() || (abstractC22044 instanceof C0678) || ((abstractC22044 instanceof C18379) && C4013.m12986().mo29537())) || (c6623 = this.f79526) == null) {
            return;
        }
        int i = c6623.f22121;
        int i2 = c6623.f22122;
        if (abstractC22044 instanceof C0678) {
            abstractC22044.mo2948().m2941(c6623.f22123);
            return;
        }
        if (C4013.m12986().mo29537()) {
            String strMo4294 = (!(abstractC22044 instanceof C18379) || (c7302M42889 = abstractC22044.mo42890().m42889()) == null) ? abstractC22044.mo4294() : c7302M42889.mo4294();
            try {
                C14453.m34908(strMo4294, c6623.f22123, false, false);
            } catch (IOException unused) {
            }
            if (i2 == -1 || i == -1) {
                return;
            }
            if (abstractC22044.mo19981() && abstractC22044.mo19983().m19980()) {
                return;
            }
            try {
                C14453.m34907(strMo4294, i2, i, false, false);
            } catch (IOException unused2) {
            }
        }
    }
}
