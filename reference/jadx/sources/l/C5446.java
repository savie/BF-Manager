package l;

import android.os.SystemClock;
import android.text.TextUtils;
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

/* JADX INFO: renamed from: l.ۚܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB3C */
/* JADX INFO: loaded from: classes.dex */
public final class C5446 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int f18780 = 20000000;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static CharSequence f18781;

    /* JADX INFO: renamed from: ܳܿ᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f18782;

    static {
        ApplicationC6132.m17119(77);
        f18782 = new short[]{7662, 26308, 26264, 26325, 26330, 26327, 26309, 26309, 26367, 26330, 26330, 26323, 26321, 26327, 26330, 26262, 26309, 26323, 26323, 26333, 26264, 26318, 26331, 26330, 26308, 26323, 26309, 26329, 26307, 26308, 26325, 26323, 26309, 26264, 26327, 26308, 26309, 26325, 26355, 26341, 26342, 26367, 26342, 26355};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native C13914 m15087(AbstractC12648 abstractC12648, boolean z, int i, InterfaceC5614 interfaceC5614, boolean z2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13914 m15084() {
        CharSequence charSequence = f18781;
        if (charSequence != null) {
            f18781 = null;
        } else {
            charSequence = "";
        }
        return new C13914("\n", charSequence, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13914 m15088(C16881 c16881, int i, InterfaceC5614 interfaceC5614) {
        return m15087(c16881, false, i, interfaceC5614, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13914 m15086(AbstractC12648 abstractC12648, boolean z, int i, InterfaceC5614 interfaceC5614) {
        return m15087(abstractC12648, z, i, interfaceC5614, false);
    }

    /* JADX WARN: Code duplicated, block: B:144:0x024a A[Catch: all -> 0x02a8, LOOP:5: B:142:0x0244->B:144:0x024a, LOOP_END, TryCatch #8 {all -> 0x02a8, blocks: (B:147:0x0256, B:148:0x0263, B:150:0x0269, B:153:0x0273, B:154:0x0288, B:135:0x0220, B:136:0x0227, B:138:0x022d, B:139:0x0237, B:140:0x023c, B:141:0x023d, B:142:0x0244, B:144:0x024a, B:145:0x0254, B:155:0x0289, B:156:0x0290, B:158:0x0296, B:50:0x00d4, B:51:0x00df, B:54:0x00e7, B:83:0x0173, B:96:0x0195, B:98:0x019d, B:97:0x0199, B:100:0x01a2, B:59:0x00f8, B:61:0x00fe, B:63:0x0105, B:64:0x010b, B:68:0x0137, B:74:0x014a, B:76:0x015b, B:77:0x015f, B:70:0x0141, B:72:0x0146, B:78:0x0167, B:79:0x016c, B:116:0x01c6, B:117:0x01e7, B:118:0x01eb, B:120:0x01f1, B:121:0x01f7, B:125:0x01fd, B:126:0x0204, B:127:0x0205, B:131:0x0214), top: B:184:0x0093, outer: #12, inners: #11, #11, #10 }] */
    @InterfaceC17202
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13914 m15085(InterfaceC2623 interfaceC2623, int i, InterfaceC5614 interfaceC5614) throws IOException {
        int iM48951;
        ExecutorService executorServiceNewFixedThreadPool;
        Iterator it;
        int i2;
        String str;
        CharSequence string;
        InputStream inputStreamMo8099 = interfaceC2623.mo8099();
        try {
            inputStreamMo8099.mark(32768);
            byte[] bArr = new byte[32768];
            int iM45293 = C20010.m45293(inputStreamMo8099, bArr, 32768);
            String str2 = "\n";
            if (iM45293 <= 0) {
                C13914 c13914 = new C13914("\n", "", C22037.f71424);
                inputStreamMo8099.close();
                return c13914;
            }
            int i3 = -1;
            if (iM45293 == 0) {
                iM48951 = C22037.f71424;
            } else {
                iM48951 = i;
                if (iM48951 == -1) {
                    String strM29552 = C11859.m29552(iM45293, bArr);
                    iM48951 = strM29552 == null ? -1 : C22037.m48951(strM29552);
                    if (iM48951 == -1) {
                        iM48951 = C22037.m48954(iM45293, bArr);
                    }
                }
            }
            inputStreamMo8099.reset();
            if (iM48951 == C22037.f71424 || iM48951 == C22037.f71431) {
                if (C13571.m33175(iM45293, bArr)) {
                    C20010.m45305(3L, inputStreamMo8099);
                }
            } else if (iM48951 == C22037.f71428) {
                if (C13571.m33172(iM45293, bArr)) {
                    C20010.m45305(2L, inputStreamMo8099);
                }
            } else if (iM48951 == C22037.f71432) {
                if (C13571.m33178(iM45293, bArr)) {
                    C20010.m45305(2L, inputStreamMo8099);
                }
            } else if (iM48951 == C22037.f71429) {
                if (C13571.m33176(iM45293, bArr)) {
                    C20010.m45305(4L, inputStreamMo8099);
                }
            } else if (iM48951 == C22037.f71430 && C13571.m33168(iM45293, bArr)) {
                C20010.m45305(4L, inputStreamMo8099);
            }
            try {
                C17616 c17616 = new C17616(new InputStreamReader(inputStreamMo8099, C22037.m48953(iM48951)));
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[0] = null;
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                String str3 = "tmp_" + UUID.randomUUID() + "_";
                ArrayList arrayList2 = new ArrayList();
                ExecutorService executorService = C4716.f16632;
                executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C5464.f18831);
                try {
                    try {
                        try {
                            final AtomicInteger atomicInteger = new AtomicInteger();
                            int i4 = f18780;
                            int length = 0;
                            boolean z = false;
                            String str4 = null;
                            while (true) {
                                int i5 = c17616.read();
                                if (i5 == i3) {
                                    String str5 = str4 == null ? str2 : str4;
                                    if (!z) {
                                        C13914 c13915 = new C13914(str5, sb, iM48951);
                                        executorServiceNewFixedThreadPool.shutdownNow();
                                        inputStreamMo8099.close();
                                        return c13915;
                                    }
                                    if (length > 0) {
                                        AbstractC20745 abstractC20745M46690 = C2417.m7342().m46690(str3 + arrayList.size());
                                        m15090(abstractC20745M46690, sb);
                                        arrayList.add(abstractC20745M46690);
                                    }
                                    Iterator it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                        try {
                                            ((Future) it2.next()).get();
                                        } catch (InterruptedException unused) {
                                        } catch (ExecutionException e) {
                                            Throwable cause = e.getCause();
                                            C13638.requireNonNull(cause);
                                            throw cause;
                                        }
                                    }
                                    C13914 c13916 = new C13914(charSequenceArr[0], str5, arrayList, iM48951);
                                    executorServiceNewFixedThreadPool.shutdownNow();
                                    inputStreamMo8099.close();
                                    return c13916;
                                }
                                if (length >= i4) {
                                    char c = (char) i5;
                                    int i6 = C4312.f15487;
                                    str = str2;
                                    if (c < 55296 || c >= 57344) {
                                        if (interfaceC5614.mo2357()) {
                                            throw new CancellationException();
                                        }
                                        while (atomicInteger.get() >= 3) {
                                            SystemClock.sleep(10L);
                                        }
                                        final AbstractC20745 abstractC20745M46691 = C2417.m7342().m46690(str3 + arrayList.size());
                                        int iLastIndexOf = TextUtils.lastIndexOf(sb, '\n') + 1;
                                        if (iLastIndexOf >= sb.length() - 1000) {
                                            i2 = 0;
                                            try {
                                                string = sb.subSequence(0, iLastIndexOf);
                                                sb.delete(0, iLastIndexOf);
                                            } catch (OutOfMemoryError unused2) {
                                                charSequenceArr[i2] = null;
                                                sb.setLength(i2);
                                                sb.trimToSize();
                                                Iterator it3 = arrayList2.iterator();
                                                while (it3.hasNext()) {
                                                    ((Future) it3.next()).get();
                                                }
                                                arrayList2.clear();
                                                System.gc();
                                                f18780 = (int) (f18780 * 0.75f);
                                                throw new C11797();
                                            }
                                        } else {
                                            string = sb.toString();
                                            sb.setLength(0);
                                        }
                                        final CharSequence charSequence = string;
                                        atomicInteger.incrementAndGet();
                                        arrayList2.add(executorServiceNewFixedThreadPool.submit(new Callable() { // from class: l.ۢ᩷ۖ
                                            @Override // java.util.concurrent.Callable
                                            public final Object call() throws IOException {
                                                C5446.m15090(abstractC20745M46691, charSequence);
                                                atomicInteger.decrementAndGet();
                                                return null;
                                            }
                                        }));
                                        if (!z) {
                                            charSequenceArr[0] = charSequence;
                                            z = true;
                                        }
                                        length = sb.length();
                                        arrayList.add(abstractC20745M46691);
                                    }
                                } else {
                                    str = str2;
                                }
                                if (i5 == 13) {
                                    sb.append('\n');
                                    int i7 = length + 1;
                                    int i8 = c17616.read();
                                    if (str4 == null) {
                                        str4 = i8 == 10 ? "\r\n" : "\r";
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
                                str2 = str;
                            }
                        } catch (OutOfMemoryError unused3) {
                            i2 = 0;
                        }
                    } catch (CancellationException unused4) {
                        m15089(arrayList2);
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            ((AbstractC20745) it4.next()).mo24647();
                        }
                        executorServiceNewFixedThreadPool.shutdownNow();
                        inputStreamMo8099.close();
                        return null;
                    } catch (RuntimeException e2) {
                        e = e2;
                        m15089(arrayList2);
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((AbstractC20745) it.next()).mo24647();
                        }
                        throw e;
                    }
                } catch (IOException e3) {
                    e = e3;
                    m15089(arrayList2);
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC20745) it.next()).mo24647();
                    }
                    throw e;
                } catch (Error e4) {
                    e = e4;
                    m15089(arrayList2);
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC20745) it.next()).mo24647();
                    }
                    throw e;
                } catch (Throwable th) {
                    m15089(arrayList2);
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        ((AbstractC20745) it5.next()).mo24647();
                    }
                    throw new IOException(th);
                }
            } catch (Throwable th2) {
                executorServiceNewFixedThreadPool.shutdownNow();
                throw th2;
            }
        } catch (Throwable th3) {
            if (inputStreamMo8099 == null) {
                throw th3;
            }
            try {
                inputStreamMo8099.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15089(ArrayList arrayList) {
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
    public static void m15090(AbstractC20745 abstractC20745, CharSequence charSequence) throws IOException {
        int length = charSequence.length();
        C9856 c9856 = new C9856(new C12678(new C11267(abstractC20745.mo33976(false))));
        try {
            c9856.append(charSequence, 0, length);
            c9856.close();
        } catch (Throwable th) {
            try {
                c9856.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
