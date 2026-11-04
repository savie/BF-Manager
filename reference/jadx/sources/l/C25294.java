package l;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩻᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: NB3C */
/* JADX INFO: loaded from: classes.dex */
public final class C25294 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int f81696 = 20000000;

    /* JADX INFO: renamed from: ۛ۫ۡ, reason: not valid java name and contains not printable characters */
    private static final short[] f81697;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static CharSequence f81698;

    static {
        ApplicationC23172.m52091(HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS);
        f81697 = new short[]{3882, 23402, 23350, 23419, 23412, 23417, 23403, 23403, 23377, 23412, 23412, 23421, 23423, 23417, 23412, 23352, 23403, 23421, 23421, 23411, 23350, 23392, 23413, 23412, 23402, 23421, 23403, 23415, 23405, 23402, 23419, 23421, 23403, 23350, 23417, 23402, 23403, 23419, 23389, 23371, 23368, 23377, 23368, 23389};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native C5902 m56479(AbstractC2720 abstractC2720, boolean z, int i, InterfaceC7509 interfaceC7509, boolean z2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5902 m56477() {
        CharSequence charSequence = f81698;
        if (charSequence != null) {
            f81698 = null;
        } else {
            charSequence = "";
        }
        return new C5902("\n", charSequence, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5902 m56480(C9431 c9431, int i, InterfaceC7509 interfaceC7509) {
        return m56479(c9431, false, i, interfaceC7509, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5902 m56478(AbstractC2720 abstractC2720, boolean z, int i, InterfaceC7509 interfaceC7509) {
        return m56479(abstractC2720, z, i, interfaceC7509, false);
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0249 A[Catch: all -> 0x02a6, LOOP:5: B:137:0x0243->B:139:0x0249, LOOP_END, TryCatch #7 {all -> 0x02a6, blocks: (B:130:0x021f, B:131:0x0226, B:133:0x022c, B:134:0x0236, B:135:0x023b, B:136:0x023c, B:137:0x0243, B:139:0x0249, B:140:0x0253, B:141:0x0254, B:142:0x0261, B:144:0x0267, B:147:0x0271, B:148:0x0286, B:149:0x0287, B:150:0x028e, B:152:0x0294, B:50:0x00d4, B:51:0x00e0, B:55:0x00e9, B:60:0x00f7, B:62:0x00fd, B:64:0x0104, B:65:0x010a, B:67:0x0135, B:70:0x0149, B:72:0x015a, B:73:0x015f, B:69:0x0140, B:74:0x0167, B:75:0x016c, B:78:0x0171, B:91:0x0193, B:93:0x019b, B:92:0x0197, B:95:0x01a0, B:110:0x01c0, B:111:0x01e1, B:112:0x01e5, B:114:0x01eb, B:115:0x01f1, B:119:0x01f7, B:120:0x0201, B:121:0x0202, B:125:0x0211), top: B:177:0x0094, outer: #12, inners: #9, #11, #10 }] */
    @InterfaceC14927
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5902 m56481(InterfaceC11867 interfaceC11867, int i, InterfaceC7509 interfaceC7509) throws IOException {
        int iM8270;
        ExecutorService executorServiceNewFixedThreadPool;
        Iterator it;
        CharSequence string;
        InputStream inputStreamMo29732 = interfaceC11867.mo29732();
        try {
            inputStreamMo29732.mark(32768);
            byte[] bArr = new byte[32768];
            int i2 = 0;
            int iM15487 = C5125.m15487(inputStreamMo29732, bArr, 0, 32768);
            String str = "\n";
            if (iM15487 <= 0) {
                C5902 c5902 = new C5902("\n", "", C2448.f7850);
                inputStreamMo29732.close();
                return c5902;
            }
            int i3 = -1;
            if (iM15487 == 0) {
                iM8270 = C2448.f7850;
            } else {
                iM8270 = i;
                if (iM8270 == -1) {
                    String strM15228 = C5002.m15228(iM15487, bArr);
                    iM8270 = strM15228 == null ? -1 : C2448.m8270(strM15228);
                    if (iM8270 == -1) {
                        iM8270 = C2448.m8273(iM15487, bArr);
                    }
                }
            }
            inputStreamMo29732.reset();
            if (iM8270 == C2448.f7850 || iM8270 == C2448.f7861) {
                if (C18856.m43754(iM15487, bArr)) {
                    C5125.m15502(3L, inputStreamMo29732);
                }
            } else if (iM8270 == C2448.f7858) {
                if (C18856.m43747(iM15487, bArr)) {
                    C5125.m15502(2L, inputStreamMo29732);
                }
            } else if (iM8270 == C2448.f7859) {
                if (C18856.m43757(iM15487, bArr)) {
                    C5125.m15502(2L, inputStreamMo29732);
                }
            } else if (iM8270 == C2448.f7857) {
                if (C18856.m43753(iM15487, bArr)) {
                    C5125.m15502(4L, inputStreamMo29732);
                }
            } else if (iM8270 == C2448.f7864 && C18856.m43758(iM15487, bArr)) {
                C5125.m15502(4L, inputStreamMo29732);
            }
            try {
                C24427 c24427 = new C24427(new InputStreamReader(inputStreamMo29732, C2448.m8272(iM8270)));
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[0] = null;
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                String str2 = "tmp_" + UUID.randomUUID() + "_";
                ArrayList arrayList2 = new ArrayList();
                ExecutorService executorService = C5261.f18541;
                executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C11138.f35105);
                try {
                    try {
                        try {
                            final AtomicInteger atomicInteger = new AtomicInteger();
                            int i4 = f81696;
                            int length = 0;
                            boolean z = false;
                            String str3 = null;
                            while (true) {
                                int i5 = c24427.read();
                                if (i5 == i3) {
                                    if (str3 != null) {
                                        str = str3;
                                    }
                                    if (!z) {
                                        C5902 c5903 = new C5902(str, sb, iM8270);
                                        executorServiceNewFixedThreadPool.shutdownNow();
                                        inputStreamMo29732.close();
                                        return c5903;
                                    }
                                    if (length > 0) {
                                        AbstractC22044 abstractC22044M49876 = C21301.m48536().m49876(str2 + arrayList.size());
                                        m56483(abstractC22044M49876, sb);
                                        arrayList.add(abstractC22044M49876);
                                    }
                                    Iterator it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                        try {
                                            ((Future) it2.next()).get();
                                        } catch (InterruptedException unused) {
                                        } catch (ExecutionException e) {
                                            Throwable cause = e.getCause();
                                            C17359.requireNonNull(cause);
                                            C22327.m50389(cause);
                                            throw cause;
                                        }
                                    }
                                    C5902 c5904 = new C5902(charSequenceArr[0], str, arrayList, iM8270);
                                    executorServiceNewFixedThreadPool.shutdownNow();
                                    inputStreamMo29732.close();
                                    return c5904;
                                }
                                if (length >= i4) {
                                    char c = (char) i5;
                                    try {
                                        int i6 = C18446.f60051;
                                        if (c < 55296 || c >= 57344) {
                                            if (interfaceC7509.mo924()) {
                                                throw new CancellationException();
                                            }
                                            while (atomicInteger.get() >= 3) {
                                                SystemClock.sleep(10L);
                                            }
                                            final AbstractC22044 abstractC22044M49877 = C21301.m48536().m49876(str2 + arrayList.size());
                                            int iLastIndexOf = TextUtils.lastIndexOf(sb, '\n') + 1;
                                            if (iLastIndexOf >= sb.length() - 1000) {
                                                string = sb.subSequence(0, iLastIndexOf);
                                                sb.delete(0, iLastIndexOf);
                                            } else {
                                                string = sb.toString();
                                                sb.setLength(0);
                                            }
                                            final CharSequence charSequence = string;
                                            atomicInteger.incrementAndGet();
                                            arrayList2.add(executorServiceNewFixedThreadPool.submit(new Callable() { // from class: l.ᩴ᩶᩸
                                                @Override // java.util.concurrent.Callable
                                                public final Object call() throws IOException {
                                                    C25294.m56483(abstractC22044M49877, charSequence);
                                                    atomicInteger.decrementAndGet();
                                                    return null;
                                                }
                                            }));
                                            if (!z) {
                                                charSequenceArr[0] = charSequence;
                                                z = true;
                                            }
                                            length = sb.length();
                                            arrayList.add(abstractC22044M49877);
                                        }
                                    } catch (OutOfMemoryError unused2) {
                                        i2 = 0;
                                        charSequenceArr[i2] = null;
                                        sb.setLength(i2);
                                        sb.trimToSize();
                                        Iterator it3 = arrayList2.iterator();
                                        while (it3.hasNext()) {
                                            ((Future) it3.next()).get();
                                        }
                                        arrayList2.clear();
                                        System.gc();
                                        f81696 = (int) (f81696 * 0.75f);
                                        throw new C2173();
                                    }
                                }
                                if (i5 == 13) {
                                    sb.append('\n');
                                    int i7 = length + 1;
                                    int i8 = c24427.read();
                                    if (str3 == null) {
                                        str3 = i8 == 10 ? "\r\n" : "\r";
                                    }
                                    if (i8 == -1 || i8 == 10) {
                                        length = i7;
                                    } else {
                                        if (i8 == 13) {
                                            sb.append('\n');
                                        } else {
                                            sb.append((char) i8);
                                        }
                                        length += 2;
                                    }
                                } else {
                                    sb.append((char) i5);
                                    length++;
                                }
                                i3 = -1;
                            }
                        } catch (OutOfMemoryError unused3) {
                        }
                    } catch (Throwable th) {
                        m56482(arrayList2);
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            ((AbstractC22044) it4.next()).mo4296();
                        }
                        throw new IOException(th);
                    }
                } catch (IOException e2) {
                    e = e2;
                    m56482(arrayList2);
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC22044) it.next()).mo4296();
                    }
                    throw e;
                } catch (Error e3) {
                    e = e3;
                    m56482(arrayList2);
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC22044) it.next()).mo4296();
                    }
                    throw e;
                } catch (CancellationException unused4) {
                    m56482(arrayList2);
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        ((AbstractC22044) it5.next()).mo4296();
                    }
                    executorServiceNewFixedThreadPool.shutdownNow();
                    inputStreamMo29732.close();
                    return null;
                } catch (RuntimeException e4) {
                    e = e4;
                    m56482(arrayList2);
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC22044) it.next()).mo4296();
                    }
                    throw e;
                }
            } catch (Throwable th2) {
                executorServiceNewFixedThreadPool.shutdownNow();
                throw th2;
            }
        } catch (Throwable th3) {
            if (inputStreamMo29732 == null) {
                throw th3;
            }
            try {
                inputStreamMo29732.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56482(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Future future = (Future) it.next();
            future.cancel(true);
            try {
                future.get();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56483(AbstractC22044 abstractC22044, CharSequence charSequence) throws IOException {
        int length = charSequence.length();
        C8018 c8018 = new C8018(new C6527(new C14729(abstractC22044.mo4289(false))));
        try {
            c8018.append(charSequence, 0, length);
            c8018.close();
        } catch (Throwable th) {
            try {
                c8018.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
