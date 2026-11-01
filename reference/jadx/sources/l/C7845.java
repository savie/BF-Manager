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

/* JADX INFO: renamed from: l.۠֨۬, reason: contains not printable characters */
/* JADX INFO: compiled from: J7AM */
/* JADX INFO: loaded from: classes3.dex */
public final class C7845 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final ReentrantLock f25790 = new ReentrantLock(true);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C3610 f25791;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7149 f25792;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C8551 f25793;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11050 f25794;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C12784 f25795;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C0165 f25796;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11373 f25797;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C19134 f25798;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14952 f25799;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C7221 f25800;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10750 f25801;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C22662 f25802;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C8675 f25803;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20695(AbstractC20745 abstractC20745) throws C12731 {
        try {
            EnumC12279 enumC12279M16196 = abstractC20745.mo33989().mo8394().m16196();
            if (enumC12279M16196 == EnumC12279.MISSING) {
                throw C12731.m31625("PATH_NOT_FOUND", "Path does not exist");
            }
            if (enumC12279M16196 == EnumC12279.REGULAR) {
                return;
            }
            throw C12731.m31630("PATH_NOT_FILE", "APK source must be a regular file: " + enumC12279M16196.name());
        } catch (C20040 e) {
            throw C12731.m31625(e.m45399() == EnumC15807.PERMISSION_DENIED ? "FILE_ACCESS_DENIED" : "PATH_READ_FAILED", "Cannot access APK source: " + e.m45399().name());
        }
    }

    public C7845() {
        C7221 c7221 = new C7221();
        C6433 c6433 = new C6433();
        C18094 c18094 = new C18094();
        this.f25802 = new C22662(this);
        this.f25800 = c7221;
        C22851 c22851 = new C22851();
        C14578 c14578 = new C14578();
        C11040 c11040 = new C11040();
        C14952 c14952 = new C14952(c14578, c11040, c6433);
        this.f25799 = c14952;
        C12784 c12784 = new C12784(c7221, c6433);
        this.f25795 = c12784;
        C7149 c7149 = new C7149(c14578, c22851, new C22662(this));
        this.f25792 = c7149;
        c14578.m35050(c7149);
        this.f25793 = new C8551(c7221, c6433, c12784, c7149, c11040);
        this.f25797 = new C11373(c7221);
        this.f25791 = new C3610(c7221, c14578, c14952, c11040);
        this.f25798 = new C19134(c14952, c11040);
        this.f25803 = new C8675(c14578, c14952, c11040, c18094);
        this.f25801 = new C10750(c14578, c14952);
        this.f25796 = new C0165(c14952, c11040);
        C2664.m8195();
        this.f25794 = new C10282();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C22038 m20696(String str) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            C21956 c21956M22306 = this.f25793.m22306(str);
            this.f25803.getClass();
            String str2 = c21956M22306.f71244;
            C3287 c3287 = c21956M22306.f71220;
            boolean z = c3287.f12188;
            boolean z2 = false;
            boolean z3 = z && c3287.f12190 > 0;
            if (z && c3287.f12187 > 0) {
                z2 = true;
            }
            return new C22038(str2, z3, z2, c21956M22306.f71228.f58847);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m20697(String str, String str2) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            return this.f25799.m35888(this.f25793.m22306(str), str2);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m20698(String str, String str2, String str3, InterfaceC17722 interfaceC17722) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            int iM35888 = this.f25799.m35888(this.f25793.m22306(str), str2);
            if (str3 != null) {
                C18810.m43393(str3, iM35888, str, str2);
            }
            return interfaceC17722.mo7418(iM35888);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m20699(String str, InterfaceC14901 interfaceC14901) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            return interfaceC14901.mo14279(this.f25793.m22306(str), this.f25799);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m20700(String str, InterfaceC21250 interfaceC21250) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            return interfaceC21250.mo33699(this.f25793.m22306(str), this.f25799);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0434 m20701(C14196 c14196, C15283 c15283) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            return m20684(this, c14196, c15283);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4398 m20702(C5728 c5728) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            return this.f25799.m35871(this.f25793.m22306(c5728.f19493), c5728);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5104 m20703(C5373 c5373, C15283 c15283) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            return this.f25796.m1319(this.f25793.m22306(c5373.f18570), c5373, c15283);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6079 m20704(C2905 c2905) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            return this.f25799.m35873(this.f25793.m22306(c2905.f10947), c2905);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8196 m20705(C19840 c19840) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            return m20685(this, c19840);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8902 m20706(C0083 c0083, C15283 c15283) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            return this.f25799.m35876(this.f25793.m22306(c0083.f990), c0083, c15283);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9608 m20707(C11724 c11724) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            return this.f25798.m43958(this.f25793.m22306(c11724.f39411), c11724);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12430 m20708(C1494 c1494) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            return m20686(this, c1494);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12866 m20709(C1139 c1139, C15283 c15283) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            return this.f25803.m22489(this.f25793.m22306(c1139.f5123), c1139, c15283);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15958 m20711(C12079 c12079) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            return this.f25799.m35877(this.f25793.m22306(c12079.f40422));
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15958 m20712(C23368 c23368, C15283 c15283) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            return this.f25799.m35878(this.f25793.m22306(c23368.f75699), c23368, c15283);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18073 m20713(C15607 c15607, String str) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            C21956 c21956M22306 = this.f25793.m22306(c15607.f50744);
            C14952 c14952 = this.f25799;
            String str2 = c15607.f50743;
            C18073 c18073M26093 = ((C10282) this.f25794).m26093(c21956M22306, c15607, c14952.m35879(c21956M22306, str2), str);
            c14952.m35887(c21956M22306, str2);
            return c18073M26093;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20896 m20714(C16312 c16312) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            return m20691(this, c16312);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21332 m20715(C6784 c6784, C15283 c15283) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            return this.f25801.m27050(this.f25793.m22306(c6784.f22906), c6784, c15283);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC21803 m20716(C4667 c4667, C15283 c15283) {
        AbstractC21803 abstractC21803M43957;
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            C19134 c19134 = this.f25798;
            C21956 c21956M22306 = this.f25793.m22306(c4667.f16494);
            if ("resource_item".equals(c4667.f16496.f10096)) {
                abstractC21803M43957 = c19134.m43960(c21956M22306, c4667);
            } else if ("hex".equals(c4667.f16493)) {
                abstractC21803M43957 = c19134.m43959(c21956M22306, c4667);
            } else {
                abstractC21803M43957 = c19134.m43957(c21956M22306, c4667, c15283);
            }
            return abstractC21803M43957;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23719 m20719(C20545 c20545) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            return this.f25799.m35882(this.f25793.m22306(c20545.f66540), c20545);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m20722(String str) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            this.f25793.m22306(str);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7263 m20723(String str) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            return C15731.m37452(this.f25793.m22306(str).m48787());
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20694(C7845 c7845, C21956 c21956) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            c7845.f25793.m22312(c21956);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13490 m20710() {
        C11373 c11373 = this.f25797;
        C13638.requireNonNull(c11373);
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            return c11373.m28478();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12430 m20686(C7845 c7845, C1494 c1494) throws C12731 {
        C7221 c7221 = c7845.f25800;
        C8551 c8551 = c7845.f25793;
        String str = c1494.f6030;
        if (str != null) {
            try {
                C19216 c19216M19201 = c7221.m19201(str);
                if (c19216M19201.f62065) {
                    throw C12731.m31629(JSON.array(), "TEMPORARY_WORKSPACE_REOPEN_UNSUPPORTED", "Temporary workspaces cannot be reopened. Open the APK path again instead.", "fatal");
                }
                C21956 c21956M22311 = c8551.m22311(c19216M19201.f62066);
                C2581.m8038(c21956M22311.f71242.f2093);
                return c7845.m20687(c21956M22311);
            } catch (C12731 e) {
                if ("WORKSPACE_NOT_FOUND".equals(e.f42472)) {
                    throw m20688(e);
                }
                throw e;
            }
        }
        String strM33715 = c1494.f6031;
        if (strM33715 == null && (strM33715 = C13872.m33715()) == null) {
            throw m20688(C12731.m31623(null, "CURRENT_APK_NOT_AVAILABLE", "Current APK is not available.", "warning"));
        }
        AbstractC20745 abstractC20745M15313 = C5553.m15313(C6370.m17479(strM33715, MotionUtils.EASING_TYPE_PATH), new String[0]);
        try {
            m20695(abstractC20745M15313);
            if (c1494.f6033) {
                try {
                    C19216 c19216M19202 = c7221.m19202(abstractC20745M15313);
                    if (c19216M19202 != null) {
                        try {
                            C21956 c21956M22312 = c8551.m22311(c19216M19202.f62066);
                            C2581.m8038(c21956M22312.f71242.f2093);
                            return c7845.m20687(c21956M22312);
                        } catch (C12731 e2) {
                            if (!"WORKSPACE_CORRUPT".equals(e2.f42472)) {
                                throw e2;
                            }
                        }
                    }
                } catch (IOException e3) {
                    throw m20688(C12731.m31630("PATH_READ_FAILED", e3.getMessage() == null ? "Failed to read APK" : e3.getMessage()));
                }
            }
            try {
                C21956 c21956M31768 = c7845.f25795.m31768(abstractC20745M15313, c1494.f6032);
                c8551.m22308(c21956M31768);
                c8551.m22313(c21956M31768.f71244);
                C15157.m36345();
                return c7845.m20687(c21956M31768);
            } catch (C12731 e4) {
                if ("APK_OPEN_BLOCKED".equals(e4.f42472)) {
                    throw e4;
                }
                throw m20688(e4);
            }
        } catch (C12731 e5) {
            throw m20688(e5);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20693(C3992 c3992, Supplier supplier) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            C7845 c7845 = (C7845) supplier.get();
            if (c7845 != null) {
                c7845.f25793.m22309(c3992.f14833);
            }
            new C6815().m18420(c3992);
            if (c7845 != null) {
                c7845.f25793.m22310(c3992.f14833);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20692(C2852 c2852) {
        ReentrantLock reentrantLock = f25790;
        reentrantLock.lock();
        try {
            ArrayList arrayListM18418 = new C6815().m18418();
            int size = arrayListM18418.size();
            int size2 = arrayListM18418.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                }
                C2664.m8195();
                if (size <= C0403.m2137()) {
                    break;
                }
                C3992 c3992 = (C3992) arrayListM18418.get(size2);
                try {
                    m20693(c3992, c2852);
                    size--;
                } catch (IOException e) {
                    C0577.m2747("MT MCP excess workspace delete failed, workspaceId=" + c3992.f14833, e);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8196 m20685(C7845 c7845, C19840 c19840) throws C12731 {
        String str = c19840.f63660;
        C8551 c8551 = c7845.f25793;
        try {
            C19216 c19216M19201 = c7845.f25800.m19201(str);
            AbstractC20745 abstractC20745 = c19216M19201.f62061;
            String str2 = c19216M19201.f62066;
            c8551.m22309(str2);
            try {
                ((C7845) c7845.f25802.f73814).f25800.getClass();
                C7221.m19197(abstractC20745);
                if (abstractC20745.mo33975()) {
                    throw new IOException("Workspace directory still exists");
                }
                c8551.m22310(str2);
                C15157.m36345();
                return new C8196(str2, c19216M19201.f62065);
            } catch (IOException e) {
                throw m20689(C12731.m31629(JSON.array(), "WORKSPACE_CLOSE_FAILED", e.getMessage() == null ? "Failed to close workspace." : e.getMessage(), "warning"), str2, Boolean.valueOf(c19216M19201.f62065));
            }
        } catch (C12731 e2) {
            throw m20689(e2, str, (Boolean) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0434 m20684(C7845 c7845, C14196 c14196, C15283 c15283) throws C12731 {
        C3610 c3610 = c7845.f25791;
        C21956 c21956M22306 = c7845.f25793.m22306(c14196.f46551);
        String str = c14196.f46555;
        if ("dex_class_outline".equals(str)) {
            return c3610.m10696(c21956M22306, c14196, c15283);
        }
        if ("zip_entries".equals(str)) {
            return c3610.m10698(c21956M22306, c14196);
        }
        if ("dex_classes".equals(str)) {
            return c3610.m10695(c21956M22306, c14196);
        }
        if ("resource_table".equals(str)) {
            return c3610.m10697(c21956M22306, c14196);
        }
        throw C12731.m31626("Unsupported view", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22744 m20718(C13135 c13135, OutputStream outputStream) throws C12731 {
        String str = c13135.f43741;
        try {
            ReentrantLock reentrantLock = f25790;
            reentrantLock.lock();
            try {
                return this.f25799.m35881(this.f25793.m22306(str), c13135, outputStream);
            } finally {
                reentrantLock.unlock();
            }
        } catch (C12731 e) {
            throw m20690(e, str, c13135.f43740, c13135.f43742);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22744 m20717(C3961 c3961, InterfaceC18428 interfaceC18428) throws C12731 {
        String str = c3961.f14720;
        try {
            ReentrantLock reentrantLock = f25790;
            reentrantLock.lock();
            try {
                return this.f25799.m35880(this.f25793.m22306(str), c3961, interfaceC18428);
            } finally {
                reentrantLock.unlock();
            }
        } catch (C12731 e) {
            throw m20690(e, str, c3961.f14721, c3961.f14723);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m20690(C12731 c12731, String str, String str2, String str3) {
        String str4 = c12731.f42472;
        if (!"EDIT_SESSION_STORAGE_FAILED".equals(str4)) {
            return c12731;
        }
        return C12731.m31631(str4, "Edit session storage failed.", c12731.f42475, JSON.array(), JSON.object().add("workspaceId", str).add("editSessionId", str2 == null ? JSON.NULL : JSON.value(str2)).add("entryName", str3).add("backendReason", c12731.f42468.getString("backendReason", "workspace_storage_failure")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20896 m20691(C7845 c7845, C16312 c16312) {
        C14952 c14952 = c7845.f25799;
        C8551 c8551 = c7845.f25793;
        String str = c16312.f52519;
        String str2 = c16312.f52518;
        C21956 c21956M22306 = c8551.m22306(str);
        if (!c16312.f52520) {
            C15958 c15958M35865 = c14952.m35865(c21956M22306, str2);
            String str3 = c15958M35865.f51712;
            String str4 = c15958M35865.f51709;
            c14952.m35888(c21956M22306, str2);
            int i = c15958M35865.f51710;
            int i2 = c15958M35865.f51713;
            ArrayList arrayList = new ArrayList(c15958M35865.f51711);
            new ArrayList();
            return new C20896(str3, str4, false, i, i2, arrayList, "not_run", new ArrayList(), 0, 0, new ArrayList(), new ArrayList(), new ArrayList());
        }
        return ((C10282) c7845.f25794).m26094(c21956M22306, c14952.m35879(c21956M22306, str2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20720(String str) {
        ReentrantLock reentrantLock = f25790;
        try {
            reentrantLock.lock();
            try {
                C21956 c21956M22307 = this.f25793.m22307(str);
                if (c21956M22307 != null && !c21956M22307.f71226 && !c21956M22307.f71236) {
                    this.f25792.m19073(c21956M22307);
                }
            } finally {
                reentrantLock.unlock();
            }
        } catch (Exception e) {
            C0577.m2747("MT MCP smali cache activation failed, workspaceId=" + str, e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7855 m20724() {
        return this.f25792.m19072();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m20721() {
        this.f25792.m19076();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m20689(C12731 c12731, String str, Boolean bool) {
        return C12731.m31631(c12731.f42472, c12731.getMessage(), c12731.f42475, JSON.array(), new JSONObject(c12731.f42468).put("workspaceId", str).put("temporary", bool == null ? JSON.NULL : JSON.value(bool.booleanValue())));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m20688(C12731 c12731) {
        JSONArray jSONArray = c12731.f42471;
        JSONObject jSONObject = c12731.f42468;
        String str = c12731.f42475;
        String str2 = c12731.f42472;
        JSONArray jSONArray2 = new JSONArray(jSONArray);
        jSONArray2.add(C11320.m28376(JSON.object().add("prefix", "").add("limit", 50), "mt_apk_list_available_apks", "inspect", "List APK targets that mt_apk_workspace_open can open"));
        if (c12731.f42469) {
            return C12731.m31627(str2, c12731.getMessage(), str, jSONArray2, jSONObject);
        }
        return C12731.m31631(str2, c12731.getMessage(), str, jSONArray2, jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C12430 m20687(C21956 c21956) {
        String str = c21956.f71244;
        boolean z = c21956.f71236;
        String strSubstring = c21956.f71219;
        if (strSubstring == null || strSubstring.isEmpty() || strSubstring.endsWith("/")) {
            strSubstring = null;
        } else {
            int iLastIndexOf = strSubstring.lastIndexOf(47);
            if (iLastIndexOf >= 0) {
                strSubstring = strSubstring.substring(iLastIndexOf + 1);
            }
        }
        String str2 = strSubstring;
        AbstractC20745 abstractC20745M48787 = c21956.m48787();
        this.f25795.getClass();
        try {
            InputStream inputStreamMo33970 = abstractC20745M48787.mo33970();
            try {
                int i = 65536;
                C19551 c19551 = new C19551(65536);
                byte[] bArr = new byte[8192];
                while (i > 0) {
                    int i2 = inputStreamMo33970.read(bArr, 0, Math.min(8192, i));
                    if (i2 == -1) {
                        break;
                    }
                    c19551.write(bArr, 0, i2);
                    i -= i2;
                }
                byte[] bArr2 = c19551.f62829;
                int i3 = c19551.f62830;
                MessageDigest messageDigestM49421 = C22253.m49421();
                messageDigestM49421.update(bArr2, 0, i3);
                C22253.m49424(messageDigestM49421.digest());
                if (inputStreamMo33970 != null) {
                    inputStreamMo33970.close();
                }
            } catch (Throwable th) {
                if (inputStreamMo33970 != null) {
                    try {
                        inputStreamMo33970.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception unused) {
        }
        ArrayList arrayList = c21956.f71222;
        ArrayList arrayList2 = c21956.f71224;
        C0465 c0465 = c21956.f71242;
        C3287 c3287 = c21956.f71220;
        C18469 c18469 = c21956.f71228;
        Iterator it = arrayList.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (((C9878) it.next()).f33725.toLowerCase(Locale.ROOT).endsWith(".xml")) {
                i4++;
            }
        }
        C3287 c3288 = c21956.f71220;
        boolean z2 = c3288.f12188;
        return new C12430(str, z, str2, arrayList, arrayList2, c0465, c3287, c18469, i4, z2 && c3288.f12190 > 0, z2 && c3288.f12187 > 0, C15731.m37452(c21956.m48787()));
    }
}
