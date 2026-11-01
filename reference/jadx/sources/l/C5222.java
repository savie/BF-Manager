package l;

import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import java.io.IOException;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ۚ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01UY */
/* JADX INFO: loaded from: classes2.dex */
public final class C5222 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C13690 f18113 = new C13690();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C2399 f18114;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f18115;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C2399 f18116;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13690 f18117;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14405(C2399 c2399) {
        this.f18116 = c2399;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2399 m14407() {
        return this.f18116;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14404() {
        this.f18115 = true;
    }

    public C5222(C2399 c2399) {
        this();
        this.f18116 = c2399;
        this.f18115 = true;
    }

    public C5222() {
        this.f18117 = f18113;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC11573 m14403(AbstractC20745 abstractC20745) {
        this.f18116 = null;
        if (abstractC20745.mo36912()) {
            try {
                C13690 c13690 = this.f18117;
                String strMo33986 = abstractC20745.mo33986();
                c13690.getClass();
                StructStat structStatStat = Os.stat(strMo33986);
                this.f18116 = new C2399(structStatStat.st_mode & 4095, structStatStat.st_uid, structStatStat.st_gid);
                return EnumC11573.SUCCESS;
            } catch (ErrnoException | SecurityException unused) {
                return EnumC11573.FAILED;
            }
        }
        if (abstractC20745 instanceof C17589) {
            C17589 c17589Mo40898 = abstractC20745.mo40898();
            if (!c17589Mo40898.m40912()) {
                return EnumC11573.FAILED;
            }
            C12651 c12651M40901 = c17589Mo40898.m40901();
            this.f18116 = new C2399(c12651M40901.m31444(), c12651M40901.m31447(), c12651M40901.m31443());
            return EnumC11573.SUCCESS;
        }
        C14042 c14042M14401 = m14401(abstractC20745);
        if (c14042M14401 == null || !C19812.m45045().mo43869()) {
            return EnumC11573.UNAVAILABLE;
        }
        C5574 c5574Mo24649 = c14042M14401.mo24649();
        if (c5574Mo24649 == null) {
            try {
                c5574Mo24649 = C0055.m951(c14042M14401.mo33986());
            } catch (IOException unused2) {
                return EnumC11573.FAILED;
            }
        }
        this.f18116 = new C2399(c5574Mo24649);
        return EnumC11573.SUCCESS;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC11573 m14406(AbstractC20745 abstractC20745) {
        boolean z;
        boolean z2;
        C13690 c13690 = this.f18117;
        C2399 c2399 = this.f18116;
        if (c2399 == null) {
            return EnumC11573.UNAVAILABLE;
        }
        int i = c2399.f9656;
        int i2 = c2399.f9655;
        boolean z3 = true;
        if (!abstractC20745.mo36912()) {
            if (abstractC20745 instanceof C17589) {
                if (abstractC20745.mo40898().m40905(c2399.f9657)) {
                    return (i == -1 && i2 == -1) ? EnumC11573.SUCCESS : EnumC11573.PARTIAL;
                }
                return EnumC11573.FAILED;
            }
            C14042 c14042M14401 = m14401(abstractC20745);
            if (c14042M14401 == null || !C19812.m45045().mo43869()) {
                return EnumC11573.UNAVAILABLE;
            }
            String strMo33986 = c14042M14401.mo33986();
            if (i == -1 || i2 == -1) {
                z2 = i == -1 && i2 == -1;
            } else {
                if (!abstractC20745.mo33979() || !abstractC20745.mo33969().m33967()) {
                    try {
                        C0055.m952(strMo33986, i, i2, false, false);
                    } catch (IOException unused) {
                    }
                }
            }
            try {
                C0055.m953(strMo33986, c2399.f9657, false, false);
            } catch (IOException unused2) {
                z3 = false;
            }
            if (z3 && z2) {
                return EnumC11573.SUCCESS;
            }
            return (z3 || z2) ? EnumC11573.PARTIAL : EnumC11573.FAILED;
        }
        try {
            String strMo33987 = abstractC20745.mo33986();
            c13690.getClass();
            StructStat structStatStat = Os.stat(strMo33987);
            int i3 = structStatStat.st_mode & 4095;
            boolean z4 = (structStatStat.st_uid == i && structStatStat.st_gid == i2) ? false : true;
            if (z4) {
                try {
                    String strMo33988 = abstractC20745.mo33986();
                    c13690.getClass();
                    Os.chown(strMo33988, i, i2);
                } catch (ErrnoException | SecurityException unused3) {
                    z = false;
                }
            }
            z = true;
            if (z4 || i3 != c2399.f9657) {
                try {
                    String strMo33989 = abstractC20745.mo33986();
                    int i4 = c2399.f9657;
                    c13690.getClass();
                    Os.chmod(strMo33989, i4);
                } catch (ErrnoException | SecurityException unused4) {
                    z3 = false;
                }
            }
            if (z3 && z) {
                return EnumC11573.SUCCESS;
            }
            return (z3 || z) ? EnumC11573.PARTIAL : EnumC11573.FAILED;
        } catch (ErrnoException | SecurityException unused5) {
            return EnumC11573.FAILED;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C14042 m14401(AbstractC20745 abstractC20745) {
        if (abstractC20745.mo33979()) {
            return abstractC20745.mo33969();
        }
        if (Build.VERSION.SDK_INT < 30 || !(abstractC20745 instanceof C17196)) {
            return null;
        }
        return abstractC20745.mo40129().m40125();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m14408(AbstractC20745 abstractC20745) {
        C14042 c14042M40125;
        if (this.f18115) {
            return;
        }
        C5574 c5574Mo24649 = null;
        this.f18116 = null;
        if (abstractC20745.mo46731()) {
            if (abstractC20745 instanceof C17589) {
                C17589 c17589Mo40898 = abstractC20745.mo40898();
                if (c17589Mo40898.m40912()) {
                    C12651 c12651M40901 = c17589Mo40898.m40901();
                    this.f18116 = new C2399(c12651M40901.m31444(), c12651M40901.m31447(), c12651M40901.m31443());
                    return;
                }
                return;
            }
            return;
        }
        if (C19812.m45045().mo43869()) {
            boolean z = false;
            if (abstractC20745.mo33979()) {
                c5574Mo24649 = abstractC20745.mo33969().mo24649();
            } else if ((abstractC20745 instanceof C17196) && (c14042M40125 = abstractC20745.mo40129().m40125()) != null) {
                c5574Mo24649 = c14042M40125.mo24649();
                if (c5574Mo24649 == null) {
                    try {
                        c5574Mo24649 = C0055.m951(c14042M40125.mo33986());
                    } catch (IOException unused) {
                    }
                }
            } else if (abstractC20745.mo36912() && abstractC20745.mo35233() && C5553.m15304(abstractC20745.mo33986())) {
                C2399 c2399 = f18114;
                if (c2399 != null) {
                    this.f18116 = c2399;
                    return;
                }
                z = true;
            }
            if (c5574Mo24649 == null) {
                try {
                    c5574Mo24649 = C0055.m951(abstractC20745.mo33986());
                } catch (IOException unused2) {
                }
            }
            if (c5574Mo24649 != null) {
                C2399 c23910 = new C2399(c5574Mo24649);
                this.f18116 = c23910;
                if (z) {
                    c23910.f9657 = SecP521R1Field.P16;
                    f18114 = c23910;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m14402(AbstractC20745 abstractC20745) {
        C2399 c2399;
        C14042 c14042M40125;
        if (!(abstractC20745.mo33979() || (abstractC20745 instanceof C17589) || ((abstractC20745 instanceof C17196) && C19812.m45045().mo43869())) || (c2399 = this.f18116) == null) {
            return;
        }
        int i = c2399.f9655;
        int i2 = c2399.f9656;
        if (abstractC20745 instanceof C17589) {
            abstractC20745.mo40898().m40905(c2399.f9657);
            return;
        }
        if (C19812.m45045().mo43869()) {
            String strMo33986 = (!(abstractC20745 instanceof C17196) || (c14042M40125 = abstractC20745.mo40129().m40125()) == null) ? abstractC20745.mo33986() : c14042M40125.mo33986();
            try {
                C0055.m953(strMo33986, c2399.f9657, false, false);
            } catch (IOException unused) {
            }
            if (i2 == -1 || i == -1) {
                return;
            }
            if (abstractC20745.mo33979() && abstractC20745.mo33969().m33967()) {
                return;
            }
            try {
                C0055.m952(strMo33986, i2, i, false, false);
            } catch (IOException unused2) {
            }
        }
    }
}
