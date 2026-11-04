package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41UK */
/* JADX INFO: loaded from: classes.dex */
public final class C23753 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53040(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, boolean z, boolean z2, InterfaceC4361 interfaceC4361) throws IOException {
        AbstractC22044 abstractC22044M49877 = C6382.f21563.m49877();
        abstractC22044M49877.m49853();
        try {
            C22941 c22941 = new C22941(abstractC22044);
            try {
                C8002 c8002M53038 = m53038(c22941);
                if (c8002M53038 == null) {
                    throw new C3090(R.string.MT_Protector);
                }
                C24367 c24367 = new C24367();
                C14801.m35642(c22941, c24367, null, abstractC22044M49877, interfaceC4361);
                if (interfaceC4361.mo12484()) {
                    c22941.close();
                    abstractC22044M49877.mo4296();
                    return;
                }
                interfaceC4361.mo12486();
                C16907 c16907M53039 = m53039(c22941.m51727(c8002M53038), c24367);
                if (interfaceC4361.mo12484()) {
                    c22941.close();
                    abstractC22044M49877.mo4296();
                } else {
                    C14801.m35641(abstractC22045, z, z2, interfaceC4361, c22941, abstractC22044M49877, c24367, c16907M53039, c8002M53038);
                    c22941.close();
                    abstractC22044M49877.mo4296();
                }
            } catch (Throwable th) {
                try {
                    c22941.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            abstractC22044M49877.mo4296();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8002 m53038(C22941 c22941) {
        for (C8002 c8002 : c22941.m51742()) {
            if (!c8002.isDirectory()) {
                String lowerCase = c8002.getName().toLowerCase();
                if (!lowerCase.contains("/") && lowerCase.startsWith("mapping") && lowerCase.endsWith(".bin")) {
                    return c8002;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16907 m53039(InputStream inputStream, C24367 c24367) throws IOException {
        c24367.m54474(new C19145(c24367));
        c24367.m54474(new C19826(new C11818()));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            C20348 c20348 = new C20348(bufferedInputStream);
            ArrayList<C17039> arrayList = new ArrayList();
            C1466.m5239(c20348, new C25245(arrayList));
            bufferedInputStream.close();
            C16907 c16907 = new C16907();
            for (C17039 c17039 : arrayList) {
                c16907.m39891(new C25113(C8947.m23910(new StringBuilder("L"), c17039.f55682, l.b), C8947.m23910(new StringBuilder("L"), c17039.f55680, l.b)));
            }
            for (C17039 c170310 : arrayList) {
                C21383 c21383 = (C21383) c24367.m54479(c170310.f55680);
                if (c21383 != null) {
                    c21383.mo13503((Object) c170310.f55682);
                    for (C17785 c17785 : c170310.f55679) {
                        String str = c17785.f58369;
                        C14143 c14143 = new C14143(c24367.m54478(c16907.m39887(str, str)));
                        String str2 = c17785.f58371;
                        String str3 = c17785.f58370;
                        for (C18399 c18399 : c21383.m13513()) {
                            if (c18399.m35295().equals(str2) && c18399.m35293().equals(c14143)) {
                                C11818.m29667(c18399).mo13503(str3);
                                break;
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (C16293 c16293 : c170310.f55681) {
                        arrayList2.add(MotionUtils.EASING_TYPE_FORMAT_START);
                        C22064 c22064 = new C22064(c16293.f52902);
                        while (c22064.m49896()) {
                            String strM49897 = c22064.m49897();
                            arrayList2.add(c24367.m54478(c16907.m39887(strM49897, strM49897)));
                        }
                        arrayList2.add(MotionUtils.EASING_TYPE_FORMAT_END);
                        String str4 = c16293.f52902;
                        String strSubstring = str4.substring(str4.indexOf(41) + 1);
                        arrayList2.add(c24367.m54478(c16907.m39887(strSubstring, strSubstring)));
                        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                        C7432 c7432 = new C7432(strArr, strArr.length);
                        arrayList2.clear();
                        String str5 = c16293.f52904;
                        String str6 = c16293.f52903;
                        for (C7958 c7958 : c21383.m13517()) {
                            if (c7958.m35295().equals(str5) && c7958.m35293().equals(c7432)) {
                                C11818.m29667(c7958).mo13503(str6);
                                break;
                            }
                        }
                    }
                }
            }
            C16907 c16908 = new C16907();
            c24367.m54474(new C6467(c16908));
            return c16908;
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
