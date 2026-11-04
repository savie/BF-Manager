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

/* JADX INFO: renamed from: l.۫ۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79J1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12828 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final TimeUnit f41074;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final TimeUnit f41075;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C1112 f41076;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final boolean f41077;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f41078;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C1112 f41079;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f41080;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f41081;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f41082;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public UUID f41083;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C9689 f41084;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f41085;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public SecureRandom f41086;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C13243 f41087;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f41088;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f41089;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C0521 f41090;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f41091;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f41092;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f41093;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumSet f41094;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f41095;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f41096;

    public /* synthetic */ C12828(int i) {
        this();
    }

    static {
        boolean z;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f41074 = timeUnit;
        f41075 = timeUnit;
        f41076 = new C1112();
        try {
            Class.forName("android.os.Build");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f41077 = z;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static C15065 m31815() {
        C15065 c15065 = new C15065();
        c15065.m36298(UUID.randomUUID());
        c15065.m36302(new C9689());
        c15065.m36300(new C0521());
        c15065.m36308();
        c15065.m36307(true);
        c15065.m36306();
        c15065.m36312(false);
        c15065.m36310();
        c15065.m36301(f41076);
        c15065.m36299(f41074);
        c15065.m36305(EnumC15700.SMB_3_1_1, EnumC15700.SMB_3_0_2, EnumC15700.SMB_3_0, EnumC15700.SMB_2_1, EnumC15700.SMB_2_0_2);
        ArrayList arrayList = new ArrayList();
        if (!f41077) {
            try {
                arrayList.add((InterfaceC19912) Class.forName("com.hierynomus.smbj.auth.SpnegoAuthenticator$Factory").getDeclaredConstructor(null).newInstance(null));
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                throw new C12082(e);
            }
        }
        arrayList.add(new C24763());
        c15065.m36297(arrayList);
        c15065.m36311(f41075);
        c15065.m36303(new C22525());
        c15065.m36304(false);
        c15065.m36313();
        return c15065;
    }

    public C12828() {
        this.f41094 = EnumSet.noneOf(EnumC15700.class);
        this.f41086 = new SecureRandom();
        this.f41093 = new ArrayList();
    }

    public C12828(C12828 c12828) {
        this();
        this.f41094.addAll(c12828.f41094);
        this.f41093.addAll(c12828.f41093);
        this.f41090 = c12828.f41090;
        this.f41086 = c12828.f41086;
        this.f41083 = c12828.f41083;
        this.f41096 = c12828.f41096;
        this.f41084 = c12828.f41084;
        this.f41081 = c12828.f41081;
        this.f41078 = c12828.f41078;
        this.f41085 = c12828.f41085;
        this.f41082 = c12828.f41082;
        this.f41088 = c12828.f41088;
        this.f41095 = c12828.f41095;
        this.f41079 = c12828.f41079;
        this.f41089 = c12828.f41089;
        this.f41092 = c12828.f41092;
        this.f41080 = c12828.f41080;
        this.f41091 = c12828.f41091;
        this.f41087 = c12828.f41087;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Random m31832() {
        return this.f41086;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C9689 m31824() {
        return this.f41084;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EnumSet m31834() {
        return EnumSet.copyOf((Collection) this.f41094);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final UUID m31831() {
        return this.f41083;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList m31822() {
        return new ArrayList(this.f41093);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m31823() {
        return this.f41096;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m31830() {
        return this.f41091;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m31820() {
        return this.f41092;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m31829() {
        return this.f41081;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m31825() {
        return this.f41078;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m31833() {
        return this.f41085;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long m31817() {
        return this.f41082;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m31827() {
        return this.f41088;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m31828() {
        return this.f41095;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C1112 m31826() {
        return this.f41079;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m31819() {
        return this.f41089;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SocketFactory m31816() {
        return this.f41090;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C13243 m31821() {
        return this.f41087;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumSet m31818() {
        if (!EnumC15700.m37474(this.f41094)) {
            return EnumSet.noneOf(EnumC17938.class);
        }
        EnumSet enumSetOf = EnumSet.of(EnumC17938.SMB2_GLOBAL_CAP_LARGE_MTU);
        if (this.f41080) {
            enumSetOf.add(EnumC17938.SMB2_GLOBAL_CAP_ENCRYPTION);
        }
        return enumSetOf;
    }
}
