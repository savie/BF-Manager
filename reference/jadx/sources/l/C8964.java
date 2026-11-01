package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.regex.PatternSyntaxException;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۡܶ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: P6V4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8964 implements Closeable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final long f30703 = TimeUnit.MINUTES.toNanos(2);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f30704;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f30705;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C14517 f30706;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C2800 f30707;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f30708;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ScheduledThreadPoolExecutor f30709;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f30710;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final HashSet f30711;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f30712;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f30713;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f30714;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Semaphore f30715;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private synchronized void m23261(String str) {
        C18841 c18841 = (C18841) this.f30714.remove(str);
        if (c18841 != null) {
            try {
                c18841.f61039.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized C12731 m23262(String str) {
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, str == null ? JSON.NULL : JSON.value(str));
        if (this.f30708) {
            return C12731.m31627("FILE_SEARCH_CANCELED", "Text search service is closed. Restore the MCP service before retrying. After an application process restart, start a new search with cursor=\"\".", "warning", (JSONArray) null, jSONObjectAdd);
        }
        return C12731.m31624(jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized C16102 m23264(String str, C10458 c10458) {
        C18841 c18841;
        m23265();
        c18841 = (C18841) this.f30714.remove(str);
        if (c18841 != null) {
            c10458.m26420(c18841.f61039);
        }
        return c18841 == null ? null : c18841.f61039;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m23266(String str, C16102 c16102, C10458 c10458) {
        if (!this.f30708 && this.f30712 != 0 && c16102.m38135() <= this.f30704) {
            m23265();
            m23261(str);
            c10458.m26419();
            LinkedHashMap linkedHashMap = this.f30714;
            this.f30706.getClass();
            linkedHashMap.put(str, new C18841(c16102, System.nanoTime()));
            while (true) {
                if (this.f30714.size() <= this.f30712) {
                    Iterator it = this.f30714.values().iterator();
                    long jM38135 = 0;
                    while (it.hasNext()) {
                        jM38135 += ((C18841) it.next()).f61039.m38135();
                    }
                    if (jM38135 <= this.f30704) {
                        m23268();
                        return;
                    }
                }
                m23261((String) this.f30714.keySet().iterator().next());
            }
        }
    }

    public C8964(C2800 c2800) {
        C14517 c14517 = new C14517();
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        this.f30715 = new Semaphore(4, true);
        this.f30714 = new LinkedHashMap(16, 0.75f, true);
        this.f30711 = new HashSet();
        this.f30707 = c2800;
        this.f30706 = c14517;
        this.f30710 = X931RNG.BLOCK128_RESEED_MAX;
        this.f30705 = nanos;
        this.f30712 = 8;
        this.f30704 = 16777216L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19547 m23270(String str, C8258 c8258, String str2) throws Throwable {
        int i;
        Throwable th;
        C10458 c10458 = new C10458();
        String str3 = null;
        int i2 = 0;
        try {
            try {
                synchronized (this) {
                    if (this.f30708) {
                        throw new IOException("Text search service is closed.");
                    }
                    this.f30711.add(c10458);
                }
                try {
                    this.f30715.acquire();
                    try {
                        try {
                            synchronized (this) {
                                if (this.f30708) {
                                    throw new IOException("Text search service is closed.");
                                }
                            }
                            C19630.m44732();
                            C3070 c3070M8504 = this.f30707.m8504();
                            this.f30707.getClass();
                            String strM8495 = C2800.m8495(str, c3070M8504, MotionUtils.EASING_TYPE_PATH);
                            try {
                                C15397 c15397M36829 = str2.isEmpty() ? null : C15397.m36829(str2, strM8495);
                                if (c15397M36829 != null && (!c8258.f28711.equals(c15397M36829.f50119) || !c8258.m21654(c15397M36829.f50119).equals(c15397M36829.f50124))) {
                                    throw C12731.m31627("FILE_INVALID_CURSOR", "The text search cursor is invalid or does not match this request. Restart with cursor=\"\".", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM8495));
                                }
                                C14690 c14690M23263 = str2.isEmpty() ? m23263(c8258) : null;
                                try {
                                    C11268 c11268M8505 = this.f30707.m8505(strM8495);
                                    try {
                                        C5928 c5928M8503 = this.f30707.m8503(strM8495);
                                        C2800 c2800 = this.f30707;
                                        try {
                                            if (c5928M8503.m16196() == EnumC12279.MISSING) {
                                                c2800.getClass();
                                                throw C2800.m8501(strM8495);
                                            }
                                            if (c5928M8503.m16196() != EnumC12279.REGULAR) {
                                                EnumC12279 enumC12279M16196 = c5928M8503.m16196();
                                                c2800.getClass();
                                                throw C2800.m8499("FILE_NOT_REGULAR", "Text search requires a regular file.", strM8495, enumC12279M16196);
                                            }
                                            if (c5928M8503.m16197() > 9007199254740991L) {
                                                throw C12731.m31627("FILE_STORAGE_ERROR", "File size exceeds the supported JSON integer range.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM8495));
                                            }
                                            byte[] bArrCopyOf = new byte[32768];
                                            InputStream inputStreamMo33970 = c5928M8503.m16195().mo33970();
                                            C9047 c9047M26420 = c10458.m26420(inputStreamMo33970);
                                            while (i2 < 32768) {
                                                try {
                                                    try {
                                                        C19630.m44732();
                                                        int i3 = inputStreamMo33970.read(bArrCopyOf, i2, 32768 - i2);
                                                        if (i3 < 0) {
                                                            break;
                                                        }
                                                        if (i3 == 0) {
                                                            int i4 = inputStreamMo33970.read();
                                                            if (i4 < 0) {
                                                                break;
                                                            }
                                                            int i5 = i2 + 1;
                                                            bArrCopyOf[i2] = (byte) i4;
                                                            i2 = i5;
                                                            th = th;
                                                        } else {
                                                            i2 += i3;
                                                        }
                                                    } catch (Throwable th2) {
                                                        try {
                                                            c9047M26420.close();
                                                            throw th2;
                                                        } catch (Throwable th3) {
                                                            th2.addSuppressed(th3);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                }
                                            }
                                            c9047M26420.close();
                                            if (i2 != 32768) {
                                                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i2);
                                            }
                                            String strM49424 = C22253.m49424(C22253.m49421().digest(bArrCopyOf));
                                            C5518 c5518M49942 = C22452.m49942(c8258.f28711, bArrCopyOf);
                                            if (c15397M36829 == null) {
                                                c15397M36829 = new C15397(strM8495, c8258.m21654(c5518M49942.f18936), c5518M49942.f18936, c5928M8503.m16197(), c5928M8503.m16198(), strM49424);
                                                long j = c5518M49942.f18939;
                                                c15397M36829.f50123 = j;
                                                c15397M36829.f50125 = j;
                                            } else if (c15397M36829.f50126 != c5928M8503.m16197() || c15397M36829.f50115 != c5928M8503.m16198() || !c15397M36829.f50127.equals(strM49424) || !c15397M36829.f50119.equals(c5518M49942.f18936)) {
                                                throw m23269(strM8495);
                                            }
                                            C15397 c15397 = c15397M36829;
                                            C16102 c16102M23264 = m23264(str2, c10458);
                                            if (c16102M23264 == null) {
                                                C16102 c16102 = new C16102(c5928M8503.m16195(), c5518M49942, c15397, c8258, c14690M23263 == null ? m23263(c8258) : c14690M23263, c10458);
                                                c10458.m26420(c16102);
                                                c16102M23264 = c16102;
                                            } else {
                                                c15397 = c16102M23264.f52058;
                                            }
                                            C21040 c21040M38136 = c16102M23264.m38136(this.f30710, this.f30705, this.f30706);
                                            synchronized (this) {
                                                if (this.f30708) {
                                                    throw new IOException("Text search service is closed.");
                                                }
                                            }
                                            C5928 c5928M8504 = this.f30707.m8503(strM8495);
                                            if (c21040M38136.f68529.equals(d.aB)) {
                                                long j2 = c15397.f50126;
                                                if (j2 >= 0 && c15397.f50125 != j2) {
                                                    throw m23269(strM8495);
                                                }
                                            }
                                            if (c5928M8504.m16196() != EnumC12279.REGULAR || c5928M8504.m16197() != c5928M8503.m16197() || c5928M8504.m16198() != c5928M8503.m16198()) {
                                                throw m23269(strM8495);
                                            }
                                            this.f30707.m8504().m9209(strM8495);
                                            JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM8495).add("encoding", c15397.f50119).add("matchedLines", c21040M38136.f68527).add("blocks", c21040M38136.m47440()).add("searchedThroughByteOffset", c15397.f50125);
                                            long j3 = c15397.f50126;
                                            JSONObject jSONObjectAdd2 = jSONObjectAdd.add("scanSize", j3 < 0 ? JSON.NULL : JSON.value(j3)).add("stopReason", c21040M38136.f68529).add("warnings", c21040M38136.f68526);
                                            String strM36831 = (c21040M38136.f68529.equals(d.aB) || c21040M38136.f68529.equals("resource_limit") || c21040M38136.f68529.equals("decode_error")) ? "" : c15397.m36831();
                                            if (!strM36831.isEmpty()) {
                                                m23266(strM36831, c16102M23264, c10458);
                                            }
                                            C19547 c19547 = new C19547(jSONObjectAdd2, strM36831);
                                            c11268M8505.close();
                                            c10458.m26423();
                                            synchronized (this) {
                                                this.f30711.remove(c10458);
                                            }
                                            m23261(str2);
                                            this.f30715.release();
                                            return c19547;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            th = th;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                    try {
                                        c11268M8505.close();
                                        throw th;
                                    } catch (Throwable th7) {
                                        th.addSuppressed(th7);
                                        throw th;
                                    }
                                } catch (IOException e) {
                                    e = e;
                                    str3 = strM8495;
                                    i2 = 1;
                                    synchronized (this) {
                                        if (!this.f30708 && !c10458.m26422() && !Thread.currentThread().isInterrupted()) {
                                        }
                                        throw m23262(str3);
                                    }
                                    this.f30707.getClass();
                                    throw C2800.m8497(str3, e);
                                } catch (IllegalArgumentException e2) {
                                    e = e2;
                                    str3 = strM8495;
                                    this.f30707.getClass();
                                    throw C2800.m8496(e, str3);
                                } catch (SecurityException e3) {
                                    e = e3;
                                    str3 = strM8495;
                                    this.f30707.getClass();
                                    throw C2800.m8496(e, str3);
                                } catch (C12731 e4) {
                                    e = e4;
                                    str3 = strM8495;
                                    if (e.f42472.equals("FILE_OPERATION_INTERRUPTED") && Thread.currentThread().isInterrupted()) {
                                        throw m23262(str3);
                                    }
                                    throw e;
                                }
                            } catch (IOException e5) {
                                e = e5;
                            } catch (IllegalArgumentException e6) {
                                e = e6;
                                str3 = strM8495;
                                this.f30707.getClass();
                                throw C2800.m8496(e, str3);
                            } catch (SecurityException e7) {
                                e = e7;
                                str3 = strM8495;
                                this.f30707.getClass();
                                throw C2800.m8496(e, str3);
                            } catch (C12731 e8) {
                                e = e8;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            i = 1;
                            c10458.m26423();
                            synchronized (this) {
                                this.f30711.remove(c10458);
                            }
                            m23261(str2);
                            if (i != 0) {
                                this.f30715.release();
                            }
                            throw th;
                        }
                    } catch (IOException e9) {
                        e = e9;
                    } catch (IllegalArgumentException e10) {
                        e = e10;
                    } catch (SecurityException e11) {
                        e = e11;
                    } catch (C12731 e12) {
                        e = e12;
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("Text search canceled while waiting.");
                }
            } catch (Throwable th9) {
                th = th9;
                i = i2;
            }
        } catch (IOException e13) {
            e = e13;
        } catch (IllegalArgumentException e14) {
            e = e14;
        } catch (SecurityException e15) {
            e = e15;
        } catch (C12731 e16) {
            e = e16;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14690 m23263(C8258 c8258) throws C12731 {
        int i = c8258.f28715 ? 0 : 16;
        if (!c8258.f28712) {
            i |= 66;
        }
        try {
            return C14690.m35218(i, c8258.f28710);
        } catch (PatternSyntaxException e) {
            throw C12731.m31626("Invalid regular expression: " + e.getDescription(), "pattern", JSON.value(c8258.f28710), JSON.array(), JSON.object());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m23269(String str) {
        return C12731.m31627("FILE_CHANGED_DURING_READ", "The file changed. Restart text search with cursor=\"\".", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23265() {
        this.f30706.getClass();
        long jNanoTime = System.nanoTime();
        Iterator it = this.f30714.values().iterator();
        while (it.hasNext()) {
            C18841 c18841 = (C18841) it.next();
            if (jNanoTime - c18841.f61040 >= f30703) {
                it.remove();
                try {
                    c18841.f61039.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m23268() {
        if (this.f30713) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f30714;
        if (linkedHashMap.isEmpty() || this.f30708) {
            return;
        }
        if (this.f30709 == null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC18135());
            this.f30709 = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.setKeepAliveTime(1L, TimeUnit.SECONDS);
            this.f30709.allowCoreThreadTimeOut(true);
            this.f30709.setRemoveOnCancelPolicy(true);
        }
        Iterator it = linkedHashMap.values().iterator();
        long jMin = C17492.FOREVER_NS;
        while (it.hasNext()) {
            jMin = Math.min(jMin, ((C18841) it.next()).f61040);
        }
        this.f30713 = true;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = this.f30709;
        RunnableC1441 runnableC1441 = new RunnableC1441(1, this);
        this.f30706.getClass();
        scheduledThreadPoolExecutor2.schedule(runnableC1441, Math.max(1L, f30703 - (System.nanoTime() - jMin)), TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23267(C8964 c8964) {
        synchronized (c8964) {
            c8964.f30713 = false;
            c8964.m23265();
            c8964.m23268();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        C18841[] c18841Arr;
        HashSet hashSet;
        synchronized (this) {
            this.f30708 = true;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f30709;
            if (scheduledThreadPoolExecutor != null) {
                scheduledThreadPoolExecutor.shutdownNow();
            }
            c18841Arr = (C18841[]) this.f30714.values().toArray(new C18841[0]);
            this.f30714.clear();
            hashSet = new HashSet(this.f30711);
            this.f30711.clear();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C10458) it.next()).m26421();
        }
        for (C18841 c18841 : c18841Arr) {
            try {
                c18841.f61039.close();
            } catch (IOException unused) {
            }
        }
    }
}
