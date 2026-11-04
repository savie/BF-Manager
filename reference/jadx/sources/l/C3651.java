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

/* JADX INFO: renamed from: l.ۗ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6V4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3651 implements Closeable {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final long f12483 = TimeUnit.MINUTES.toNanos(2);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f12484;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f12485;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f12486;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C22209 f12487;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ScheduledThreadPoolExecutor f12488;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final long f12489;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Semaphore f12490;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C10792 f12491;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashSet f12492;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f12493;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f12494;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f12495;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized C10186 m11824(String str) {
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, str == null ? JSON.NULL : JSON.value(str));
        if (this.f12485) {
            return C10186.m26302("FILE_SEARCH_CANCELED", "Text search service is closed. Restore the MCP service before retrying. After an application process restart, start a new search with cursor=\"\".", "warning", (JSONArray) null, jSONObjectAdd);
        }
        return C10186.m26299(jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized C23922 m11826(String str, C20192 c20192) {
        C17821 c17821;
        m11827();
        c17821 = (C17821) this.f12495.remove(str);
        if (c17821 != null) {
            c20192.m46434(c17821.f58468);
        }
        return c17821 == null ? null : c17821.f58468;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m11828(String str, C23922 c23922, C20192 c20192) {
        if (!this.f12485 && this.f12484 != 0 && c23922.m53438() <= this.f12493) {
            m11827();
            m11832(str);
            c20192.m46438();
            LinkedHashMap linkedHashMap = this.f12495;
            this.f12491.getClass();
            linkedHashMap.put(str, new C17821(c23922, System.nanoTime()));
            while (true) {
                if (this.f12495.size() <= this.f12484) {
                    Iterator it = this.f12495.values().iterator();
                    long jM53438 = 0;
                    while (it.hasNext()) {
                        jM53438 += ((C17821) it.next()).f58468.m53438();
                    }
                    if (jM53438 <= this.f12493) {
                        m11831();
                        return;
                    }
                }
                m11832((String) this.f12495.keySet().iterator().next());
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private synchronized void m11832(String str) {
        C17821 c17821 = (C17821) this.f12495.remove(str);
        if (c17821 != null) {
            try {
                c17821.f58468.close();
            } catch (IOException unused) {
            }
        }
    }

    public C3651(C22209 c22209) {
        C10792 c10792 = new C10792();
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        this.f12490 = new Semaphore(4, true);
        this.f12495 = new LinkedHashMap(16, 0.75f, true);
        this.f12492 = new HashSet();
        this.f12487 = c22209;
        this.f12491 = c10792;
        this.f12486 = X931RNG.BLOCK128_RESEED_MAX;
        this.f12489 = nanos;
        this.f12484 = 8;
        this.f12493 = 16777216L;
    }

    /* JADX WARN: Code duplicated, block: B:240:0x0392  */
    /* JADX WARN: Code duplicated, block: B:262:0x0387 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23789 m11833(String str, C16329 c16329, String str2) throws Throwable {
        int i;
        Throwable th;
        C20192 c20192 = new C20192();
        String str3 = null;
        int i2 = 0;
        try {
            try {
                synchronized (this) {
                    if (this.f12485) {
                        throw new IOException("Text search service is closed.");
                    }
                    this.f12492.add(c20192);
                }
                try {
                    C10801.m27510(this.f12490);
                    try {
                        try {
                            synchronized (this) {
                                if (this.f12485) {
                                    throw new IOException("Text search service is closed.");
                                }
                            }
                            C23176.m52093();
                            C9113 c9113M50227 = this.f12487.m50227();
                            this.f12487.getClass();
                            String strM50219 = C22209.m50219(str, c9113M50227, MotionUtils.EASING_TYPE_PATH);
                            try {
                                C11241 c11241M28465 = str2.isEmpty() ? null : C11241.m28465(str2, strM50219);
                                if (c11241M28465 != null && (!c16329.f53012.equals(c11241M28465.f35499) || !c16329.m38756(c11241M28465.f35499).equals(c11241M28465.f35497))) {
                                    throw C10186.m26302("FILE_INVALID_CURSOR", "The text search cursor is invalid or does not match this request. Restart with cursor=\"\".", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM50219));
                                }
                                C18415 c18415M11825 = str2.isEmpty() ? m11825(c16329) : null;
                                try {
                                    C19225 c19225M50228 = this.f12487.m50228(strM50219);
                                    try {
                                        C22209 c22209 = this.f12487;
                                        c22209.m50230(c22209.m50232(strM50219));
                                        C1907 c1907M50234 = this.f12487.m50234(strM50219);
                                        C22209 c222010 = this.f12487;
                                        try {
                                            if (c1907M50234.m6567() == EnumC13093.MISSING) {
                                                c222010.getClass();
                                                throw C22209.m50225(strM50219);
                                            }
                                            if (c1907M50234.m6567() != EnumC13093.REGULAR) {
                                                EnumC13093 enumC13093M6567 = c1907M50234.m6567();
                                                c222010.getClass();
                                                throw C22209.m50223("FILE_NOT_REGULAR", "Text search requires a regular file.", strM50219, enumC13093M6567);
                                            }
                                            if (c1907M50234.m6566() > 9007199254740991L) {
                                                throw C10186.m26302("FILE_STORAGE_ERROR", "File size exceeds the supported JSON integer range.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM50219));
                                            }
                                            byte[] bArrCopyOf = new byte[32768];
                                            InputStream inputStreamMo4290 = c1907M50234.m6565().mo4290();
                                            C3038 c3038M46434 = c20192.m46434(inputStreamMo4290);
                                            while (i2 < 32768) {
                                                try {
                                                    try {
                                                        C23176.m52093();
                                                        int i3 = inputStreamMo4290.read(bArrCopyOf, i2, 32768 - i2);
                                                        if (i3 < 0) {
                                                            break;
                                                        }
                                                        if (i3 == 0) {
                                                            int i4 = inputStreamMo4290.read();
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
                                                            c3038M46434.close();
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
                                            c3038M46434.close();
                                            if (i2 != 32768) {
                                                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i2);
                                            }
                                            String strM36182 = C15022.m36182(C15022.m36179().digest(bArrCopyOf));
                                            C10495 c10495M50579 = C22430.m50579(c16329.f53012, bArrCopyOf);
                                            if (c11241M28465 == null) {
                                                c11241M28465 = new C11241(strM50219, c16329.m38756(c10495M50579.f33395), c10495M50579.f33395, c1907M50234.m6566(), c1907M50234.m6568(), strM36182);
                                                long j = c10495M50579.f33394;
                                                c11241M28465.f35500 = j;
                                                c11241M28465.f35496 = j;
                                            } else if (c11241M28465.f35502 != c1907M50234.m6566() || c11241M28465.f35494 != c1907M50234.m6568() || !c11241M28465.f35498.equals(strM36182) || !c11241M28465.f35499.equals(c10495M50579.f33395)) {
                                                throw m11830(strM50219);
                                            }
                                            C11241 c11241 = c11241M28465;
                                            C23922 c23922M11826 = m11826(str2, c20192);
                                            if (c23922M11826 == null) {
                                                C23922 c23922 = new C23922(c1907M50234.m6565(), c10495M50579, c11241, c16329, c18415M11825 == null ? m11825(c16329) : c18415M11825, c20192);
                                                c20192.m46434(c23922);
                                                c23922M11826 = c23922;
                                            } else {
                                                c11241 = c23922M11826.f77448;
                                            }
                                            C6022 c6022M53439 = c23922M11826.m53439(this.f12486, this.f12489, this.f12491);
                                            synchronized (this) {
                                                if (this.f12485) {
                                                    throw new IOException("Text search service is closed.");
                                                }
                                            }
                                            C1907 c1907M50235 = this.f12487.m50234(strM50219);
                                            if (c6022M53439.f20585.equals(d.aB)) {
                                                long j2 = c11241.f35502;
                                                if (j2 >= 0 && c11241.f35496 != j2) {
                                                    throw m11830(strM50219);
                                                }
                                            }
                                            if (c1907M50235.m6567() != EnumC13093.REGULAR || c1907M50235.m6566() != c1907M50234.m6566() || c1907M50235.m6568() != c1907M50234.m6568()) {
                                                throw m11830(strM50219);
                                            }
                                            this.f12487.m50227().m24268(strM50219);
                                            JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM50219).add("encoding", c11241.f35499).add("matchedLines", c6022M53439.f20587).add("blocks", c6022M53439.m17485()).add("searchedThroughByteOffset", c11241.f35496);
                                            long j3 = c11241.f35502;
                                            JSONObject jSONObjectAdd2 = jSONObjectAdd.add("scanSize", j3 < 0 ? JSON.NULL : JSON.value(j3)).add("stopReason", c6022M53439.f20585).add("warnings", c6022M53439.f20583);
                                            String strM28467 = (c6022M53439.f20585.equals(d.aB) || c6022M53439.f20585.equals("resource_limit") || c6022M53439.f20585.equals("decode_error")) ? "" : c11241.m28467();
                                            if (!strM28467.isEmpty()) {
                                                m11828(strM28467, c23922M11826, c20192);
                                            }
                                            C23789 c23789 = new C23789(jSONObjectAdd2, strM28467);
                                            c19225M50228.close();
                                            c20192.m46437();
                                            synchronized (this) {
                                                this.f12492.remove(c20192);
                                            }
                                            m11832(str2);
                                            this.f12490.release();
                                            return c23789;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            th = th;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                    try {
                                        c19225M50228.close();
                                        throw th;
                                    } catch (Throwable th7) {
                                        th.addSuppressed(th7);
                                        throw th;
                                    }
                                } catch (IOException e) {
                                    e = e;
                                    str3 = strM50219;
                                    i2 = 1;
                                    synchronized (this) {
                                        if (!this.f12485 && !c20192.m46436() && !Thread.currentThread().isInterrupted()) {
                                        }
                                        throw m11824(str3);
                                    }
                                    this.f12487.getClass();
                                    throw C22209.m50221(str3, e);
                                } catch (IllegalArgumentException e2) {
                                    e = e2;
                                    str3 = strM50219;
                                    this.f12487.getClass();
                                    throw C22209.m50220(e, str3);
                                } catch (SecurityException e3) {
                                    e = e3;
                                    str3 = strM50219;
                                    this.f12487.getClass();
                                    throw C22209.m50220(e, str3);
                                } catch (C10186 e4) {
                                    e = e4;
                                    str3 = strM50219;
                                    if (e.f32601.equals("FILE_OPERATION_INTERRUPTED") && Thread.currentThread().isInterrupted()) {
                                        throw m11824(str3);
                                    }
                                    throw e;
                                }
                            } catch (IOException e5) {
                                e = e5;
                            } catch (IllegalArgumentException e6) {
                                e = e6;
                                str3 = strM50219;
                                this.f12487.getClass();
                                throw C22209.m50220(e, str3);
                            } catch (SecurityException e7) {
                                e = e7;
                                str3 = strM50219;
                                this.f12487.getClass();
                                throw C22209.m50220(e, str3);
                            } catch (C10186 e8) {
                                e = e8;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            i = 1;
                            c20192.m46437();
                            synchronized (this) {
                                this.f12492.remove(c20192);
                                m11832(str2);
                                if (i != 0) {
                                    this.f12490.release();
                                }
                                throw th;
                            }
                        }
                    } catch (IOException e9) {
                        e = e9;
                    } catch (IllegalArgumentException e10) {
                        e = e10;
                    } catch (SecurityException e11) {
                        e = e11;
                    } catch (C10186 e12) {
                        e = e12;
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("Text search canceled while waiting.");
                }
            } catch (Throwable th9) {
                th = th9;
                i = i2;
                c20192.m46437();
                synchronized (this) {
                    this.f12492.remove(c20192);
                }
                m11832(str2);
                if (i != 0) {
                    this.f12490.release();
                }
                throw th;
            }
        } catch (IOException e13) {
            e = e13;
        } catch (IllegalArgumentException e14) {
            e = e14;
        } catch (SecurityException e15) {
            e = e15;
        } catch (C10186 e16) {
            e = e16;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18415 m11825(C16329 c16329) throws C10186 {
        int i = c16329.f53006 ? 0 : 16;
        if (!c16329.f53005) {
            i |= 66;
        }
        try {
            return C18415.m42924(i, c16329.f53008);
        } catch (PatternSyntaxException e) {
            throw C10186.m26301("Invalid regular expression: " + e.getDescription(), "pattern", JSON.value(c16329.f53008), JSON.array(), JSON.object());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m11830(String str) {
        return C10186.m26302("FILE_CHANGED_DURING_READ", "The file changed. Restart text search with cursor=\"\".", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11827() {
        this.f12491.getClass();
        long jNanoTime = System.nanoTime();
        Iterator it = this.f12495.values().iterator();
        while (it.hasNext()) {
            C17821 c17821 = (C17821) it.next();
            if (jNanoTime - c17821.f58469 >= f12483) {
                it.remove();
                try {
                    c17821.f58468.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m11831() {
        if (this.f12494) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f12495;
        if (linkedHashMap.isEmpty() || this.f12485) {
            return;
        }
        if (this.f12488 == null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC17075());
            this.f12488 = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.setKeepAliveTime(1L, TimeUnit.SECONDS);
            this.f12488.allowCoreThreadTimeOut(true);
            this.f12488.setRemoveOnCancelPolicy(true);
        }
        Iterator it = linkedHashMap.values().iterator();
        long jMin = C25227.FOREVER_NS;
        while (it.hasNext()) {
            jMin = Math.min(jMin, ((C17821) it.next()).f58469);
        }
        this.f12494 = true;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = this.f12488;
        RunnableC23484 runnableC23484 = new RunnableC23484(4, this);
        this.f12491.getClass();
        scheduledThreadPoolExecutor2.schedule(runnableC23484, Math.max(1L, f12483 - (System.nanoTime() - jMin)), TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11829(C3651 c3651) {
        synchronized (c3651) {
            c3651.f12494 = false;
            c3651.m11827();
            c3651.m11831();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        C17821[] c17821Arr;
        HashSet hashSet;
        synchronized (this) {
            this.f12485 = true;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f12488;
            if (scheduledThreadPoolExecutor != null) {
                scheduledThreadPoolExecutor.shutdownNow();
            }
            c17821Arr = (C17821[]) this.f12495.values().toArray(new C17821[0]);
            this.f12495.clear();
            hashSet = new HashSet(this.f12492);
            this.f12492.clear();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C20192) it.next()).m46435();
        }
        for (C17821 c17821 : c17821Arr) {
            try {
                c17821.f58468.close();
            } catch (IOException unused) {
            }
        }
    }
}
