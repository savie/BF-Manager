package l;

import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

/* JADX INFO: renamed from: l.ܽۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79J1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16418 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final boolean f52807;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final TimeUnit f52808;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C4449 f52809;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final TimeUnit f52810;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public SecureRandom f52811;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public EnumSet f52812;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f52813;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f52814;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f52815;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C21356 f52816;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C4449 f52817;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f52818;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f52819;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public UUID f52820;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f52821;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f52822;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f52823;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f52824;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f52825;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f52826;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C3677 f52827;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C0109 f52828;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f52829;

    public /* synthetic */ C16418(int i) {
        this();
    }

    static {
        boolean z;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f52810 = timeUnit;
        f52808 = timeUnit;
        f52809 = new C4449();
        try {
            Class.forName("android.os.Build");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f52807 = z;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static C0189 m38649() {
        C0189 c0189 = new C0189();
        c0189.m1400(UUID.randomUUID());
        c0189.m1405(new C21356());
        c0189.m1402(new C3677());
        c0189.m1414();
        c0189.m1410(true);
        c0189.m1409();
        c0189.m1413(false);
        c0189.m1411();
        c0189.m1403(f52809);
        c0189.m1401(f52810);
        c0189.m1407(EnumC20508.SMB_3_1_1, EnumC20508.SMB_3_0_2, EnumC20508.SMB_3_0, EnumC20508.SMB_2_1, EnumC20508.SMB_2_0_2);
        ArrayList arrayList = new ArrayList();
        if (!f52807) {
            try {
                arrayList.add((InterfaceC20094) Class.forName("com.hierynomus.smbj.auth.SpnegoAuthenticator$Factory").getDeclaredConstructor(null).newInstance(null));
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                throw new C13865(e);
            }
        }
        arrayList.add(new C10774());
        c0189.m1399(arrayList);
        c0189.m1412(f52808);
        c0189.m1404(new C15713());
        c0189.m1406(false);
        c0189.m1397();
        return c0189;
    }

    public C16418() {
        this.f52812 = EnumSet.noneOf(EnumC20508.class);
        this.f52811 = new SecureRandom();
        this.f52822 = new ArrayList();
    }

    public C16418(C16418 c16418) {
        this();
        this.f52812.addAll(c16418.f52812);
        this.f52822.addAll(c16418.f52822);
        this.f52827 = c16418.f52827;
        this.f52811 = c16418.f52811;
        this.f52820 = c16418.f52820;
        this.f52829 = c16418.f52829;
        this.f52816 = c16418.f52816;
        this.f52821 = c16418.f52821;
        this.f52813 = c16418.f52813;
        this.f52818 = c16418.f52818;
        this.f52819 = c16418.f52819;
        this.f52824 = c16418.f52824;
        this.f52825 = c16418.f52825;
        this.f52817 = c16418.f52817;
        this.f52823 = c16418.f52823;
        this.f52826 = c16418.f52826;
        this.f52814 = c16418.f52814;
        this.f52815 = c16418.f52815;
        this.f52828 = c16418.f52828;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Random m38659() {
        return this.f52811;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C21356 m38658() {
        return this.f52816;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final EnumSet m38676() {
        return EnumSet.copyOf((Collection) this.f52812);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final UUID m38669() {
        return this.f52820;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList m38663() {
        return new ArrayList(this.f52822);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m38665() {
        return this.f52829;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m38673() {
        return this.f52815;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m38666() {
        return this.f52826;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m38662() {
        return this.f52821;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m38675() {
        return this.f52813;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m38672() {
        return this.f52818;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final long m38664() {
        return this.f52819;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m38670() {
        return this.f52824;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m38674() {
        return this.f52825;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C4449 m38671() {
        return this.f52817;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m38668() {
        return this.f52823;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final SocketFactory m38660() {
        return this.f52827;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C0109 m38667() {
        return this.f52828;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumSet m38661() {
        if (!EnumC20508.m46304(this.f52812)) {
            return EnumSet.noneOf(EnumC24036.class);
        }
        EnumSet enumSetOf = EnumSet.of(EnumC24036.SMB2_GLOBAL_CAP_LARGE_MTU);
        if (this.f52814) {
            enumSetOf.add(EnumC24036.SMB2_GLOBAL_CAP_ENCRYPTION);
        }
        return enumSetOf;
    }
}
