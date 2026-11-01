package l;

import android.os.SystemClock;
import android.text.TextUtils;
import bin.mt.plus.R;
import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.y.k;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.RadialViewGroup;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܰ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7BH */
/* JADX INFO: loaded from: classes3.dex */
public final class C14022 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Pattern f46082 = Pattern.compile("(.*) \\((\\d+)\\)");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C14022 f46083 = new C14022();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C0284 f46084 = new C0284();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f46085 = new AtomicLong(1);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f46086 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14022 m33911() {
        return f46083;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33938(String str, String str2, String str3, boolean z, boolean z2) {
        C4848 c4848 = (C4848) this.f46086.get(str);
        if (c4848 == null) {
            return;
        }
        synchronized (c4848) {
            m33914(c4848, SystemClock.elapsedRealtime());
            if (!c4848.f17056 && !c4848.f17065.contains(str2)) {
                C1695 c1695 = c4848.f17033;
                if (c1695 != null && TextUtils.equals(c1695.f6712, str2)) {
                    C3106 c3106 = (C3106) c4848.f17039.get(c1695.f6710);
                    if (c3106 == null) {
                        m33927(c4848);
                        m33922(c4848);
                        return;
                    }
                    boolean z3 = "replace".equals(str3) && z2 && c1695.f6713;
                    c4848.f17065.add(str2);
                    c4848.f17067 = str3;
                    c4848.f17048 = z3;
                    if (c1695.f6711) {
                        c3106.f11703 = "pending";
                        if (z) {
                            c4848.f17041 = true;
                            c4848.f17061 = str3;
                            c4848.f17070 = z3;
                            c4848.f17050 = null;
                        } else {
                            String unused = c1695.f6712;
                            c4848.f17050 = new C14397(c1695.f6710, c1695.f6712, str3, z3);
                        }
                        m33927(c4848);
                    } else if (z) {
                        c4848.f17041 = true;
                        c4848.f17061 = str3;
                        c4848.f17070 = z3;
                        for (C3106 c3107 : c4848.f17039.values()) {
                            if (c3107.f11701) {
                                m33917(c4848, c3107, str3, z3);
                            }
                        }
                        m33927(c4848);
                    } else {
                        m33917(c4848, c3106, str3, z3);
                        m33927(c4848);
                        m33908(c4848);
                    }
                    m33922(c4848);
                    return;
                }
                m33922(c4848);
                return;
            }
            m33922(c4848);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m33933(String str) {
        C4848 c4848 = (C4848) this.f46086.get(str);
        if (c4848 == null) {
            return false;
        }
        synchronized (c4848) {
            if (c4848.f17056) {
                return true;
            }
            m33914(c4848, SystemClock.elapsedRealtime());
            c4848.f17043 = true;
            m33927(c4848);
            if (!(c4848.f17068 || c4848.f17071)) {
                m33930(c4848);
            } else {
                m33922(c4848);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m33939(String str) {
        LinkedHashMap linkedHashMapM33932;
        LinkedHashMap linkedHashMapM33933;
        C4848 c4848 = (C4848) this.f46086.get(str);
        if (c4848 == null) {
            return null;
        }
        synchronized (c4848) {
            m33914(c4848, SystemClock.elapsedRealtime());
            if (!c4848.f17056 && !c4848.f17032 && c4848.f17033 == null) {
                Iterator it = c4848.f17039.values().iterator();
                do {
                    if (!it.hasNext()) {
                        c4848.f17068 = true;
                        m33924(c4848);
                        ArrayList<C3106> arrayListM33907 = m33907(c4848);
                        try {
                            try {
                                for (C3106 c3106 : arrayListM33907) {
                                    synchronized (c4848) {
                                        if (c4848.f17056) {
                                            LinkedHashMap linkedHashMapM33934 = m33932(c4848);
                                            synchronized (c4848) {
                                                c4848.f17068 = false;
                                                if (!c4848.f17056) {
                                                    if (c4848.f17043) {
                                                        m33930(c4848);
                                                    } else {
                                                        c4848.f17032 = true;
                                                        m33922(c4848);
                                                    }
                                                }
                                            }
                                            return linkedHashMapM33934;
                                        }
                                        if (c4848.f17043) {
                                            m33930(c4848);
                                            LinkedHashMap linkedHashMapM33935 = m33932(c4848);
                                            synchronized (c4848) {
                                                c4848.f17068 = false;
                                                if (!c4848.f17056) {
                                                    if (c4848.f17043) {
                                                        m33930(c4848);
                                                    } else {
                                                        c4848.f17032 = true;
                                                        m33922(c4848);
                                                    }
                                                }
                                            }
                                            return linkedHashMapM33935;
                                        }
                                        c4848.f17051 = c3106.f11713;
                                        AbstractC20745 abstractC20745M33912 = m33912(c4848, c3106);
                                        try {
                                            C2462.m7542(abstractC20745M33912, EnumC11636.MODIFY_FILE);
                                            if (abstractC20745M33912.mo33975() && !abstractC20745M33912.mo33974()) {
                                                synchronized (c4848) {
                                                    m33928(c4848, m33920(abstractC20745M33912.mo33986()));
                                                    linkedHashMapM33933 = m33932(c4848);
                                                }
                                                synchronized (c4848) {
                                                    c4848.f17068 = false;
                                                    if (!c4848.f17056) {
                                                        if (c4848.f17043) {
                                                            m33930(c4848);
                                                        } else {
                                                            c4848.f17032 = true;
                                                            m33922(c4848);
                                                        }
                                                    }
                                                }
                                                return linkedHashMapM33933;
                                            }
                                            if (!abstractC20745M33912.mo33975()) {
                                                abstractC20745M33912.m46739();
                                                C22252.m49408(abstractC20745M33912.mo33986(), true);
                                            }
                                            synchronized (c4848) {
                                                if (!m33931(c3106.f11703)) {
                                                    c3106.f11703 = "success";
                                                    String strM43078 = C18629.m43078(abstractC20745M33912.mo33986());
                                                    if (!TextUtils.isEmpty(strM43078) && !"/".equals(strM43078)) {
                                                        strM43078 = strM43078.concat("/");
                                                    }
                                                    c3106.f11702 = strM43078;
                                                    c4848.f17063++;
                                                    if (c3106.f11712) {
                                                        c4848.f17037.add(c3106.f11702);
                                                    }
                                                    m33922(c4848);
                                                }
                                            }
                                        } catch (C4987 e) {
                                            throw new IOException(e);
                                        }
                                    }
                                }
                                synchronized (c4848) {
                                    c4848.f17068 = false;
                                    if (!c4848.f17056) {
                                        if (c4848.f17043) {
                                            m33930(c4848);
                                        } else {
                                            c4848.f17032 = true;
                                            m33922(c4848);
                                        }
                                    }
                                }
                                synchronized (c4848) {
                                    linkedHashMapM33932 = m33932(c4848);
                                }
                                return linkedHashMapM33932;
                            } catch (IOException e2) {
                                synchronized (c4848) {
                                    if (!c4848.f17056) {
                                        m33928(c4848, m33905(e2.getMessage()));
                                    }
                                    throw e2;
                                }
                            }
                        } catch (Throwable th) {
                            synchronized (c4848) {
                                c4848.f17068 = false;
                                if (!c4848.f17056) {
                                    if (c4848.f17043) {
                                        m33930(c4848);
                                    } else {
                                        c4848.f17032 = true;
                                        m33922(c4848);
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                } while (!((C3106) it.next()).f11701);
            }
            m33922(c4848);
            return m33932(c4848);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m33936(String str, String str2) {
        C4848 c4848 = (C4848) this.f46086.get(str);
        if (c4848 == null) {
            return null;
        }
        synchronized (c4848) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            m33914(c4848, jElapsedRealtime);
            if (!c4848.f17056 && !c4848.f17043 && c4848.f17033 == null && c4848.f17032) {
                String strM33921 = m33921(c4848);
                if (!TextUtils.isEmpty(strM33921) && TextUtils.equals(strM33921, str2)) {
                    C3106 c3106 = (C3106) c4848.f17039.get(str2);
                    if (c3106 != null && C3106.m9308(c3106)) {
                        if (TextUtils.equals(c4848.f17036, str2) && TextUtils.equals(c3106.f11703, "armed") && jElapsedRealtime - c4848.f17053 <= 60000) {
                            m33924(c4848);
                            m33922(c4848);
                            return m33932(c4848);
                        }
                        AbstractC20745 abstractC20745M33912 = m33912(c4848, c3106);
                        if (c3106.f11714) {
                            if (abstractC20745M33912.mo33975() && abstractC20745M33912.mo33974()) {
                                m33928(c4848, m33920(abstractC20745M33912.mo33986()));
                                return m33932(c4848);
                            }
                        } else if (abstractC20745M33912.mo33975()) {
                            if (abstractC20745M33912.mo33974()) {
                                m33928(c4848, m33920(abstractC20745M33912.mo33986()));
                                return m33932(c4848);
                            }
                            if (!m33929(c4848, c3106) && !c4848.f17041) {
                                m33918(c4848, c3106, abstractC20745M33912);
                                m33922(c4848);
                                return m33932(c4848);
                            }
                        } else {
                            m33915(c4848, c3106.f11713);
                        }
                        c3106.f11703 = "armed";
                        c4848.f17036 = c3106.f11713;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("-a");
                        long j = c4848.f17047;
                        c4848.f17047 = 1 + j;
                        sb.append(j);
                        c4848.f17058 = sb.toString();
                        c4848.f17053 = jElapsedRealtime;
                        c4848.f17051 = c3106.f11713;
                        m33924(c4848);
                        m33922(c4848);
                        return m33932(c4848);
                    }
                    m33925(c4848, strM33921);
                    m33922(c4848);
                    return m33932(c4848);
                }
                m33925(c4848, strM33921);
                m33922(c4848);
                return m33932(c4848);
            }
            m33922(c4848);
            return m33932(c4848);
        }
    }

    /* JADX WARN: Code duplicated, block: B:197:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:199:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:247:0x0210 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:? A[Catch: all -> 0x021a, IOException -> 0x022b, CancellationException -> 0x0283, SYNTHETIC, TryCatch #21 {all -> 0x021a, blocks: (B:31:0x008f, B:32:0x0094, B:68:0x010c, B:71:0x0119, B:93:0x016b, B:94:0x0178, B:111:0x01d6, B:175:0x0285, B:177:0x028b, B:179:0x0290, B:194:0x02b5, B:120:0x01e5, B:121:0x01e6, B:122:0x01fe, B:137:0x0219, B:136:0x0216, B:145:0x0224, B:146:0x022a, B:181:0x0292, B:182:0x02a1), top: B:253:0x008e, inners: #6 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m33937(String str, String str2, String str3, long j, InputStream inputStream) throws Throwable {
        IOException iOException;
        Throwable th;
        AbstractC20745 abstractC20745;
        LinkedHashMap linkedHashMapM33932;
        C4848 c4848 = (C4848) this.f46086.get(str);
        if (c4848 == null) {
            return null;
        }
        synchronized (c4848) {
            m33914(c4848, SystemClock.elapsedRealtime());
            if (!c4848.f17056 && !c4848.f17043) {
                if (TextUtils.equals(c4848.f17036, str2) && TextUtils.equals(c4848.f17058, str3)) {
                    C3106 c3106 = (C3106) c4848.f17039.get(str2);
                    if (c3106 != null && C3106.m9308(c3106)) {
                        if (j != c3106.f11708) {
                            throw new C23569(C16737.m39288(R.string.MT_Protector));
                        }
                        c4848.f17071 = true;
                        C10869 c10869M33923 = m33923(c4848, c3106);
                        AbstractC20745 abstractC20746 = null;
                        if (!c10869M33923.f36958) {
                            c4848.f17071 = false;
                            m33922(c4848);
                            return m33932(c4848);
                        }
                        AbstractC20745 abstractC20747 = c10869M33923.f36956;
                        AbstractC20745 abstractC20748 = c10869M33923.f36957;
                        boolean z = c10869M33923.f36959;
                        boolean z2 = c10869M33923.f36955;
                        long j2 = c3106.f11708;
                        try {
                            try {
                                try {
                                    try {
                                        C2462.m7542(abstractC20748, EnumC11636.MODIFY_FILE);
                                        OutputStream outputStreamMo33976 = abstractC20748.mo33976(false);
                                        int i = 65536;
                                        try {
                                            byte[] bArr = new byte[65536];
                                            long j3 = 0;
                                            while (true) {
                                                if (j3 >= j2) {
                                                    abstractC20745 = abstractC20748;
                                                    break;
                                                }
                                                try {
                                                    try {
                                                        synchronized (c4848) {
                                                            try {
                                                                if (c4848.f17043) {
                                                                    throw new CancellationException();
                                                                }
                                                                abstractC20745 = abstractC20748;
                                                                try {
                                                                    bArr = bArr;
                                                                    int i2 = inputStream.read(bArr, 0, (int) Math.min(i, j2 - j3));
                                                                    if (i2 == -1) {
                                                                        break;
                                                                    }
                                                                    outputStreamMo33976.write(bArr, 0, i2);
                                                                    long j4 = j2;
                                                                    long j5 = i2;
                                                                    j3 += j5;
                                                                    synchronized (c4848) {
                                                                        c4848.f17055 += j5;
                                                                        c4848.f17038 = m33909(c4848, i2);
                                                                        c4848.f17051 = c3106.f11713;
                                                                        m33922(c4848);
                                                                    }
                                                                    abstractC20748 = abstractC20745;
                                                                    j2 = j4;
                                                                    i = 65536;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    th = th;
                                                                    if (outputStreamMo33976 != null) {
                                                                        throw th;
                                                                    }
                                                                    try {
                                                                        outputStreamMo33976.close();
                                                                        throw th;
                                                                    } catch (Throwable th3) {
                                                                        th.addSuppressed(th3);
                                                                        throw th;
                                                                    }
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    if (outputStreamMo33976 != null) {
                                                        throw th;
                                                    }
                                                    outputStreamMo33976.close();
                                                    throw th;
                                                }
                                            }
                                            outputStreamMo33976.flush();
                                            try {
                                                outputStreamMo33976.close();
                                                if (j3 != c3106.f11708) {
                                                    throw new IOException(C16737.m39264(R.string.MT_Protector, c3106.f11713));
                                                }
                                                try {
                                                    synchronized (c4848) {
                                                        try {
                                                            if (c4848.f17043) {
                                                                throw new CancellationException();
                                                            }
                                                            if (!z2 && abstractC20747.mo33975()) {
                                                                c4848.f17055 = Math.max(0L, c4848.f17055 - j3);
                                                                c4848.f17038 = 0L;
                                                                c4848.f17059 = 0L;
                                                                c4848.f17042 = 0L;
                                                                c4848.f17071 = false;
                                                                m33918(c4848, c3106, abstractC20747);
                                                                m33922(c4848);
                                                                if (abstractC20745.mo33975()) {
                                                                    abstractC20745.mo24647();
                                                                }
                                                                LinkedHashMap linkedHashMapM33933 = m33932(c4848);
                                                                synchronized (c4848) {
                                                                    c4848.f17071 = false;
                                                                    c4848.f17038 = 0L;
                                                                }
                                                                return linkedHashMapM33933;
                                                            }
                                                            m33919(abstractC20747, abstractC20745, z, z2, c4848);
                                                            C22252.m49408(abstractC20747.mo33986(), true);
                                                            synchronized (c4848) {
                                                                c3106.f11703 = "success";
                                                                c3106.f11702 = C18629.m43078(abstractC20747.mo33986());
                                                                c3106.f11704 = "";
                                                                c4848.f17063++;
                                                                if (c3106.f11712) {
                                                                    c4848.f17037.add(c3106.f11702);
                                                                }
                                                                c4848.f17071 = false;
                                                                c4848.f17051 = c3106.f11713;
                                                                c4848.f17038 = 0L;
                                                                m33924(c4848);
                                                                m33922(c4848);
                                                                linkedHashMapM33932 = m33932(c4848);
                                                            }
                                                            synchronized (c4848) {
                                                                c4848.f17071 = false;
                                                                c4848.f17038 = 0L;
                                                            }
                                                            return linkedHashMapM33932;
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                }
                                            } catch (IOException e) {
                                                e = e;
                                                abstractC20746 = abstractC20745;
                                                iOException = e;
                                                if (abstractC20746 != null) {
                                                    try {
                                                        if (abstractC20746.mo33975()) {
                                                            abstractC20746.mo24647();
                                                        }
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        if (iOException == null) {
                                                            synchronized (c4848) {
                                                                c4848.f17071 = false;
                                                                c4848.f17038 = 0L;
                                                            }
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                synchronized (c4848) {
                                                    try {
                                                        c4848.f17071 = false;
                                                        c4848.f17038 = 0L;
                                                        if (c4848.f17043) {
                                                            m33930(c4848);
                                                        } else {
                                                            String str4 = c3106.f11702;
                                                            if (!TextUtils.isEmpty(str4) && !C5553.m15313(str4, new String[0]).mo33975()) {
                                                                c4848.f17074.remove(str4);
                                                            }
                                                            m33928(c4848, m33905(iOException.getMessage()));
                                                        }
                                                        return m33932(c4848);
                                                    } catch (Throwable th10) {
                                                        throw th10;
                                                    }
                                                }
                                            } catch (CancellationException unused) {
                                                abstractC20746 = abstractC20745;
                                                if (abstractC20746 != null && abstractC20746.mo33975()) {
                                                    abstractC20746.mo24647();
                                                }
                                                synchronized (c4848) {
                                                    c4848.f17071 = false;
                                                    c4848.f17038 = 0L;
                                                    m33930(c4848);
                                                    LinkedHashMap linkedHashMapM33934 = m33932(c4848);
                                                    synchronized (c4848) {
                                                        c4848.f17071 = false;
                                                        c4848.f17038 = 0L;
                                                        return linkedHashMapM33934;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                        }
                                    } catch (C4987 e2) {
                                        throw new IOException(e2);
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    abstractC20746 = abstractC20748;
                                } catch (CancellationException unused2) {
                                    abstractC20746 = abstractC20748;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                iOException = null;
                                if (iOException == null) {
                                    synchronized (c4848) {
                                        c4848.f17071 = false;
                                        c4848.f17038 = 0L;
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException e4) {
                            e = e4;
                        } catch (CancellationException unused3) {
                        }
                    }
                    m33925(c4848, m33921(c4848));
                    m33922(c4848);
                    return m33932(c4848);
                }
                m33925(c4848, m33921(c4848));
                m33922(c4848);
                return m33932(c4848);
            }
            m33922(c4848);
            return m33932(c4848);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m33935(String str) {
        C4848 c4848 = (C4848) this.f46086.get(str);
        if (c4848 == null) {
            return null;
        }
        synchronized (c4848) {
            m33914(c4848, SystemClock.elapsedRealtime());
            if (c4848.f17056) {
                return m33932(c4848);
            }
            boolean z = true;
            if (c4848.f17043) {
                if (!(c4848.f17068 || c4848.f17071)) {
                    m33930(c4848);
                    return m33932(c4848);
                }
            }
            if (c4848.f17032 && c4848.f17033 == null) {
                if (!c4848.f17068 && !c4848.f17071) {
                    z = false;
                }
                if (!z) {
                    Iterator it = c4848.f17039.values().iterator();
                    while (it.hasNext()) {
                        if (!m33931(((C3106) it.next()).f11703)) {
                            m33922(c4848);
                            return m33932(c4848);
                        }
                    }
                    m33906(c4848);
                    return m33932(c4848);
                }
            }
            m33922(c4848);
            return m33932(c4848);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0090  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33916(C4848 c4848, List list) throws IOException {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9458 c9458 = (C9458) it.next();
            if (c9458 == null) {
                throw new IOException(C16737.m39288(R.string.MT_Protector));
            }
            String str2 = c9458.f32009;
            if (TextUtils.isEmpty(str2)) {
                str = "";
                break;
            }
            String strReplace = str2.replace('\\', '/');
            while (strReplace.startsWith("./")) {
                strReplace = strReplace.substring(2);
            }
            while (strReplace.startsWith("/")) {
                strReplace = strReplace.substring(1);
            }
            while (strReplace.endsWith("/") && strReplace.length() > 1) {
                strReplace = C20630.m46498(1, 0, strReplace);
            }
            if (TextUtils.isEmpty(strReplace) || ".".equals(strReplace)) {
                str = "";
                break;
            }
            String[] strArrSplit = strReplace.split("/");
            int length = strArrSplit.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = strReplace;
                    break;
                }
                String str3 = strArrSplit[i];
                if (TextUtils.isEmpty(str3) || ".".equals(str3) || "..".equals(str3)) {
                    str = "";
                    break;
                }
                i++;
            }
            if (TextUtils.isEmpty(str)) {
                throw new IOException(C16737.m39288(R.string.MT_Protector));
            }
            String str4 = c9458.f32010;
            if (!TextUtils.equals("file", str4) && !TextUtils.equals("directory", str4)) {
                throw new IOException(C16737.m39264(R.string.MT_Protector, str4));
            }
            C3106 c3106 = new C3106(str, str4, Math.max(c9458.f32012, 0L), Math.max(c9458.f32011, 0L), c9458.f32008);
            C3106 c3107 = (C3106) linkedHashMap.get(c3106.f11713);
            if (c3107 != null && !TextUtils.equals(c3107.f11711, c3106.f11711)) {
                throw new IOException(C16737.m39264(R.string.MT_Protector, c3106.f11713));
            }
            if (c3107 != null) {
                linkedHashMap.remove(c3106.f11713);
            }
            linkedHashMap.put(c3106.f11713, c3106);
        }
        c4848.f17039.clear();
        c4848.f17039.putAll(linkedHashMap);
        c4848.f17057 = c4848.f17039.size();
        c4848.f17040 = 0L;
        for (C3106 c3108 : c4848.f17039.values()) {
            if (C3106.m9308(c3108)) {
                c4848.f17040 = Math.max(c3108.f11708, 0L) + c4848.f17040;
            }
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static void m33926(C4848 c4848) throws IOException {
        for (C3106 c3106 : c4848.f17039.values()) {
            AbstractC20745 abstractC20745M33912 = m33912(c4848, c3106);
            if (C3106.m9319(c3106)) {
                if (!abstractC20745M33912.mo33975()) {
                    continue;
                } else {
                    if (!abstractC20745M33912.mo33974()) {
                        throw new IOException(m33920(abstractC20745M33912.mo33986()));
                    }
                    c3106.f11714 = true;
                }
            } else if (!abstractC20745M33912.mo33975()) {
                continue;
            } else {
                if (abstractC20745M33912.mo33974()) {
                    throw new IOException(m33920(abstractC20745M33912.mo33986()));
                }
                c3106.f11714 = true;
                c3106.f11706 = C18629.m43077(abstractC20745M33912);
                c3106.f11701 = true;
            }
        }
        m33908(c4848);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m33908(C4848 c4848) {
        for (C3106 c3106 : c4848.f17039.values()) {
            if (c3106.f11701) {
                StringBuilder sb = new StringBuilder();
                sb.append(c4848.f17072);
                sb.append("-c");
                long j = c4848.f17069;
                c4848.f17069 = 1 + j;
                sb.append(j);
                String string = sb.toString();
                AbstractC20745 abstractC20745M33912 = m33912(c4848, c3106);
                c3106.f11703 = "waiting_conflict";
                c4848.f17033 = new C1695(string, c3106.f11713, abstractC20745M33912.mo33986(), C20321.m45854(c3106.f11708, c3106.f11710), C20321.m45856(abstractC20745M33912), c4848.f17067, "replace".equals(c4848.f17067) && c3106.f11706 && c4848.f17048, c3106.f11706, false);
                c4848.f17054 = "waiting_conflict";
                String str = c3106.f11713;
                c4848.f17060 = "resolve_conflict";
                c4848.f17035 = m33905(str);
                return;
            }
        }
        m33927(c4848);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33917(C4848 c4848, C3106 c3106, String str, boolean z) {
        boolean z2 = false;
        c3106.f11701 = false;
        if (RadialViewGroup.SKIP_TAG.equals(str)) {
            c3106.f11703 = "skipped";
            if (c3106.f11709) {
                c3106.f11709 = false;
                c4848.f17057--;
                c4848.f17040 -= c3106.f11708;
                return;
            }
            return;
        }
        c3106.f11703 = "pending";
        c3106.f11707 = str;
        if ("replace".equals(str) && z && c3106.f11706) {
            z2 = true;
        }
        c3106.f11705 = z2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static ArrayList m33907(C4848 c4848) {
        ArrayList arrayList = new ArrayList();
        for (C3106 c3106 : c4848.f17039.values()) {
            if (C3106.m9319(c3106) && !m33931(c3106.f11703)) {
                arrayList.add(c3106);
            }
        }
        C23846.sort(arrayList, C21023.thenComparing(C7618.comparingInt(new C12280()), new C17218()));
        return arrayList;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C10869 m33923(C4848 c4848, C3106 c3106) {
        int i;
        String strM33921 = m33921(c4848);
        if (!TextUtils.equals(strM33921, c3106.f11713)) {
            m33925(c4848, strM33921);
            return C10869.m27230();
        }
        AbstractC20745 abstractC20745M33912 = m33912(c4848, c3106);
        if (c3106.f11714 && abstractC20745M33912.mo33975() && abstractC20745M33912.mo33974()) {
            m33928(c4848, m33920(abstractC20745M33912.mo33986()));
            return C10869.m27230();
        }
        if (!c3106.f11714 && abstractC20745M33912.mo33975() && abstractC20745M33912.mo33974()) {
            m33928(c4848, m33920(abstractC20745M33912.mo33986()));
            return C10869.m27230();
        }
        String str = c3106.f11707;
        boolean z = c3106.f11705;
        if (!c3106.f11714 && abstractC20745M33912.mo33975()) {
            if (m33929(c4848, c3106)) {
                str = c4848.f17050.f47201;
                z = c4848.f17050.f47202;
                c4848.f17050 = null;
            } else if (c4848.f17041) {
                str = c4848.f17061;
                z = "replace".equals(str) && c4848.f17070 && C18629.m43077(abstractC20745M33912);
                m33915(c4848, c3106.f11713);
            } else {
                m33918(c4848, c3106, abstractC20745M33912);
                return C10869.m27230();
            }
        } else {
            m33915(c4848, c3106.f11713);
        }
        if (RadialViewGroup.SKIP_TAG.equals(str)) {
            c3106.f11703 = "skipped";
            c3106.f11704 = "";
            if (c3106.f11709) {
                c4848.f17063++;
                c4848.f17040 -= c3106.f11708;
                c3106.f11709 = false;
            }
            m33913(c4848);
            m33924(c4848);
            m33922(c4848);
            return C10869.m27230();
        }
        if ("keep_both".equals(str)) {
            while (true) {
                String strM43078 = C18629.m43078(abstractC20745M33912.mo33986());
                if (!abstractC20745M33912.mo33975() && !c4848.f17074.contains(strM43078)) {
                    break;
                }
                AbstractC20745 abstractC20745M46693 = abstractC20745M33912.m46693(true);
                if (TextUtils.equals(abstractC20745M46693.mo33986(), abstractC20745M33912.mo33986())) {
                    String parent = abstractC20745M33912.getParent();
                    if (!TextUtils.isEmpty(parent)) {
                        String name = abstractC20745M33912.getName();
                        String strM46726 = abstractC20745M33912.m46726();
                        String strSubstring = name.substring(0, name.length() - strM46726.length());
                        Matcher matcher = f46082.matcher(strSubstring);
                        if (matcher.matches()) {
                            try {
                                i = Integer.parseInt(matcher.group(2));
                                try {
                                    strSubstring = matcher.group(1);
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                                i = 0;
                            }
                        } else {
                            i = 0;
                        }
                        abstractC20745M33912 = C5553.m15313(parent, strSubstring + " (" + (i + 1) + MotionUtils.EASING_TYPE_FORMAT_END + strM46726);
                    }
                } else {
                    abstractC20745M33912 = abstractC20745M46693;
                }
            }
        }
        String strM43079 = C18629.m43078(abstractC20745M33912.mo33986());
        c4848.f17074.add(strM43079);
        m33913(c4848);
        m33924(c4848);
        c3106.f11703 = "uploading";
        c3106.f11702 = strM43079;
        c3106.f11704 = "";
        boolean zMo33975 = abstractC20745M33912.mo33975();
        AbstractC20745 abstractC20745M46733 = abstractC20745M33912.m46733(".web_upload");
        c4848.f17051 = c3106.f11713;
        m33922(c4848);
        return C10869.m27231(abstractC20745M33912, abstractC20745M46733, z, zMo33975);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33918(C4848 c4848, C3106 c3106, AbstractC20745 abstractC20745) {
        StringBuilder sb = new StringBuilder();
        sb.append(c4848.f17072);
        sb.append("-c");
        long j = c4848.f17069;
        c4848.f17069 = 1 + j;
        sb.append(j);
        String string = sb.toString();
        boolean zM43077 = C18629.m43077(abstractC20745);
        c3106.f11706 = zM43077;
        c3106.f11703 = "waiting_conflict";
        c3106.f11704 = string;
        c4848.f17033 = new C1695(string, c3106.f11713, abstractC20745.mo33986(), C20321.m45854(c3106.f11708, c3106.f11710), C20321.m45856(abstractC20745), c4848.f17067, "replace".equals(c4848.f17067) && zM43077 && c4848.f17048, zM43077, true);
        c4848.f17054 = "waiting_conflict";
        String str = c3106.f11713;
        c4848.f17060 = "resolve_conflict";
        c4848.f17035 = m33905(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m33929(C4848 c4848, C3106 c3106) {
        return c4848.f17050 != null && TextUtils.equals(c4848.f17050.f47200, c3106.f11713) && TextUtils.equals(c4848.f17050.f47203, c3106.f11704);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33915(C4848 c4848, String str) {
        if (c4848.f17050 != null && TextUtils.equals(c4848.f17050.f47200, str)) {
            c4848.f17050 = null;
        }
        C3106 c3106 = (C3106) c4848.f17039.get(str);
        if (c3106 != null) {
            c3106.f11704 = "";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33914(C4848 c4848, long j) {
        if (TextUtils.isEmpty(c4848.f17036) || j - c4848.f17053 <= 60000) {
            return;
        }
        C3106 c3106 = (C3106) c4848.f17039.get(c4848.f17036);
        if (c3106 != null && TextUtils.equals(c3106.f11703, "armed")) {
            c3106.f11703 = "pending";
            m33915(c4848, c3106.f11713);
        }
        m33913(c4848);
        m33925(c4848, m33921(c4848));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m33925(C4848 c4848, String str) {
        c4848.f17060 = "restart_begin";
        c4848.f17035 = m33905(str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m33924(C4848 c4848) {
        c4848.f17060 = "none";
        c4848.f17035 = "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33913(C4848 c4848) {
        c4848.f17036 = "";
        c4848.f17058 = "";
        c4848.f17053 = 0L;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m33927(C4848 c4848) {
        c4848.f17033 = null;
        if (c4848.f17056) {
            return;
        }
        c4848.f17054 = "running";
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m33921(C4848 c4848) {
        ArrayList arrayList = new ArrayList();
        for (C3106 c3106 : c4848.f17039.values()) {
            if (C3106.m9308(c3106) && c3106.f11709 && !m33931(c3106.f11703) && !c3106.f11701) {
                arrayList.add(c3106);
            }
        }
        C23846.sort(arrayList, f46084);
        Iterator it = arrayList.iterator();
        return it.hasNext() ? ((C3106) it.next()).f11713 : "";
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m33922(C4848 c4848) {
        if (c4848.f17056) {
            if (c4848.f17040 == 0 && "success".equals(c4848.f17054)) {
                c4848.f17064 = 100;
            }
        } else if (c4848.f17040 > 0) {
            c4848.f17064 = (int) Math.max(0L, Math.min(100L, (c4848.f17055 * 100) / Math.max(c4848.f17040, 1L)));
        } else {
            c4848.f17064 = 0;
        }
        int iMax = Math.max(c4848.f17057 - c4848.f17063, 0);
        long jMax = Math.max(c4848.f17040 - c4848.f17055, 0L);
        if (c4848.f17057 <= 1) {
            c4848.f17052 = C1791.m5863(jMax) + "/" + C1791.m5863(Math.max(c4848.f17040, 0L));
        } else {
            c4848.f17052 = iMax + " (" + C1791.m5863(jMax) + "/" + C1791.m5863(Math.max(c4848.f17040, 0L)) + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (c4848.f17056) {
            m33924(c4848);
            m33913(c4848);
            m33927(c4848);
        } else if (c4848.f17033 == null) {
            c4848.f17054 = "running";
        }
        c4848.f17062 = m33921(c4848);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static void m33906(C4848 c4848) {
        c4848.f17056 = true;
        c4848.f17054 = "success";
        c4848.f17073 = SystemClock.elapsedRealtime();
        c4848.f17064 = c4848.f17040 == 0 ? 100 : c4848.f17064;
        c4848.f17045 = Collections.singletonList(c4848.f17044);
        List list = Collections.EMPTY_LIST;
        c4848.f17066 = Collections.EMPTY_LIST;
        c4848.f17049 = new ArrayList(c4848.f17037);
        c4848.f17038 = 0L;
        m33924(c4848);
        m33913(c4848);
        m33927(c4848);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m33930(C4848 c4848) {
        for (C3106 c3106 : c4848.f17039.values()) {
            if (!m33931(c3106.f11703)) {
                c3106.f11703 = "cancelled";
            }
        }
        c4848.f17056 = true;
        c4848.f17054 = "cancelled";
        c4848.f17046 = "";
        c4848.f17073 = SystemClock.elapsedRealtime();
        c4848.f17045 = Collections.singletonList(c4848.f17044);
        List list = Collections.EMPTY_LIST;
        c4848.f17066 = Collections.EMPTY_LIST;
        c4848.f17049 = list;
        c4848.f17038 = 0L;
        m33924(c4848);
        m33913(c4848);
        m33927(c4848);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m33928(C4848 c4848, String str) {
        for (C3106 c3106 : c4848.f17039.values()) {
            if (!m33931(c3106.f11703)) {
                c3106.f11703 = k.j;
            }
        }
        c4848.f17056 = true;
        c4848.f17054 = "failure";
        c4848.f17046 = m33905(str);
        c4848.f17073 = SystemClock.elapsedRealtime();
        c4848.f17045 = Collections.singletonList(c4848.f17044);
        List list = Collections.EMPTY_LIST;
        c4848.f17066 = Collections.EMPTY_LIST;
        c4848.f17049 = list;
        c4848.f17038 = 0L;
        m33924(c4848);
        m33913(c4848);
        m33927(c4848);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33919(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, boolean z, boolean z2, C4848 c4848) throws IOException {
        if (c4848.f17043) {
            throw new CancellationException();
        }
        try {
            C2462.m7542(abstractC20745, EnumC11636.MODIFY_FILE);
            if (!z2 && abstractC20745.mo33975()) {
                throw new IOException(C16737.m39264(R.string.MT_Protector, abstractC20745.mo33986()));
            }
            if (z && abstractC20745.mo33975() && abstractC20745.mo35233()) {
                abstractC20745.mo35234(new C5929(c4848));
                abstractC20746.m46699(abstractC20745, (Runnable) null);
            } else {
                abstractC20746.m46702(abstractC20745, false, true, null);
            }
        } catch (C4987 e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m33909(C4848 c4848, int i) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c4848.f17059 == 0) {
            c4848.f17059 = jElapsedRealtime;
        }
        c4848.f17042 += (long) i;
        long j = jElapsedRealtime - c4848.f17059;
        if (j < 200) {
            return c4848.f17038;
        }
        c4848.f17038 = Math.max((c4848.f17042 * 1000) / Math.max(j, 1L), 0L);
        c4848.f17059 = jElapsedRealtime;
        c4848.f17042 = 0L;
        return c4848.f17038;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m33920(String str) {
        return C16737.m39264(R.string.MT_Protector, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m33934(String str, List list) {
        C9030.removeIf(this.f46086.entrySet(), new C16513(SystemClock.elapsedRealtime()));
        String str2 = "fu-" + this.f46085.getAndIncrement();
        C4848 c4848 = new C4848(str2, str);
        this.f46086.put(str2, c4848);
        synchronized (c4848) {
            try {
                m33916(c4848, list);
                m33926(c4848);
                m33922(c4848);
            } catch (IOException e) {
                m33928(c4848, m33905(e.getMessage()));
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m33940(String str) {
        LinkedHashMap linkedHashMapM33932;
        C9030.removeIf(this.f46086.entrySet(), new C16513(SystemClock.elapsedRealtime()));
        C4848 c4848 = (C4848) this.f46086.get(str);
        if (c4848 == null) {
            return null;
        }
        synchronized (c4848) {
            m33914(c4848, SystemClock.elapsedRealtime());
            m33922(c4848);
            linkedHashMapM33932 = m33932(c4848);
        }
        return linkedHashMapM33932;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static String m33905(String str) {
        return str == null ? "" : str.toString();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m33931(String str) {
        return TextUtils.equals(str, "success") || TextUtils.equals(str, "skipped") || TextUtils.equals(str, k.j) || TextUtils.equals(str, "cancelled");
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m33932(C4848 c4848) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("taskId", c4848.f17072);
        linkedHashMap2.put("type", "upload");
        linkedHashMap2.put("done", Boolean.valueOf(c4848.f17056));
        linkedHashMap2.put(c.a, c4848.f17054);
        linkedHashMap2.put("title", c4848.f17034);
        linkedHashMap2.put("name", c4848.f17051);
        linkedHashMap2.put("progress", Integer.valueOf(c4848.f17064));
        linkedHashMap2.put("remaining", c4848.f17052);
        linkedHashMap2.put("speed", Long.valueOf(c4848.f17038));
        linkedHashMap2.put(d.O, c4848.f17046);
        linkedHashMap2.put("refreshDirectories", c4848.f17045);
        linkedHashMap2.put("invalidatePrefixes", c4848.f17066);
        linkedHashMap2.put("pathMoves", Collections.EMPTY_LIST);
        linkedHashMap2.put("markedPaths", c4848.f17049);
        if (c4848.f17033 == null) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("id", c4848.f17033.f6712);
            linkedHashMap.put(MotionUtils.EASING_TYPE_PATH, c4848.f17033.f6709);
            linkedHashMap.put("incoming", m33910(c4848.f17033.f6708));
            linkedHashMap.put("existing", m33910(c4848.f17033.f6714));
            linkedHashMap.put("selectedAction", c4848.f17033.f6707);
            linkedHashMap.put("recyclable", Boolean.valueOf(c4848.f17033.f6713));
            linkedHashMap.put("moveToRecycleBin", Boolean.valueOf(c4848.f17033.f6715));
        }
        linkedHashMap2.put("conflict", linkedHashMap);
        linkedHashMap2.put("resumeAction", c4848.f17060);
        linkedHashMap2.put("resumePath", c4848.f17035);
        linkedHashMap2.put("nextUploadPath", c4848.f17062);
        linkedHashMap2.put("armedPath", c4848.f17036);
        linkedHashMap2.put("armToken", c4848.f17058);
        linkedHashMap2.put("cancelRequested", Boolean.valueOf(c4848.f17043));
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m33912(C4848 c4848, C3106 c3106) {
        return C5553.m15313(C18629.m43078(c4848.f17044 + "/" + c3106.f11713), new String[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m33910(C20321 c20321) {
        if (c20321 == null || !c20321.m45860()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("size", Long.valueOf(c20321.m45858()));
        linkedHashMap.put("time", Long.valueOf(c20321.m45861()));
        return linkedHashMap;
    }
}
