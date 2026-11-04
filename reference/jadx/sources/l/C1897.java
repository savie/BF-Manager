package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֫ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7AM */
/* JADX INFO: loaded from: classes2.dex */
public final class C1897 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final ReentrantLock f6382 = new ReentrantLock(true);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16812 f6383;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22584 f6384;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11591 f6385;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2883 f6386;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4485 f6387;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C10845 f6388;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C6338 f6389;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C20893 f6390;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8214 f6391;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C22034 f6392;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18282 f6393;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2446 f6394;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C21772 f6395;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6530(AbstractC22044 abstractC22044) throws C10186 {
        new C22209(C20015.m46048(), C20015.m46049()).m50230(abstractC22044);
        try {
            EnumC13093 enumC13093M6567 = abstractC22044.mo4298().mo8790().m6567();
            if (enumC13093M6567 == EnumC13093.MISSING) {
                throw C10186.m26300("PATH_NOT_FOUND", "Path does not exist");
            }
            if (enumC13093M6567 == EnumC13093.REGULAR) {
                return;
            }
            throw C10186.m26305("PATH_NOT_FILE", "APK source must be a regular file: " + enumC13093M6567.name());
        } catch (C22790 e) {
            throw C10186.m26300(e.m51409() == EnumC10855.PERMISSION_DENIED ? "FILE_ACCESS_DENIED" : "PATH_READ_FAILED", "Cannot access APK source: " + e.m51409().name());
        }
    }

    public C1897() {
        C20893 c20893 = new C20893();
        C22780 c22780 = new C22780();
        C7994 c7994 = new C7994();
        this.f6389 = new C6338(this);
        this.f6390 = c20893;
        C12777 c12777 = new C12777();
        C12887 c12887 = new C12887();
        C15473 c15473 = new C15473();
        C18282 c18282 = new C18282(c12887, c15473, c22780);
        this.f6393 = c18282;
        C22034 c22034 = new C22034(c20893, c22780);
        this.f6392 = c22034;
        C2446 c2446 = new C2446(c12887, c12777, new C6338(this));
        this.f6394 = c2446;
        c12887.m31929(c2446);
        this.f6383 = new C16812(c20893, c22780, c22034, c2446, c15473);
        this.f6386 = new C2883(c20893);
        this.f6388 = new C10845(c20893, c12887, c18282, c15473);
        this.f6385 = new C11591(c18282, c15473);
        this.f6395 = new C21772(c12887, c18282, c15473, c7994);
        this.f6391 = new C8214(c12887, c18282);
        this.f6387 = new C4485(c18282, c15473);
        AbstractC11810.m29655();
        this.f6384 = new C18086();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m6531(String str, String str2) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            return this.f6393.m42610(this.f6383.m39719(str), str2);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m6532(String str, String str2, String str3, InterfaceC13083 interfaceC13083) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            int iM42610 = this.f6393.m42610(this.f6383.m39719(str), str2);
            if (str3 != null) {
                C18326.m42760(str3, iM42610, str, str2);
            }
            return interfaceC13083.mo2836(iM42610);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m6533(String str, InterfaceC15320 interfaceC15320) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            return interfaceC15320.mo16829(this.f6383.m39719(str), this.f6393);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m6534(String str, InterfaceC19796 interfaceC19796) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            return interfaceC19796.mo5413(this.f6383.m39719(str), this.f6393);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m6535(C2642 c2642, String str) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            return m6518(this, c2642, str);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0231 m6536(C9353 c9353) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            return this.f6393.m42590(this.f6383.m39719(c9353.f30383), c9353);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3960 m6537(C19050 c19050, C4156 c4156) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            return m6519(this, c19050, c4156);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC4279 m6538(C2642 c2642, C4156 c4156) {
        AbstractC4279 abstractC4279M29124;
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            C11591 c11591 = this.f6385;
            C14069 c14069M39719 = this.f6383.m39719(c2642.f8446);
            if ("resource_item".equals(c2642.f8450.f43896)) {
                abstractC4279M29124 = c11591.m29126(c14069M39719, c2642);
            } else if ("hex".equals(c2642.f8448)) {
                abstractC4279M29124 = c11591.m29125(c14069M39719, c2642);
            } else {
                abstractC4279M29124 = c11591.m29124(c14069M39719, c2642, c4156);
            }
            return abstractC4279M29124;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6198 m6541(C7863 c7863, C4156 c4156) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            return this.f6393.m42594(this.f6383.m39719(c7863.f26192), c7863, c4156);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6198 m6542(C14574 c14574) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            return this.f6393.m42593(this.f6383.m39719(c14574.f45927));
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8434 m6543(C18304 c18304) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            return this.f6393.m42596(this.f6383.m39719(c18304.f59695), c18304);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9179 m6544(C7117 c7117) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            return this.f6385.m29123(this.f6383.m39719(c7117.f23459), c7117);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11417 m6546(C3388 c3388, String str) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            C14069 c14069M39719 = this.f6383.m39719(c3388.f11034);
            C18282 c18282 = this.f6393;
            String str2 = c3388.f11032;
            C11417 c11417M42150 = ((C18086) this.f6384).m42150(c14069M39719, c3388, c18282.m42602(c14069M39719, str2), str);
            c18282.m42604(c14069M39719, str2);
            return c11417M42150;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11942 m6547(C15146 c15146, C4156 c4156) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            return this.f6391.m22115(this.f6383.m39719(c15146.f49415), c15146, c4156);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12163 m6548(C4134 c4134) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            return m6523(this, c4134);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15892 m6549(C24272 c24272) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            return this.f6393.m42597(this.f6383.m39719(c24272.f78582), c24272);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16638 m6550(C20542 c20542) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            return m6524(this, c20542);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18876 m6551(C23526 c23526) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            return this.f6393.m42598(this.f6383.m39719(c23526.f76017), c23526);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20147 m6552(C10671 c10671, C4156 c4156) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            return this.f6395.m49366(this.f6383.m39719(c10671.f33859), c10671, c4156);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21114 m6553(C10099 c10099) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            return m6525(this, c10099);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22385 m6554(C4706 c4706, C4156 c4156) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            return this.f6387.m14195(this.f6383.m39719(c4706.f16609), c4706, c4156);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23352 m6555(C12337 c12337, C4156 c4156) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            return this.f6393.m42601(this.f6383.m39719(c12337.f39622), c12337, c4156);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m6558(String str) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            this.f6383.m39719(str);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22518 m6560(String str) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            return C15058.m36252(this.f6383.m39719(str).m34234());
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11196 m6561(String str) {
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            C14069 c14069M39719 = this.f6383.m39719(str);
            this.f6395.getClass();
            String str2 = c14069M39719.f44556;
            C11395 c11395 = c14069M39719.f44542;
            boolean z = c11395.f35855;
            boolean z2 = false;
            boolean z3 = z && c11395.f35857 > 0;
            if (z && c11395.f35858 > 0) {
                z2 = true;
            }
            return new C11196(str2, z3, z2, c14069M39719.f44541.f30674);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6527(C1897 c1897, C14069 c14069) {
        ReentrantLock reentrantLock = f6382;
        reentrantLock.lock();
        try {
            c1897.f6383.m39718(c14069);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9594 m6545() {
        C2883 c2883 = this.f6386;
        C17359.requireNonNull(c2883);
        ReentrantLock reentrantLock = f6382;
        C10801.m27511(reentrantLock);
        try {
            return c2883.m9499();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21114 m6525(C1897 c1897, C10099 c10099) throws C10186 {
        C20893 c20893 = c1897.f6390;
        C16812 c16812 = c1897.f6383;
        String str = c10099.f32352;
        if (str != null) {
            try {
                C16417 c16417M47751 = c20893.m47751(str);
                if (c16417M47751.f53275) {
                    throw C10186.m26304(JSON.array(), "TEMPORARY_WORKSPACE_REOPEN_UNSUPPORTED", "Temporary workspaces cannot be reopened. Open the APK path again instead.", "fatal");
                }
                C14069 c14069M39717 = c16812.m39717(c16417M47751.f53281);
                C17580.m41242(c14069M39717.f44547.f23607);
                return c1897.m6526(c14069M39717);
            } catch (C10186 e) {
                if ("WORKSPACE_NOT_FOUND".equals(e.f32601)) {
                    throw m6520(e);
                }
                throw e;
            }
        }
        String strM55860 = c10099.f32353;
        if (strM55860 == null && (strM55860 = C25040.m55860()) == null) {
            throw m6520(C10186.m26298(null, "CURRENT_APK_NOT_AVAILABLE", "Current APK is not available.", "warning"));
        }
        AbstractC22044 abstractC22044M35193 = C14584.m35193(C0470.m2304(strM55860, MotionUtils.EASING_TYPE_PATH), new String[0]);
        try {
            m6530(abstractC22044M35193);
            if (c10099.f32351) {
                try {
                    C16417 c16417M47752 = c20893.m47752(abstractC22044M35193);
                    if (c16417M47752 != null) {
                        try {
                            C14069 c14069M39718 = c16812.m39717(c16417M47752.f53281);
                            C17580.m41242(c14069M39718.f44547.f23607);
                            return c1897.m6526(c14069M39718);
                        } catch (C10186 e2) {
                            if (!"WORKSPACE_CORRUPT".equals(e2.f32601)) {
                                throw e2;
                            }
                            C14069 c14069M49821 = c1897.f6392.m49821(abstractC22044M35193, c10099.f32354);
                            c16812.m39712(c14069M49821);
                            c16812.m39715(c14069M49821.f44556);
                            C22099.m50062();
                            return c1897.m6526(c14069M49821);
                        }
                    }
                } catch (IOException e3) {
                    throw m6520(C10186.m26305("PATH_READ_FAILED", e3.getMessage() == null ? "Failed to read APK" : e3.getMessage()));
                }
            }
            try {
                C14069 c14069M49822 = c1897.f6392.m49821(abstractC22044M35193, c10099.f32354);
                c16812.m39712(c14069M49822);
                c16812.m39715(c14069M49822.f44556);
                C22099.m50062();
                return c1897.m6526(c14069M49822);
            } catch (C10186 e4) {
                if ("APK_OPEN_BLOCKED".equals(e4.f32601)) {
                    throw e4;
                }
                throw m6520(e4);
            }
        } catch (C10186 e5) {
            throw m6520(e5);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6529(C12359 c12359, Supplier supplier) {
        ReentrantLock reentrantLock = f6382;
        reentrantLock.lock();
        try {
            C1897 c1897 = (C1897) supplier.get();
            if (c1897 != null) {
                c1897.f6383.m39716(c12359.f39698);
            }
            new C6394().m18148(c12359);
            if (c1897 != null) {
                c1897.f6383.m39714(c12359.f39698);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6528(C5713 c5713) {
        ReentrantLock reentrantLock = f6382;
        reentrantLock.lock();
        try {
            ArrayList arrayListM18146 = new C6394().m18146();
            int size = arrayListM18146.size();
            int size2 = arrayListM18146.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                }
                AbstractC11810.m29655();
                if (size <= C9881.m25689()) {
                    break;
                }
                C12359 c12359 = (C12359) arrayListM18146.get(size2);
                try {
                    m6529(c12359, c5713);
                    size--;
                } catch (IOException e) {
                    C20653.m47272("MT MCP excess workspace delete failed, workspaceId=" + c12359.f39698, e);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16638 m6524(C1897 c1897, C20542 c20542) throws C10186 {
        String str = c20542.f65775;
        C16812 c16812 = c1897.f6383;
        try {
            C16417 c16417M47751 = c1897.f6390.m47751(str);
            AbstractC22044 abstractC22044 = c16417M47751.f53271;
            String str2 = c16417M47751.f53281;
            c16812.m39713(c16417M47751);
            c16812.m39716(str2);
            try {
                ((C1897) c1897.f6389.f21461).f6390.getClass();
                C20893.m47744(abstractC22044);
                if (abstractC22044.mo2934()) {
                    throw new IOException("Workspace directory still exists");
                }
                c16812.m39714(str2);
                C22099.m50062();
                return new C16638(str2, c16417M47751.f53275);
            } catch (IOException e) {
                throw m6521(C10186.m26304(JSON.array(), "WORKSPACE_CLOSE_FAILED", e.getMessage() == null ? "Failed to close workspace." : e.getMessage(), "warning"), str2, Boolean.valueOf(c16417M47751.f53275));
            }
        } catch (C10186 e2) {
            throw m6521(e2, str, (Boolean) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3960 m6519(C1897 c1897, C19050 c19050, C4156 c4156) throws C10186 {
        C10845 c10845 = c1897.f6388;
        C14069 c14069M39719 = c1897.f6383.m39719(c19050.f61740);
        String str = c19050.f61734;
        if ("dex_class_outline".equals(str)) {
            return c10845.m27573(c14069M39719, c19050, c4156);
        }
        if ("zip_entries".equals(str)) {
            return c10845.m27575(c14069M39719, c19050);
        }
        if ("dex_classes".equals(str)) {
            return c10845.m27572(c14069M39719, c19050);
        }
        if ("resource_table".equals(str)) {
            return c10845.m27574(c14069M39719, c19050);
        }
        if ("resource_table_variants".equals(str)) {
            return c10845.m27576(c14069M39719, c19050);
        }
        throw C10186.m26301("Unsupported view", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5977 m6540(C22606 c22606, OutputStream outputStream) throws C10186 {
        String str = c22606.f73063;
        try {
            ReentrantLock reentrantLock = f6382;
            C10801.m27511(reentrantLock);
            try {
                return this.f6393.m42592(this.f6383.m39719(str), c22606, outputStream);
            } finally {
                reentrantLock.unlock();
            }
        } catch (C10186 e) {
            throw m6522(e, str, c22606.f73062, c22606.f73064);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5977 m6539(C19622 c19622, InterfaceC5626 interfaceC5626) throws C10186 {
        String str = c19622.f63240;
        try {
            ReentrantLock reentrantLock = f6382;
            C10801.m27511(reentrantLock);
            try {
                return this.f6393.m42591(this.f6383.m39719(str), c19622, interfaceC5626);
            } finally {
                reentrantLock.unlock();
            }
        } catch (C10186 e) {
            throw m6522(e, str, c19622.f63237, c19622.f63239);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m6522(C10186 c10186, String str, String str2, String str3) {
        String str4 = c10186.f32601;
        if (!"EDIT_SESSION_STORAGE_FAILED".equals(str4)) {
            return c10186;
        }
        return C10186.m26306(str4, "Edit session storage failed.", c10186.f32604, JSON.array(), JSON.object().add("workspaceId", str).add("editSessionId", str2 == null ? JSON.NULL : JSON.value(str2)).add("entryName", str3).add("backendReason", c10186.f32602.getString("backendReason", "workspace_storage_failure")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12163 m6523(C1897 c1897, C4134 c4134) {
        C18282 c18282 = c1897.f6393;
        C16812 c16812 = c1897.f6383;
        String str = c4134.f14027;
        String str2 = c4134.f14026;
        C14069 c14069M39719 = c16812.m39719(str);
        if (!c4134.f14028) {
            C6198 c6198M42607 = c18282.m42607(c14069M39719, str2);
            String str3 = c6198M42607.f21100;
            String str4 = c6198M42607.f21099;
            c18282.m42610(c14069M39719, str2);
            int i = c6198M42607.f21104;
            int i2 = c6198M42607.f21105;
            ArrayList arrayList = new ArrayList(c6198M42607.f21101);
            new ArrayList();
            return new C12163(str3, str4, false, i, i2, arrayList, "not_run", new ArrayList(), 0, 0, new ArrayList(), new ArrayList(), new ArrayList());
        }
        return ((C18086) c1897.f6384).m42151(c14069M39719, c18282.m42602(c14069M39719, str2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m6518(C1897 c1897, C2642 c2642, String str) throws C10186 {
        C14069 c14069M39719 = c1897.f6383.m39719(c2642.f8446);
        C4156 c4156 = new C4156();
        C13828 c13828 = c2642.f8450;
        String strM10507 = C3192.m10507(c13828.f43891);
        C18282 c18282 = c1897.f6393;
        String str2 = c2642.f8440;
        for (C23330 c23330 : c18282.m42589(c14069M39719, str2, true, c4156)) {
            if (strM10507.equals(c23330.f75565)) {
                try {
                    return C20346.m46737(c18282.m42600(c14069M39719, str2, c23330, c4156), c14069M39719.m34233(c23330.f75564), c13828.f43894, str);
                } catch (OutOfMemoryError unused) {
                    throw C18723.m43530();
                }
            }
        }
        throw C18723.m43532(c14069M39719.f44556, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6556(String str) {
        ReentrantLock reentrantLock = f6382;
        try {
            C10801.m27511(reentrantLock);
            try {
                C14069 c14069M39711 = this.f6383.m39711(str);
                if (c14069M39711 != null && !c14069M39711.f44555 && !c14069M39711.f44531) {
                    this.f6394.m8264(c14069M39711);
                }
            } finally {
                reentrantLock.unlock();
            }
        } catch (Exception e) {
            C20653.m47272("MT MCP smali cache activation failed, workspaceId=" + str, e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC18854 m6559() {
        return this.f6394.m8263();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m6557() {
        this.f6394.m8267();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m6521(C10186 c10186, String str, Boolean bool) {
        return C10186.m26306(c10186.f32601, c10186.getMessage(), c10186.f32604, JSON.array(), new JSONObject(c10186.f32602).put("workspaceId", str).put("temporary", bool == null ? JSON.NULL : JSON.value(bool.booleanValue())));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m6520(C10186 c10186) {
        JSONArray jSONArray = c10186.f32599;
        JSONObject jSONObject = c10186.f32602;
        String str = c10186.f32604;
        String str2 = c10186.f32601;
        JSONArray jSONArray2 = new JSONArray(jSONArray);
        jSONArray2.add(C2729.m9064(JSON.object().add("prefix", "").add("limit", 50), "mt_apk_list_available_apks", "inspect", "List APK targets that mt_apk_workspace_open can open"));
        if (c10186.f32600) {
            return C10186.m26302(str2, c10186.getMessage(), str, jSONArray2, jSONObject);
        }
        return C10186.m26306(str2, c10186.getMessage(), str, jSONArray2, jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21114 m6526(C14069 c14069) {
        String str = c14069.f44556;
        boolean z = c14069.f44531;
        String strSubstring = c14069.f44548;
        if (strSubstring == null || strSubstring.isEmpty() || strSubstring.endsWith("/")) {
            strSubstring = null;
        } else {
            int iLastIndexOf = strSubstring.lastIndexOf(47);
            if (iLastIndexOf >= 0) {
                strSubstring = strSubstring.substring(iLastIndexOf + 1);
            }
        }
        String str2 = strSubstring;
        AbstractC22044 abstractC22044M34234 = c14069.m34234();
        this.f6392.getClass();
        try {
            InputStream inputStreamMo4290 = abstractC22044M34234.mo4290();
            try {
                int i = 65536;
                C9982 c9982 = new C9982(65536);
                byte[] bArr = new byte[8192];
                while (i > 0) {
                    int i2 = inputStreamMo4290.read(bArr, 0, Math.min(8192, i));
                    if (i2 == -1) {
                        break;
                    }
                    c9982.write(bArr, 0, i2);
                    i -= i2;
                }
                byte[] bArr2 = c9982.f32079;
                int i3 = c9982.f32081;
                MessageDigest messageDigestM36179 = C15022.m36179();
                messageDigestM36179.update(bArr2, 0, i3);
                C15022.m36182(messageDigestM36179.digest());
                if (inputStreamMo4290 != null) {
                    inputStreamMo4290.close();
                }
            } catch (Throwable th) {
                if (inputStreamMo4290 != null) {
                    try {
                        inputStreamMo4290.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception unused) {
        }
        ArrayList arrayList = c14069.f44532;
        ArrayList arrayList2 = c14069.f44549;
        C7139 c7139 = c14069.f44547;
        C11395 c11395 = c14069.f44542;
        C9462 c9462 = c14069.f44541;
        Iterator it = arrayList.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (((C19291) it.next()).f62362.toLowerCase(Locale.ROOT).endsWith(".xml")) {
                i4++;
            }
        }
        C11395 c11396 = c14069.f44542;
        boolean z2 = c11396.f35855;
        return new C21114(str, z, str2, arrayList, arrayList2, c7139, c11395, c9462, i4, z2 && c11396.f35857 > 0, z2 && c11396.f35858 > 0, C15058.m36252(c14069.m34234()));
    }
}
