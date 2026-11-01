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

/* JADX INFO: renamed from: l.֫᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97BO */
/* JADX INFO: loaded from: classes2.dex */
public final class C2025 extends AbstractC16940 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f7547 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C16843 f7548;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C21472 f7549;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C2731 f7550;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C2400 f7551;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C18629 f7552;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20041 f7553;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C6655 f7554;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C13295 f7555;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C22488 f7556;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12610 f7557;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15123 f7558;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C9788 f7559;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C13691 f7560;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C6634 f7561;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0614 f7562;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5554 f7563;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2004 f7564;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C14001 f7565;

    @Override // l.AbstractC16940
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo6513(C7768 c7768) {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2025(int i, C3078 c3078, C9788 c9788) {
        super(i);
        String strM41770 = C17944.m41770();
        this.f7559 = c9788;
        C12610 c12610 = new C12610();
        this.f7557 = c12610;
        C2004 c2004 = new C2004(new C17548(this, c3078), strM41770);
        this.f7564 = c2004;
        C14001 c14001 = new C14001(c12610, c2004);
        this.f7565 = c14001;
        this.f7555 = new C13295(c12610, c2004, c14001);
        this.f7550 = new C2731();
        this.f7556 = new C22488();
        this.f7560 = new C13691();
        this.f7554 = new C6655();
        this.f7548 = new C16843();
        this.f7551 = new C2400();
        this.f7562 = new C0614(c12610);
        this.f7552 = new C18629(c12610, C7340.m19608());
        this.f7553 = new C20041(c12610, C14022.m33911());
        this.f7561 = new C6634();
        this.f7563 = new C5554();
        this.f7549 = new C21472();
        this.f7558 = new C15123();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:230:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:233:0x050b  */
    /* JADX WARN: Code duplicated, block: B:249:0x0541  */
    /* JADX WARN: Code duplicated, block: B:251:0x0544  */
    @Override // l.AbstractC16940
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7768 mo6512(C15530 c15530) throws Throwable {
        boolean zEquals;
        C7768 c7768M31384;
        EnumC18351 enumC18351;
        String str;
        String str2;
        String str3;
        boolean z;
        C7768 c7768M31385;
        C16117 c16117M6464;
        EnumC10591 enumC10591;
        String strM39264;
        EnumC10591 enumC10592;
        String strM39265;
        C7768 c7768M39639;
        String str4;
        C9788 c9788 = this.f7559;
        if (c9788 != null) {
            c9788.f33501.m22003(c15530.m37137());
        }
        String strM37143 = c15530.m37143();
        EnumC18351 enumC18352 = EnumC18351.OPTIONS;
        String str5 = "/api/web-config";
        if (enumC18352.equals(c15530.m37142())) {
            zEquals = true;
        } else if ("/api/auth/status".equals(strM37143) || "/api/web-config".equals(strM37143)) {
            zEquals = EnumC18351.GET.equals(c15530.m37142());
        } else if ("/api".equals(strM37143) || strM37143.startsWith("/api/") || !(EnumC18351.GET.equals(c15530.m37142()) || EnumC18351.HEAD.equals(c15530.m37142()))) {
            zEquals = false;
        } else {
            zEquals = true;
        }
        C12610 c12610 = this.f7557;
        if (zEquals && C5244.m14441(c15530)) {
            EnumC10591 enumC10593 = EnumC10591.BAD_REQUEST;
            c12610.getClass();
            c7768M31384 = C12610.m31384(enumC10593, C16737.m39264(R.string.MT_Protector, new Object[0]));
            c7768M31384.m20446();
        } else {
            c7768M31384 = null;
        }
        if (c7768M31384 != null) {
            m6511(c7768M31384);
            return c7768M31384;
        }
        if (enumC18352.equals(c15530.m37142())) {
            EnumC10591 enumC10594 = EnumC10591.OK;
            c12610.getClass();
            C7768 c7768M396310 = AbstractC16940.m39639(enumC10594, "text/plain", "");
            m6511(c7768M396310);
            return c7768M396310;
        }
        boolean zEquals2 = "/api/auth/status".equals(strM37143);
        C13295 c13295 = this.f7555;
        if (!zEquals2) {
            if ("/api/auth/pair".equals(strM37143)) {
                c7768M31385 = c13295.m32781(c15530);
            } else {
                boolean z2 = ((!"/api".equals(strM37143) && !strM37143.startsWith("/api/")) || "/api/web-config".equals(strM37143) || "/api/auth/status".equals(strM37143) || "/api/auth/pair".equals(strM37143)) ? false : true;
                C15123 c15123 = this.f7558;
                if (z2) {
                    boolean zEquals3 = "/api/file-content".equals(strM37143);
                    str = "/api/auth/status";
                    str3 = "/api/auth/pair";
                    C2004 c2004 = this.f7564;
                    if (zEquals3) {
                        c16117M6464 = c2004.m6462(c15530);
                    } else {
                        c16117M6464 = "/api/file-archive".equals(strM37143) ? c2004.m6464(c15530) : c2004.m6457(c15530);
                    }
                    Object[] objArr = c16117M6464.f52103;
                    enumC18351 = enumC18352;
                    int i = c16117M6464.f52105;
                    EnumC10591 enumC10595 = c16117M6464.f52108;
                    String str6 = c16117M6464.f52106;
                    if (!c16117M6464.f52104) {
                        if (str6.isEmpty()) {
                            c12610.getClass();
                            c7768M39639 = C12610.m31384(enumC10595, C16737.m39264(i, objArr));
                        } else {
                            c12610.getClass();
                            c7768M39639 = AbstractC16940.m39639(enumC10595, "application/json", new JSONObject().add(d.O, C16737.m39264(i, objArr)).add("code", str6).toString());
                            c7768M39639.m20448("X-MT-Auth-Error-Code", str6);
                        }
                        if (C5244.m14443(c15530)) {
                            c7768M39639.m20446();
                        }
                        m6511(c7768M39639);
                        return c7768M39639;
                    }
                    C21055 c21055 = c16117M6464.f52107;
                    if ("/api/auth/session".equals(strM37143)) {
                        c7768M31385 = c13295.m32780(c15530, c21055);
                    } else if ("/api/auth/devices".equals(strM37143)) {
                        c7768M31385 = c13295.m32783(c15530, c21055);
                    } else if ("/api/auth/content-ticket".equals(strM37143)) {
                        c7768M31385 = c13295.m32785(c15530, c21055);
                    } else if ("/api/auth/archive-ticket".equals(strM37143)) {
                        c7768M31385 = c13295.m32782(c15530, c21055);
                    } else if ("/api/files".equals(strM37143)) {
                        c7768M31385 = this.f7550.m8340(c15530);
                    } else {
                        if ("/api/file-icon".equals(strM37143)) {
                            this.f7556.getClass();
                            String strM14444 = C5244.m14444(c15530, MotionUtils.EASING_TYPE_PATH);
                            if (strM14444 == null || strM14444.isEmpty()) {
                                enumC10592 = EnumC10591.BAD_REQUEST;
                                strM39265 = C16737.m39264(R.string.MT_Protector, new Object[0]);
                            } else {
                                C0989 c0989M32115 = C12985.m32115(strM14444);
                                if (c0989M32115 == null) {
                                    enumC10592 = EnumC10591.NOT_FOUND;
                                    strM39265 = C16737.m39264(R.string.MT_Protector, new Object[0]);
                                } else {
                                    byte[] bArr = c0989M32115.f4637;
                                    String str7 = c0989M32115.f4635;
                                    if ("damaged".equals(c0989M32115.f4636)) {
                                        c7768M31385 = AbstractC16940.m39639(EnumC10591.NO_CONTENT, "text/plain", "");
                                        c7768M31385.m20448("X-MT-Icon-State", "damaged");
                                    } else if (str7.equals(C5244.m14439(c15530, "if-none-match"))) {
                                        c7768M31385 = AbstractC16940.m39639(EnumC10591.NOT_MODIFIED, "text/plain", "");
                                        c7768M31385.m20448("ETag", str7);
                                    } else {
                                        c7768M31385 = AbstractC16940.m39638(EnumC10591.OK, "image/png", new ByteArrayInputStream(bArr), bArr.length);
                                        c7768M31385.m20448("ETag", str7);
                                    }
                                }
                            }
                            c7768M31385 = C12610.m31384(enumC10592, strM39265);
                        } else if ("/api/file-content".equals(strM37143)) {
                            c7768M31385 = this.f7560.m33397(c15530);
                        } else if ("/api/text-file".equals(strM37143)) {
                            c7768M31385 = this.f7554.m18037(c15530);
                        } else if ("/api/file-archive".equals(strM37143)) {
                            c7768M31385 = this.f7565.m33852(c15530, c21055);
                        } else if ("/api/file-rename".equals(strM37143)) {
                            this.f7548.getClass();
                            if (EnumC18351.POST.equals(c15530.m37142())) {
                                String strM14445 = C5244.m14444(c15530, MotionUtils.EASING_TYPE_PATH);
                                String strM14446 = C5244.m14444(c15530, "newName");
                                if (strM14445 == null || strM14445.isEmpty()) {
                                    enumC10591 = EnumC10591.BAD_REQUEST;
                                    strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
                                } else if (strM14446 == null || strM14446.isEmpty()) {
                                    enumC10592 = EnumC10591.BAD_REQUEST;
                                    strM39265 = C16737.m39264(R.string.MT_Protector, "newName");
                                } else if (strM14446.contains("/") || strM14446.contains("\\")) {
                                    c7768M31385 = C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39288(R.string.MT_Protector));
                                } else {
                                    AbstractC20745 abstractC20745M15313 = C5553.m15313(AbstractC11462.m28608(strM14445), new String[0]);
                                    if (abstractC20745M15313.mo33975()) {
                                        final String strMo33986 = abstractC20745M15313.mo33986();
                                        final boolean zMo33974 = abstractC20745M15313.mo33974();
                                        try {
                                            C2462.m7541(abstractC20745M15313.m46737(), EnumC11636.MODIFY_DIRECTORY_LINKED);
                                            final AbstractC20745 abstractC20745M15314 = C5553.m15313(abstractC20745M15313.m46737(), strM14446);
                                            String strM15308 = C5553.m15308(abstractC20745M15313, abstractC20745M15314);
                                            if (strM15308 != null) {
                                                c7768M31385 = C12610.m31384(EnumC10591.CONFLICT, strM15308);
                                            } else if (abstractC20745M15314.mo33975()) {
                                                Runnable runnable = new Runnable() { // from class: l.ۛ᩵ۜ
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        EnumC11669.m29115(zMo33974).m29117(strMo33986);
                                                        C22252.m49409(abstractC20745M15314);
                                                        C21094.m47530();
                                                        C23186.m51173();
                                                    }
                                                };
                                                if (C13890.m33728()) {
                                                    runnable.run();
                                                } else {
                                                    C16737.m39273(runnable);
                                                }
                                                HashMap map = new HashMap();
                                                map.put("item", C3811.m11101(new C6794(abstractC20745M15314)));
                                                c7768M31385 = C12610.m31383(map);
                                            } else {
                                                enumC10592 = EnumC10591.NOT_FOUND;
                                                strM39265 = C16737.m39264(R.string.MT_Protector, new Object[0]);
                                            }
                                        } catch (C4987 e) {
                                            enumC10591 = EnumC10591.CONFLICT;
                                            strM39264 = e.getMessage();
                                            c7768M31385 = C12610.m31384(enumC10591, strM39264);
                                        }
                                    } else {
                                        enumC10592 = EnumC10591.NOT_FOUND;
                                        strM39265 = C16737.m39264(R.string.MT_Protector, new Object[0]);
                                    }
                                }
                                c7768M31385 = C12610.m31384(enumC10591, strM39264);
                            } else {
                                enumC10592 = EnumC10591.METHOD_NOT_ALLOWED;
                                strM39265 = C16737.m39264(R.string.MT_Protector, new Object[0]);
                            }
                            c7768M31385 = C12610.m31384(enumC10592, strM39265);
                        } else if ("/api/file-create".equals(strM37143)) {
                            c7768M31385 = this.f7551.m7326(c15530);
                        } else if ("/api/file-property".equals(strM37143)) {
                            c7768M31385 = this.f7562.m2820(c15530);
                        } else if ("/api/file-transfer".equals(strM37143)) {
                            c7768M31385 = this.f7552.m43082(c15530);
                        } else {
                            boolean zEquals4 = "/api/file-upload-session".equals(strM37143);
                            C20041 c20041 = this.f7553;
                            if (zEquals4) {
                                c7768M31385 = c20041.m45407(c15530);
                            } else if ("/api/file-upload-prepare".equals(strM37143)) {
                                c7768M31385 = c20041.m45405(c15530);
                            } else if ("/api/file-upload-begin".equals(strM37143)) {
                                c7768M31385 = c20041.m45406(c15530);
                            } else if ("/api/file-upload-content".equals(strM37143)) {
                                c7768M31385 = c20041.m45408(c15530);
                            } else if ("/api/file-upload-complete".equals(strM37143)) {
                                c7768M31385 = c20041.m45409(c15530);
                            } else {
                                boolean zEquals5 = "/api/file-sort".equals(strM37143);
                                C6634 c6634 = this.f7561;
                                if (zEquals5) {
                                    c7768M31385 = c6634.m17995(c15530);
                                } else if ("/api/file-sort/folder".equals(strM37143)) {
                                    c7768M31385 = c6634.m17994(c15530);
                                } else {
                                    boolean zEquals6 = "/api/hidden-files".equals(strM37143);
                                    C5554 c5554 = this.f7563;
                                    if (zEquals6) {
                                        c7768M31385 = c5554.m15336(c15530);
                                    } else if ("/api/hidden-files/settings".equals(strM37143)) {
                                        c7768M31385 = c5554.m15338(c15530);
                                    } else if ("/api/hidden-files/hide-selected".equals(strM37143)) {
                                        c7768M31385 = c5554.m15337(c15530);
                                    } else if ("/api/hidden-files/list".equals(strM37143)) {
                                        c7768M31385 = c5554.m15339(c15530);
                                    } else {
                                        str2 = "/api/";
                                        if ("/api".equals(strM37143) || strM37143.startsWith(str2)) {
                                            EnumC10591 enumC10596 = EnumC10591.NOT_FOUND;
                                            c12610.getClass();
                                            c7768M31385 = C12610.m31384(enumC10596, C16737.m39264(R.string.MT_Protector, new Object[0]));
                                        } else {
                                            c7768M31385 = c15123.m36247(c15530);
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
                    enumC18351 = enumC18352;
                    str = "/api/auth/status";
                    str2 = "/api/";
                    str3 = "/api/auth/pair";
                    if ("/api/web-config".equals(strM37143)) {
                        this.f7549.getClass();
                        if (EnumC18351.GET.equals(c15530.m37142())) {
                            Locale localeM18163 = C6730.m18163(C16737.m39277());
                            HashMap map2 = new HashMap();
                            map2.put(am.N, C21472.m48091(localeM18163));
                            map2.put("initialPath", C17944.m41774().mo33986());
                            c7768M31385 = C12610.m31383(map2);
                        } else {
                            c7768M31385 = C12610.m31384(EnumC10591.METHOD_NOT_ALLOWED, C16737.m39264(R.string.MT_Protector, new Object[0]));
                        }
                    } else if ("/api".equals(strM37143) || strM37143.startsWith(str2)) {
                        EnumC10591 enumC10597 = EnumC10591.NOT_FOUND;
                        z = false;
                        c12610.getClass();
                        c7768M31385 = C12610.m31384(enumC10597, C16737.m39264(R.string.MT_Protector, new Object[0]));
                    } else {
                        c7768M31385 = c15123.m36247(c15530);
                    }
                }
                z = false;
            }
            if (C5244.m14441(c15530)) {
                if (enumC18351.equals(c15530.m37142())) {
                    z = true;
                } else {
                    str4 = str3;
                    if ((str4.equals(strM37143) || !EnumC18351.POST.equals(c15530.m37142())) && (str.equals(strM37143) || str4.equals(strM37143) || str5.equals(strM37143) || (!"/api".equals(strM37143) && !strM37143.startsWith(str2)))) {
                        z = true;
                    }
                }
                if (z) {
                    c7768M31385.m20446();
                }
            }
            m6511(c7768M31385);
            return c7768M31385;
        }
        c7768M31385 = c13295.m32784(c15530);
        enumC18351 = enumC18352;
        str = "/api/auth/status";
        str2 = "/api/";
        str3 = "/api/auth/pair";
        z = false;
        if (C5244.m14441(c15530)) {
            if (enumC18351.equals(c15530.m37142())) {
                z = true;
            } else {
                str4 = str3;
                if (str4.equals(strM37143)) {
                    z = true;
                } else {
                    z = true;
                }
            }
            if (z) {
                c7768M31385.m20446();
            }
        }
        m6511(c7768M31385);
        return c7768M31385;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m6516() {
        this.f7565.m33853();
        this.f7564.m6459();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m6515() {
        return this.f7564.m6461();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m6517() {
        return this.f7564.m6450();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ArrayList m6518() {
        return this.f7564.m6452();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m6514(String str) {
        return this.f7564.m6458(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m6511(C7768 c7768) {
        c7768.m20448("Access-Control-Allow-Origin", "*");
        c7768.m20448("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, DELETE, OPTIONS");
        c7768.m20448("Access-Control-Allow-Headers", "Content-Type, If-None-Match, Range, X-MT-Auth-Device, X-MT-Auth-Timestamp, X-MT-Auth-Nonce, X-MT-Auth-Content-SHA256, X-MT-Auth-Signature, X-MT-Text-Parameters-Token");
        c7768.m20448("Access-Control-Expose-Headers", "ETag, X-MT-Icon-State, Accept-Ranges, Content-Disposition, Content-Range, X-MT-Preview-Time, Content-Length, X-MT-Auth-Error-Code, Date");
    }
}
