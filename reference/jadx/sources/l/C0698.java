package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes2.dex */
public final class C0698 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C20494 f2954;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Collection f2955;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f2956;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16927 f2957;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10946 f2958;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1777 f2959;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f2960;

    public C0698(C16927 c16927, HashMap map, C10946 c10946, boolean z, Collection collection) {
        this.f2957 = c16927;
        this.f2956 = map;
        this.f2958 = c10946;
        this.f2960 = z;
        this.f2955 = collection;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C1777 c1777 = new C1777(this.f2957.f54120);
        c1777.m5837(R.string.MT_Protector);
        c1777.mo5843();
        this.f2959 = c1777;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        boolean z;
        final String string;
        final String str;
        final String str2;
        final String str3;
        String strReplace;
        String strReplace2;
        String strSubstring;
        ViewOnClickListenerC3520 viewOnClickListenerC3520 = this.f2957.f54124;
        HashMap map = new HashMap();
        HashMap map2 = this.f2956;
        for (Map.Entry entry : map2.entrySet()) {
            String type = (String) entry.getKey();
            InterfaceC9354 interfaceC9354M16528 = viewOnClickListenerC3520.f12880.m16528(type);
            C13638.requireNonNull(interfaceC9354M16528);
            try {
                C7807 c7807Mo24002 = interfaceC9354M16528.mo24002();
                C13638.requireNonNull(c7807Mo24002);
                type = c7807Mo24002.getType();
                strSubstring = type.substring(1, type.length() - 1);
            } catch (Exception unused) {
                strSubstring = type;
            }
            map.put(strSubstring, (String) entry.getValue());
        }
        viewOnClickListenerC3520.f12880.m16538(map2);
        C6094 c6094 = viewOnClickListenerC3520.f12880;
        C1777 c1777 = this.f2959;
        C13638.requireNonNull(c1777);
        C1438 c1438 = new C1438(c1777);
        final C21445 c21445 = new C21445(map.size());
        final C21445 c21446 = new C21445(map.size());
        Iterator it = map.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            z = this.f2960;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            c21445.put(C22697.m50267(new StringBuilder("L"), (String) entry2.getKey(), l.b), "L" + ((String) entry2.getValue()) + l.b);
            c21445.put(C22697.m50267(new StringBuilder("L"), (String) entry2.getKey(), "<"), "L" + ((String) entry2.getValue()) + "<");
            c21445.put(C22697.m50267(new StringBuilder("L"), (String) entry2.getKey(), "\","), "L" + ((String) entry2.getValue()) + "\",");
            if (z) {
                c21446.put(((String) entry2.getKey()).replace('/', '.'), ((String) entry2.getValue()).replace('/', '.'));
            }
        }
        C10946 c10946 = this.f2958;
        if (c10946 != null) {
            Object obj = c10946.f37218;
            Object obj2 = c10946.f37217;
            StringBuilder sb = new StringBuilder("L");
            String str4 = (String) obj2;
            sb.append(str4);
            string = sb.toString();
            StringBuilder sb2 = new StringBuilder("L");
            String str5 = (String) obj;
            sb2.append(str5);
            String string2 = sb2.toString();
            if (z) {
                strReplace = str4.replace('/', '.');
                strReplace2 = str5.replace('/', '.');
            } else {
                strReplace = null;
                strReplace2 = null;
            }
            str2 = strReplace;
            str3 = strReplace2;
            str = string2;
        } else {
            string = null;
            str = null;
            str2 = null;
            str3 = null;
        }
        final C20494 c20494 = new C20494();
        final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        c6094.m16539(concurrentLinkedQueue, "", true, (Predicate) null);
        c1438.mo1855(0);
        final C8516 c8516 = new C8516(concurrentLinkedQueue.size());
        c8516.m22241(c1438);
        final C14690 c14690M35219 = C14690.m35219("L[^;:<\r\n()]+(;|<|\",)");
        Runnable runnable = new Runnable() { // from class: l.ۚۨۜ
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC9354 interfaceC9354;
                String str6;
                String str7;
                C2093 c2093 = new C2093();
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                    if (concurrentLinkedQueue2.isEmpty() || (interfaceC9354 = (InterfaceC9354) concurrentLinkedQueue2.poll()) == null) {
                        return;
                    }
                    c8516.m22242(1);
                    String strMo23998 = interfaceC9354.mo23998();
                    C13638.requireNonNull(strMo23998);
                    C6222 c6222Matcher = c14690M35219.matcher((CharSequence) strMo23998);
                    c2093.m6636();
                    int i = 0;
                    int iEnd = 0;
                    int i2 = 0;
                    while (c6222Matcher.find()) {
                        String strGroup = c6222Matcher.group();
                        if (TextUtils.indexOf(strMo23998, "const-string", strMo23998.lastIndexOf(10, c6222Matcher.start()) + 1, c6222Matcher.start()) == -1) {
                            String string3 = (String) c21445.getOrDefault(strGroup, null);
                            if (string3 == null && (str7 = string) != null && strGroup.startsWith(str7)) {
                                StringBuilder sbM23356 = C9023.m23356(str);
                                sbM23356.append(strGroup.substring(str7.length()));
                                string3 = sbM23356.toString();
                            }
                            if (string3 != null) {
                                c2093.append((CharSequence) strMo23998.substring(iEnd, c6222Matcher.start()));
                                c2093.append((CharSequence) string3);
                                iEnd = c6222Matcher.end();
                                i2++;
                            }
                        }
                    }
                    if (iEnd != 0) {
                        c2093.append((CharSequence) strMo23998.substring(iEnd));
                        strMo23998 = c2093.toString();
                    }
                    c2093.m6636();
                    C5763 c5763 = new C5763(strMo23998);
                    while (c5763.m15885()) {
                        String string4 = (String) c21446.getOrDefault(c5763.f19580, null);
                        if (string4 == null && (str6 = str2) != null && c5763.f19580.startsWith(str6)) {
                            StringBuilder sbM23357 = C9023.m23356(str3);
                            sbM23357.append(c5763.f19580.substring(str6.length()));
                            string4 = sbM23357.toString();
                        }
                        if (string4 != null) {
                            c2093.append((CharSequence) strMo23998.substring(i, c5763.f19577));
                            try {
                                C9461.m24219(c2093, string4);
                            } catch (IOException unused2) {
                            }
                            i = c5763.f19576;
                            i2++;
                        }
                    }
                    if (i != 0) {
                        c2093.append((CharSequence) strMo23998.substring(i));
                        strMo23998 = c2093.toString();
                    }
                    if (i2 > 0) {
                        interfaceC9354.mo24000(strMo23998);
                        c20494.m46298(i2);
                    }
                }
            }
        };
        c6094.m16557();
        c6094.m16548(false);
        C12733.m31637((int) (C5464.f18831 * 0.66f), runnable);
        c6094.m16548(true);
        c6094.m16573();
        this.f2954 = c20494;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C16927 c16927 = this.f2957;
        ViewOnClickListenerC3520 viewOnClickListenerC3520 = c16927.f54124;
        viewOnClickListenerC3520.m10378();
        viewOnClickListenerC3520.m10377(this.f2955);
        c16927.f54120.m30997(R.string.MT_Protector, viewOnClickListenerC3520.getString(R.string.MT_Protector, Integer.valueOf(this.f2954.f66458), Integer.valueOf(this.f2954.f66457)), false);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        ViewOnClickListenerC3520 viewOnClickListenerC3520 = this.f2957.f54124;
        viewOnClickListenerC3520.m10378();
        viewOnClickListenerC3520.f12882.m42627((Throwable) exc);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f2959.m5825();
        ((ActivityC5677) this.f2957.f54120).m15672();
    }
}
