package l;

import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.d;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܺۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97BO */
/* JADX INFO: loaded from: classes5.dex */
public final class C16531 extends AbstractC1530 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f53510 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C12802 f53511;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C14249 f53512;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C24187 f53513;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C19711 f53514;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C0124 f53515;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C9818 f53516;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C8284 f53517;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4049 f53518;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C15785 f53519;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C7800 f53520;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3063 f53521;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15039 f53522;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C18769 f53523;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C18725 f53524;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19515 f53525;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23947 f53526;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C6287 f53527;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C24209 f53528;

    @Override // l.AbstractC1530
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5435(C18683 c18683) {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16531(int i, C17277 c17277, C15785 c15785) {
        super(i);
        String strM3552 = C0870.m3552();
        this.f53519 = c15785;
        C12802 c12802 = new C12802();
        this.f53511 = c12802;
        C3063 c3063 = new C3063(new C5345(this, c17277), strM3552);
        this.f53521 = c3063;
        C24209 c24209 = new C24209(c12802, c3063);
        this.f53528 = c24209;
        this.f53520 = new C7800(c12802, c3063, c24209);
        this.f53527 = new C6287();
        this.f53518 = new C4049();
        this.f53526 = new C23947();
        this.f53515 = new C0124();
        this.f53522 = new C15039();
        this.f53512 = new C14249();
        this.f53525 = new C19515(c12802);
        this.f53517 = new C8284(c12802, C21949.m49661());
        this.f53514 = new C19711(c12802, C12252.m30594());
        this.f53524 = new C18725();
        this.f53513 = new C24187();
        this.f53516 = new C9818();
        this.f53523 = new C18769();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:230:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:233:0x050b  */
    /* JADX WARN: Code duplicated, block: B:249:0x0541  */
    /* JADX WARN: Code duplicated, block: B:251:0x0544  */
    @Override // l.AbstractC1530
    /* JADX INFO: renamed from: ᩷ */
    public final C18683 mo5438(C3767 c3767) throws Throwable {
        boolean zEquals;
        C18683 c18683M31751;
        EnumC12716 enumC12716;
        String str;
        String str2;
        String str3;
        boolean z;
        C18683 c18683M31752;
        C14995 c14995M9991;
        EnumC21667 enumC21667;
        String strM49059;
        EnumC21667 enumC21668;
        String strM490510;
        C18683 c18683M5422;
        String str4;
        C15785 c15785 = this.f53519;
        if (c15785 != null) {
            c15785.f51368.m8589(c3767.m12233());
        }
        String strM12228 = c3767.m12228();
        EnumC12716 enumC12717 = EnumC12716.OPTIONS;
        String str5 = "/api/web-config";
        if (enumC12717.equals(c3767.m12226())) {
            zEquals = true;
        } else if ("/api/auth/status".equals(strM12228) || "/api/web-config".equals(strM12228)) {
            zEquals = EnumC12716.GET.equals(c3767.m12226());
        } else if ("/api".equals(strM12228) || strM12228.startsWith("/api/") || !(EnumC12716.GET.equals(c3767.m12226()) || EnumC12716.HEAD.equals(c3767.m12226()))) {
            zEquals = false;
        } else {
            zEquals = true;
        }
        C12802 c12802 = this.f53511;
        if (zEquals && C23991.m53543(c3767)) {
            EnumC21667 enumC21669 = EnumC21667.BAD_REQUEST;
            c12802.getClass();
            c18683M31751 = C12802.m31751(enumC21669, C21576.m49059(R.string.MT_Protector, new Object[0]));
            c18683M31751.m43438();
        } else {
            c18683M31751 = null;
        }
        if (c18683M31751 != null) {
            m39168(c18683M31751);
            return c18683M31751;
        }
        if (enumC12717.equals(c3767.m12226())) {
            EnumC21667 enumC216610 = EnumC21667.OK;
            c12802.getClass();
            C18683 c18683M5423 = AbstractC1530.m5422(enumC216610, "text/plain", "");
            m39168(c18683M5423);
            return c18683M5423;
        }
        boolean zEquals2 = "/api/auth/status".equals(strM12228);
        C7800 c7800 = this.f53520;
        if (!zEquals2) {
            if ("/api/auth/pair".equals(strM12228)) {
                c18683M31752 = c7800.m21253(c3767);
            } else {
                boolean z2 = ((!"/api".equals(strM12228) && !strM12228.startsWith("/api/")) || "/api/web-config".equals(strM12228) || "/api/auth/status".equals(strM12228) || "/api/auth/pair".equals(strM12228)) ? false : true;
                C18769 c18769 = this.f53523;
                if (z2) {
                    boolean zEquals3 = "/api/file-content".equals(strM12228);
                    str = "/api/auth/status";
                    str3 = "/api/auth/pair";
                    C3063 c3063 = this.f53521;
                    if (zEquals3) {
                        c14995M9991 = c3063.m9987(c3767);
                    } else {
                        c14995M9991 = "/api/file-archive".equals(strM12228) ? c3063.m9991(c3767) : c3063.m9983(c3767);
                    }
                    Object[] objArr = c14995M9991.f49002;
                    enumC12716 = enumC12717;
                    int i = c14995M9991.f49000;
                    EnumC21667 enumC216611 = c14995M9991.f48999;
                    String str6 = c14995M9991.f48998;
                    if (!c14995M9991.f48997) {
                        if (str6.isEmpty()) {
                            c12802.getClass();
                            c18683M5422 = C12802.m31751(enumC216611, C21576.m49059(i, objArr));
                        } else {
                            c12802.getClass();
                            c18683M5422 = AbstractC1530.m5422(enumC216611, "application/json", new JSONObject().add(d.O, C21576.m49059(i, objArr)).add("code", str6).toString());
                            c18683M5422.m43440("X-MT-Auth-Error-Code", str6);
                        }
                        if (C23991.m53544(c3767)) {
                            c18683M5422.m43438();
                        }
                        m39168(c18683M5422);
                        return c18683M5422;
                    }
                    C19471 c19471 = c14995M9991.f49001;
                    if ("/api/auth/session".equals(strM12228)) {
                        c18683M31752 = c7800.m21258(c3767, c19471);
                    } else if ("/api/auth/devices".equals(strM12228)) {
                        c18683M31752 = c7800.m21255(c3767, c19471);
                    } else if ("/api/auth/content-ticket".equals(strM12228)) {
                        c18683M31752 = c7800.m21257(c3767, c19471);
                    } else if ("/api/auth/archive-ticket".equals(strM12228)) {
                        c18683M31752 = c7800.m21254(c3767, c19471);
                    } else if ("/api/files".equals(strM12228)) {
                        c18683M31752 = this.f53527.m17970(c3767);
                    } else {
                        if ("/api/file-icon".equals(strM12228)) {
                            this.f53518.getClass();
                            String strM53547 = C23991.m53547(c3767, MotionUtils.EASING_TYPE_PATH);
                            if (strM53547 == null || strM53547.isEmpty()) {
                                enumC21668 = EnumC21667.BAD_REQUEST;
                                strM490510 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                            } else {
                                C17979 c17979M1147 = C0080.m1147(strM53547);
                                if (c17979M1147 == null) {
                                    enumC21668 = EnumC21667.NOT_FOUND;
                                    strM490510 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                                } else {
                                    byte[] bArr = c17979M1147.f58913;
                                    String str7 = c17979M1147.f58911;
                                    if ("damaged".equals(c17979M1147.f58912)) {
                                        c18683M31752 = AbstractC1530.m5422(EnumC21667.NO_CONTENT, "text/plain", "");
                                        c18683M31752.m43440("X-MT-Icon-State", "damaged");
                                    } else if (str7.equals(C23991.m53541(c3767, "if-none-match"))) {
                                        c18683M31752 = AbstractC1530.m5422(EnumC21667.NOT_MODIFIED, "text/plain", "");
                                        c18683M31752.m43440("ETag", str7);
                                    } else {
                                        c18683M31752 = AbstractC1530.m5421(EnumC21667.OK, "image/png", new ByteArrayInputStream(bArr), bArr.length);
                                        c18683M31752.m43440("ETag", str7);
                                    }
                                }
                            }
                            c18683M31752 = C12802.m31751(enumC21668, strM490510);
                        } else if ("/api/file-content".equals(strM12228)) {
                            c18683M31752 = this.f53526.m53474(c3767);
                        } else if ("/api/text-file".equals(strM12228)) {
                            c18683M31752 = this.f53515.m1279(c3767);
                        } else if ("/api/file-archive".equals(strM12228)) {
                            c18683M31752 = this.f53528.m54201(c3767, c19471);
                        } else if ("/api/file-rename".equals(strM12228)) {
                            this.f53522.getClass();
                            if (EnumC12716.POST.equals(c3767.m12226())) {
                                String strM53548 = C23991.m53547(c3767, MotionUtils.EASING_TYPE_PATH);
                                String strM53549 = C23991.m53547(c3767, "newName");
                                if (strM53548 == null || strM53548.isEmpty()) {
                                    enumC21667 = EnumC21667.BAD_REQUEST;
                                    strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                                } else if (strM53549 == null || strM53549.isEmpty()) {
                                    enumC21668 = EnumC21667.BAD_REQUEST;
                                    strM490510 = C21576.m49059(R.string.MT_Protector, "newName");
                                } else if (strM53549.contains("/") || strM53549.contains("\\")) {
                                    c18683M31752 = C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49088(R.string.MT_Protector));
                                } else {
                                    AbstractC22044 abstractC22044M35193 = C14584.m35193(AbstractC7364.m20187(strM53548), new String[0]);
                                    if (abstractC22044M35193.mo2934()) {
                                        final String strMo4294 = abstractC22044M35193.mo4294();
                                        final boolean zMo4281 = abstractC22044M35193.mo4281();
                                        try {
                                            C6265.m17912(abstractC22044M35193.m49881(), EnumC12230.MODIFY_DIRECTORY_LINKED);
                                            final AbstractC22044 abstractC22044M35194 = C14584.m35193(abstractC22044M35193.m49881(), strM53549);
                                            String strM35188 = C14584.m35188(abstractC22044M35193, abstractC22044M35194);
                                            if (strM35188 != null) {
                                                c18683M31752 = C12802.m31751(EnumC21667.CONFLICT, strM35188);
                                            } else if (abstractC22044M35194.mo2934()) {
                                                Runnable runnable = new Runnable() { // from class: l.֫ۖۧ
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        EnumC22346.m50415(zMo4281).m50417(strMo4294);
                                                        C20108.m46234(abstractC22044M35194);
                                                        C6331.m18055();
                                                        C22961.m51805();
                                                    }
                                                };
                                                if (C22415.m50557()) {
                                                    runnable.run();
                                                } else {
                                                    C21576.m49068(runnable);
                                                }
                                                HashMap map = new HashMap();
                                                map.put("item", C7538.m20601(new C6004(abstractC22044M35194)));
                                                c18683M31752 = C12802.m31750(map);
                                            } else {
                                                enumC21668 = EnumC21667.NOT_FOUND;
                                                strM490510 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                                            }
                                        } catch (C4866 e) {
                                            enumC21667 = EnumC21667.CONFLICT;
                                            strM49059 = e.getMessage();
                                            c18683M31752 = C12802.m31751(enumC21667, strM49059);
                                        }
                                    } else {
                                        enumC21668 = EnumC21667.NOT_FOUND;
                                        strM490510 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                                    }
                                }
                                c18683M31752 = C12802.m31751(enumC21667, strM49059);
                            } else {
                                enumC21668 = EnumC21667.METHOD_NOT_ALLOWED;
                                strM490510 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                            }
                            c18683M31752 = C12802.m31751(enumC21668, strM490510);
                        } else if ("/api/file-create".equals(strM12228)) {
                            c18683M31752 = this.f53512.m34590(c3767);
                        } else if ("/api/file-property".equals(strM12228)) {
                            c18683M31752 = this.f53525.m45036(c3767);
                        } else if ("/api/file-transfer".equals(strM12228)) {
                            c18683M31752 = this.f53517.m22377(c3767);
                        } else {
                            boolean zEquals4 = "/api/file-upload-session".equals(strM12228);
                            C19711 c19711 = this.f53514;
                            if (zEquals4) {
                                c18683M31752 = c19711.m45403(c3767);
                            } else if ("/api/file-upload-prepare".equals(strM12228)) {
                                c18683M31752 = c19711.m45405(c3767);
                            } else if ("/api/file-upload-begin".equals(strM12228)) {
                                c18683M31752 = c19711.m45401(c3767);
                            } else if ("/api/file-upload-content".equals(strM12228)) {
                                c18683M31752 = c19711.m45402(c3767);
                            } else if ("/api/file-upload-complete".equals(strM12228)) {
                                c18683M31752 = c19711.m45404(c3767);
                            } else {
                                boolean zEquals5 = "/api/file-sort".equals(strM12228);
                                C18725 c18725 = this.f53524;
                                if (zEquals5) {
                                    c18683M31752 = c18725.m43545(c3767);
                                } else if ("/api/file-sort/folder".equals(strM12228)) {
                                    c18683M31752 = c18725.m43544(c3767);
                                } else {
                                    boolean zEquals6 = "/api/hidden-files".equals(strM12228);
                                    C24187 c24187 = this.f53513;
                                    if (zEquals6) {
                                        c18683M31752 = c24187.m54170(c3767);
                                    } else if ("/api/hidden-files/settings".equals(strM12228)) {
                                        c18683M31752 = c24187.m54168(c3767);
                                    } else if ("/api/hidden-files/hide-selected".equals(strM12228)) {
                                        c18683M31752 = c24187.m54167(c3767);
                                    } else if ("/api/hidden-files/list".equals(strM12228)) {
                                        c18683M31752 = c24187.m54169(c3767);
                                    } else {
                                        str2 = "/api/";
                                        if ("/api".equals(strM12228) || strM12228.startsWith(str2)) {
                                            EnumC21667 enumC216612 = EnumC21667.NOT_FOUND;
                                            c12802.getClass();
                                            c18683M31752 = C12802.m31751(enumC216612, C21576.m49059(R.string.MT_Protector, new Object[0]));
                                        } else {
                                            c18683M31752 = c18769.m43569(c3767);
                                        }
                                    }
                                }
                            }
                        }
                        str5 = "/api/web-config";
                    }
                    str2 = "/api/";
                    str5 = "/api/web-config";
                } else {
                    enumC12716 = enumC12717;
                    str = "/api/auth/status";
                    str2 = "/api/";
                    str3 = "/api/auth/pair";
                    if ("/api/web-config".equals(strM12228)) {
                        this.f53516.getClass();
                        if (EnumC12716.GET.equals(c3767.m12226())) {
                            Locale localeM14705 = C4767.m14705(C21576.m49084());
                            HashMap map2 = new HashMap();
                            map2.put(am.N, C9818.m25595(localeM14705));
                            map2.put("initialPath", C0870.m3556().mo4294());
                            c18683M31752 = C12802.m31750(map2);
                        } else {
                            c18683M31752 = C12802.m31751(EnumC21667.METHOD_NOT_ALLOWED, C21576.m49059(R.string.MT_Protector, new Object[0]));
                        }
                    } else if ("/api".equals(strM12228) || strM12228.startsWith(str2)) {
                        EnumC21667 enumC216613 = EnumC21667.NOT_FOUND;
                        z = false;
                        c12802.getClass();
                        c18683M31752 = C12802.m31751(enumC216613, C21576.m49059(R.string.MT_Protector, new Object[0]));
                    } else {
                        c18683M31752 = c18769.m43569(c3767);
                    }
                }
                z = false;
            }
            if (C23991.m53543(c3767)) {
                if (enumC12716.equals(c3767.m12226())) {
                    z = true;
                } else {
                    str4 = str3;
                    if ((str4.equals(strM12228) || !EnumC12716.POST.equals(c3767.m12226())) && (str.equals(strM12228) || str4.equals(strM12228) || str5.equals(strM12228) || (!"/api".equals(strM12228) && !strM12228.startsWith(str2)))) {
                        z = true;
                    }
                }
                if (z) {
                    c18683M31752.m43438();
                }
            }
            m39168(c18683M31752);
            return c18683M31752;
        }
        c18683M31752 = c7800.m21256(c3767);
        enumC12716 = enumC12717;
        str = "/api/auth/status";
        str2 = "/api/";
        str3 = "/api/auth/pair";
        z = false;
        if (C23991.m53543(c3767)) {
            if (enumC12716.equals(c3767.m12226())) {
                z = true;
            } else {
                str4 = str3;
                if (str4.equals(strM12228)) {
                    z = true;
                } else {
                    z = true;
                }
            }
            if (z) {
                c18683M31752.m43438();
            }
        }
        m39168(c18683M31752);
        return c18683M31752;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m39170() {
        this.f53528.m54202();
        this.f53521.m9988();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m39171() {
        return this.f53521.m9986();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m39172() {
        return this.f53521.m9994();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList m39173() {
        return this.f53521.m9979();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m39169(String str) {
        return this.f53521.m9985(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m39168(C18683 c18683) {
        c18683.m43440("Access-Control-Allow-Origin", "*");
        c18683.m43440("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, DELETE, OPTIONS");
        c18683.m43440("Access-Control-Allow-Headers", "Content-Type, If-None-Match, Range, X-MT-Auth-Device, X-MT-Auth-Timestamp, X-MT-Auth-Nonce, X-MT-Auth-Content-SHA256, X-MT-Auth-Signature, X-MT-Text-Parameters-Token");
        c18683.m43440("Access-Control-Expose-Headers", "ETag, X-MT-Icon-State, Accept-Ranges, Content-Disposition, Content-Range, X-MT-Preview-Time, Content-Length, X-MT-Auth-Error-Code, Date");
    }
}
