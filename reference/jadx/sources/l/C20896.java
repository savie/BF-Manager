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

/* JADX INFO: renamed from: l.᩵᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20896 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Collection f66882;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12691 f66883;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f66884;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C17539 f66885;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10745 f66886;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2310 f66887;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f66888;

    public C20896(C12691 c12691, HashMap map, C2310 c2310, boolean z, Collection collection) {
        this.f66883 = c12691;
        this.f66884 = map;
        this.f66887 = c2310;
        this.f66888 = z;
        this.f66882 = collection;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10745 c10745 = new C10745(this.f66883.f40649);
        c10745.m27397(R.string.MT_Protector);
        c10745.mo25931();
        this.f66886 = c10745;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        boolean z;
        final String string;
        final String str;
        final String str2;
        final String str3;
        String strReplace;
        String strReplace2;
        String strSubstring;
        ViewOnClickListenerC19404 viewOnClickListenerC19404 = this.f66883.f40651;
        HashMap map = new HashMap();
        HashMap map2 = this.f66884;
        for (Map.Entry entry : map2.entrySet()) {
            String type = (String) entry.getKey();
            InterfaceC14906 interfaceC14906M46618 = viewOnClickListenerC19404.f62714.m46618(type);
            C17359.requireNonNull(interfaceC14906M46618);
            try {
                C22737 c22737Mo10207 = interfaceC14906M46618.mo10207();
                C17359.requireNonNull(c22737Mo10207);
                type = c22737Mo10207.getType();
                strSubstring = type.substring(1, type.length() - 1);
            } catch (Exception unused) {
                strSubstring = type;
            }
            map.put(strSubstring, (String) entry.getValue());
        }
        viewOnClickListenerC19404.f62714.m46581(map2);
        C20283 c20283 = viewOnClickListenerC19404.f62714;
        C10745 c10745 = this.f66886;
        C17359.requireNonNull(c10745);
        C21151 c21151 = new C21151(c10745);
        final C14307 c14307 = new C14307(map.size());
        final C14307 c14308 = new C14307(map.size());
        Iterator it = map.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            z = this.f66888;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            c14307.put(C8947.m23910(new StringBuilder("L"), (String) entry2.getKey(), l.b), "L" + ((String) entry2.getValue()) + l.b);
            c14307.put(C8947.m23910(new StringBuilder("L"), (String) entry2.getKey(), "<"), "L" + ((String) entry2.getValue()) + "<");
            c14307.put(C8947.m23910(new StringBuilder("L"), (String) entry2.getKey(), "\","), "L" + ((String) entry2.getValue()) + "\",");
            if (z) {
                c14308.put(((String) entry2.getKey()).replace('/', '.'), ((String) entry2.getValue()).replace('/', '.'));
            }
        }
        C2310 c2310 = this.f66887;
        if (c2310 != null) {
            Object obj = c2310.f7474;
            Object obj2 = c2310.f7473;
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
        final C17539 c17539 = new C17539();
        final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        c20283.m46582(concurrentLinkedQueue, "", true, (Predicate) null);
        c21151.mo1209(0);
        final C3374 c3374 = new C3374(concurrentLinkedQueue.size());
        c3374.m11078(c21151);
        final C18415 c18415M42925 = C18415.m42925("L[^;:<\r\n()]+(;|<|\",)");
        Runnable runnable = new Runnable() { // from class: l.֨ۗۧ
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC14906 interfaceC14906;
                String str6;
                String str7;
                C0560 c0560 = new C0560();
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                    if (concurrentLinkedQueue2.isEmpty() || (interfaceC14906 = (InterfaceC14906) concurrentLinkedQueue2.poll()) == null) {
                        return;
                    }
                    c3374.m11079(1);
                    String strMo10209 = interfaceC14906.mo10209();
                    C17359.requireNonNull(strMo10209);
                    C4245 c4245Matcher = c18415M42925.matcher((CharSequence) strMo10209);
                    c0560.m2567();
                    int i = 0;
                    int iEnd = 0;
                    int i2 = 0;
                    while (c4245Matcher.find()) {
                        String strGroup = c4245Matcher.group();
                        if (TextUtils.indexOf(strMo10209, "const-string", strMo10209.lastIndexOf(10, c4245Matcher.start()) + 1, c4245Matcher.start()) == -1) {
                            String string3 = (String) c14307.get(strGroup);
                            if (string3 == null && (str7 = string) != null && strGroup.startsWith(str7)) {
                                StringBuilder sbM27333 = C10732.m27333(str);
                                sbM27333.append(strGroup.substring(str7.length()));
                                string3 = sbM27333.toString();
                            }
                            if (string3 != null) {
                                c0560.append((CharSequence) strMo10209.substring(iEnd, c4245Matcher.start()));
                                c0560.append((CharSequence) string3);
                                iEnd = c4245Matcher.end();
                                i2++;
                            }
                        }
                    }
                    if (iEnd != 0) {
                        c0560.append((CharSequence) strMo10209.substring(iEnd));
                        strMo10209 = c0560.toString();
                    }
                    c0560.m2567();
                    C4137 c4137 = new C4137(strMo10209);
                    while (c4137.m13266()) {
                        String string4 = (String) c14308.get(c4137.f14034);
                        if (string4 == null && (str6 = str2) != null && c4137.f14034.startsWith(str6)) {
                            StringBuilder sbM27334 = C10732.m27333(str3);
                            sbM27334.append(c4137.f14034.substring(str6.length()));
                            string4 = sbM27334.toString();
                        }
                        if (string4 != null) {
                            c0560.append((CharSequence) strMo10209.substring(i, c4137.f14035));
                            try {
                                C3652.m11836(c0560, string4);
                            } catch (IOException unused2) {
                            }
                            i = c4137.f14032;
                            i2++;
                        }
                    }
                    if (i != 0) {
                        c0560.append((CharSequence) strMo10209.substring(i));
                        strMo10209 = c0560.toString();
                    }
                    if (i2 > 0) {
                        interfaceC14906.mo10204(strMo10209);
                        c17539.m41195(i2);
                    }
                }
            }
        };
        c20283.m46595();
        c20283.m46591(false);
        C3369.m11069((int) (C11138.f35105 * 0.66f), runnable);
        c20283.m46591(true);
        c20283.m46573();
        this.f66885 = c17539;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C12691 c12691 = this.f66883;
        ViewOnClickListenerC19404 viewOnClickListenerC19404 = c12691.f40651;
        viewOnClickListenerC19404.m44896();
        viewOnClickListenerC19404.m44895(this.f66882);
        c12691.f40649.m40397(R.string.MT_Protector, viewOnClickListenerC19404.getString(R.string.MT_Protector, Integer.valueOf(this.f66885.f57015), Integer.valueOf(this.f66885.f57014)), false);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        ViewOnClickListenerC19404 viewOnClickListenerC19404 = this.f66883.f40651;
        viewOnClickListenerC19404.m44896();
        viewOnClickListenerC19404.f62712.m51299(exc);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f66886.m27405();
        ((ActivityC0848) this.f66883.f40649).m3447();
    }
}
