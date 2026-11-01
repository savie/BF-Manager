package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: l.ܺ۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VZ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15955 {

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static Comparator f51663 = new C21598();

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final C22596 f51666;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7474 f51667;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3253 f51669;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C23530 f51670;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13132 f51674;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4395 f51675;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C12158 f51679;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C17884 f51680;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16660[] f51681;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C21329 f51687;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1136 f51689;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C0162 f51692;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12241 f51694;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20707 f51699;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f51696 = new HashMap();

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f51685 = 0;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public int f51688 = 0;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f51673 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f51682 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f51686 = 0;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f51704 = 0;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f51671 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f51664 = 0;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f51690 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f51677 = 0;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f51703 = 0;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f51698 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f51684 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f51702 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f51668 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f51672 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f51697 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f51701 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f51700 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f51693 = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f51678 = false;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f51676 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f51695 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f51691 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f51705 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f51683 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Comparator f51665 = new C18070((C8485) this);

    /* JADX INFO: renamed from: ۙ */
    public abstract C19068 mo22158();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo22161(C10310 c10310, Object obj);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m37931(C15249 c15249, int i, int i2) throws IOException {
        C15249.m36518(c15249, i);
        if (i > 0) {
            C15249.m36518(c15249, i2);
        } else {
            C15249.m36518(c15249, 0);
        }
    }

    public AbstractC15955(C7474 c7474) {
        this.f51667 = c7474;
        C19068 c19068Mo22158 = mo22158();
        this.f51669 = c19068Mo22158.m43837();
        C22596 c22596M43841 = c19068Mo22158.m43841();
        this.f51666 = c22596M43841;
        C23530 c23530M43834 = c19068Mo22158.m43834();
        this.f51670 = c23530M43834;
        C17884 c17884M43842 = c19068Mo22158.m43842();
        this.f51680 = c17884M43842;
        C12241 c12241M43839 = c19068Mo22158.m43839();
        this.f51694 = c12241M43839;
        this.f51692 = c19068Mo22158.m43833();
        C21329 c21329M43838 = c19068Mo22158.m43838();
        this.f51687 = c21329M43838;
        C20707 c20707M43832 = c19068Mo22158.m43832();
        this.f51699 = c20707M43832;
        this.f51675 = c19068Mo22158.m43843();
        this.f51689 = c19068Mo22158.m43835();
        this.f51674 = c19068Mo22158.m43840();
        this.f51679 = c19068Mo22158.m43836();
        this.f51681 = new InterfaceC16660[]{c22596M43841, c23530M43834, c17884M43842, c12241M43839, c21329M43838, c20707M43832};
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C15249 m37928(InterfaceC9191 interfaceC9191, int i) {
        return new C15249(interfaceC9191.mo23644(i), i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private int m37910() {
        return (this.f51699.getItemCount() * 8) + (this.f51687.m47839() * 4) + (this.f51692.getItemCount() * 32) + (this.f51694.getItemCount() * 8) + (this.f51680.getItemCount() * 8) + (this.f51670.getItemCount() * 12) + (this.f51666.getItemCount() * 4) + (this.f51669.getItemCount() * 4) + UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m37938() {
        for (InterfaceC16660 interfaceC16660 : this.f51681) {
            if (interfaceC16660.getItemCount() > 65536) {
                System.err.println("Number of section items overflowed: 65535: " + interfaceC16660.getClass().getSimpleName() + "[" + interfaceC16660.getItemCount() + "]");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37936(InterfaceC9191 interfaceC9191) throws IOException {
        InterfaceC19774 interfaceC19774M3142 = C0722.m3142();
        C0162 c0162 = this.f51692;
        if (this.f51694.getItemCount() <= 65536) {
            if (m37938()) {
                throw new IOException("Number of section items overflowed: 65535");
            }
            C21329 c21329 = this.f51687;
            Iterator it = ((AbstractC8713) c21329.mo1279()).iterator();
            int i = -1;
            while (it.hasNext()) {
                int index = ((InterfaceC18029) ((Map.Entry) it.next()).getKey()).getIndex();
                if (index >= 0 && index < 65536 && index > i) {
                    i = index;
                }
            }
            int itemCount = (i + 1) - c21329.getItemCount();
            if (itemCount > 0) {
                c21329.m47838(itemCount);
            }
            try {
                int iM37910 = m37910();
                C15249 c15249M37928 = m37928(interfaceC9191, 0);
                C15249 c15249M37929 = m37928(interfaceC9191, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                C15249 c15249M379210 = m37928(interfaceC9191, iM37910);
                try {
                    m37923(c15249M37929, c15249M379210);
                    m37933(c15249M37929);
                    m37932(c15249M379210);
                    m37935(c15249M37929);
                    m37909(c15249M37929);
                    m37925(c15249M37929);
                    C15249 c15249M379211 = m37928(interfaceC9191, (c21329.m47839() * 4) + (c0162.getItemCount() * 32) + c15249M37929.getPosition());
                    try {
                        m37912(c15249M379211);
                        c15249M379211.close();
                        m37934(c15249M379210);
                        C15249 c15249M379212 = m37928(interfaceC9191, (c0162.getItemCount() * 32) + c15249M37929.getPosition());
                        try {
                            m37924(c15249M379212);
                            c15249M379212.close();
                            m37911(c15249M379210);
                            m37926(c15249M379210);
                            m37930(c15249M379210);
                            m37917(c15249M379210);
                            m37921(c15249M379210, interfaceC19774M3142.mo44968());
                            m37916(interfaceC9191, c15249M37929, c15249M379210);
                            m37927(c15249M379210);
                            m37918(c15249M37928, iM37910, c15249M379210.getPosition());
                            c15249M37928.close();
                            c15249M37929.close();
                            c15249M379210.close();
                            m37929(interfaceC9191);
                            Adler32 adler32 = new Adler32();
                            byte[] bArr = new byte[4096];
                            InputStream inputStreamMo23643 = interfaceC9191.mo23643(12);
                            for (int i2 = inputStreamMo23643.read(bArr); i2 >= 0; i2 = inputStreamMo23643.read(bArr)) {
                                adler32.update(bArr, 0, i2);
                            }
                            OutputStream outputStreamMo23644 = interfaceC9191.mo23644(8);
                            C15249.m36518(outputStreamMo23644, (int) adler32.getValue());
                            outputStreamMo23644.close();
                            interfaceC9191.close();
                            return;
                        } catch (Throwable th) {
                            c15249M379212.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        c15249M379211.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c15249M37928.close();
                    c15249M37929.close();
                    c15249M379210.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                interfaceC9191.close();
                throw th4;
            }
        }
        throw new IOException(C16737.m39288(R.string.MT_Protector));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37937(AbstractC20745 abstractC20745) {
        if (!abstractC20745.mo33975()) {
            C10602 c10602 = new C10602(abstractC20745);
            try {
                m37936(c10602);
                c10602.close();
            } catch (Throwable th) {
                try {
                    c10602.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            AbstractC20745 abstractC20745M46733 = abstractC20745.m46733(".tmp");
            try {
                C10602 c10603 = new C10602(abstractC20745M46733);
                try {
                    m37936(c10603);
                    c10603.close();
                    abstractC20745M46733.m46699(abstractC20745, (Runnable) null);
                    abstractC20745M46733.mo24647();
                } catch (Throwable th3) {
                    try {
                        c10603.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                abstractC20745M46733.mo24647();
                throw th5;
            }
        }
        C5553.m15317(abstractC20745);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m37929(InterfaceC9191 interfaceC9191) throws IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            byte[] bArr = new byte[4096];
            InputStream inputStreamMo23643 = interfaceC9191.mo23643(32);
            for (int i = inputStreamMo23643.read(bArr); i >= 0; i = inputStreamMo23643.read(bArr)) {
                messageDigest.update(bArr, 0, i);
            }
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest.length != 20) {
                throw new RuntimeException(C12441.m30911(bArrDigest.length, " bytes", new StringBuilder("unexpected digest write: ")));
            }
            OutputStream outputStreamMo23644 = interfaceC9191.mo23644(12);
            outputStreamMo23644.write(bArrDigest);
            outputStreamMo23644.close();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37923(C15249 c15249, C15249 c152410) throws IOException {
        this.f51685 = c15249.getPosition();
        this.f51690 = c152410.getPosition();
        ArrayList<Map.Entry> arrayList = new ArrayList((AbstractCollection) this.f51669.mo1279());
        Collections.sort(arrayList, f51663);
        int i = 0;
        for (Map.Entry entry : arrayList) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            C15249.m36518(c15249, c152410.getPosition());
            String string = ((CharSequence) entry.getKey()).toString();
            C15249.m36519(c152410, string.length());
            c152410.m36526(string);
            c152410.write(0);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m37933(C15249 c15249) throws IOException {
        this.f51688 = c15249.getPosition();
        C22596 c22596 = this.f51666;
        ArrayList<Map.Entry> arrayList = new ArrayList((AbstractCollection) c22596.mo1279());
        Collections.sort(arrayList, f51663);
        int i = 0;
        for (Map.Entry entry : arrayList) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            C15249.m36518(c15249, this.f51669.mo24178(c22596.m50098((CharSequence) entry.getKey())));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m37935(C15249 c15249) throws IOException {
        this.f51673 = c15249.getPosition();
        C23530 c23530 = this.f51670;
        ArrayList<Map.Entry> arrayList = new ArrayList((AbstractCollection) c23530.mo1279());
        Collections.sort(arrayList, new C18776());
        int i = 0;
        for (Map.Entry entry : arrayList) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            InterfaceC19441 interfaceC19441 = (InterfaceC19441) entry.getKey();
            C15249.m36518(c15249, this.f51669.mo24178(c23530.m51845(interfaceC19441)));
            C15249.m36518(c15249, this.f51666.mo24178(c23530.m51846(interfaceC19441)));
            C15249.m36518(c15249, this.f51675.mo8596(c23530.m51844(interfaceC19441)));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m37909(C15249 c15249) throws IOException {
        this.f51682 = c15249.getPosition();
        C17884 c17884 = this.f51680;
        ArrayList<Map.Entry> arrayList = new ArrayList((AbstractCollection) c17884.mo1279());
        Collections.sort(arrayList, new C18776());
        int i = 0;
        for (Map.Entry entry : arrayList) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            InterfaceC18735 interfaceC18735 = (InterfaceC18735) entry.getKey();
            C1428 c1428M41509 = c17884.m41509(interfaceC18735);
            C22596 c22596 = this.f51666;
            c15249.m36528(c22596.mo24178(c1428M41509));
            c15249.m36528(c22596.mo24178(c17884.m41511(interfaceC18735)));
            C15249.m36518(c15249, this.f51669.mo24178(c17884.m41510(interfaceC18735)));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m37925(C15249 c15249) throws IOException {
        this.f51686 = c15249.getPosition();
        C12241 c12241 = this.f51694;
        ArrayList<Map.Entry> arrayList = new ArrayList((AbstractCollection) c12241.mo1279());
        Collections.sort(arrayList, new C18776());
        int i = 0;
        for (Map.Entry entry : arrayList) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            InterfaceC8858 interfaceC8858 = (InterfaceC8858) entry.getKey();
            c15249.m36528(this.f51666.mo24178(c12241.m30446(interfaceC8858)));
            c15249.m36528(this.f51670.mo24178(c12241.m30447(interfaceC8858)));
            C15249.m36518(c15249, this.f51669.mo24178(c12241.m30449(interfaceC8858)));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37916(InterfaceC9191 interfaceC9191, C15249 c15249, C15249 c152410) throws IOException {
        this.f51704 = c15249.getPosition();
        this.f51677 = c152410.getPosition();
        C0162 c0162 = this.f51692;
        ArrayList arrayList = new ArrayList((AbstractCollection) c0162.mo1279());
        Collections.sort(arrayList, new C18776());
        Iterator it = arrayList.iterator();
        int iM37914 = 0;
        while (it.hasNext()) {
            iM37914 = m37914(c15249, c152410, iM37914, (Map.Entry) it.next());
        }
        if (mo22163()) {
            c152410.m36521();
            this.f51700 = c152410.getPosition();
            ArrayList<Map.Entry> arrayList2 = new ArrayList((AbstractCollection) c0162.mo1279());
            Collections.sort(arrayList2, new C8193());
            C7487 c7487 = new C7487(interfaceC9191, c152410, arrayList2.size());
            try {
                for (Map.Entry entry : arrayList2) {
                    Iterator it2 = c0162.m1277((Comparable) entry.getKey()).iterator();
                    while (it2.hasNext()) {
                        c7487.m19983(c0162.m1297(it2.next()));
                    }
                    Iterator it3 = c0162.m1273((Comparable) entry.getKey()).iterator();
                    while (it3.hasNext()) {
                        c7487.m19983(c0162.m1297(it3.next()));
                    }
                    Iterator<E> it4 = c0162.m1284((Comparable) entry.getKey()).iterator();
                    while (it4.hasNext()) {
                        c7487.m19983(c0162.m1288(it4.next()));
                    }
                    Iterator<E> it5 = c0162.m1286((Comparable) entry.getKey()).iterator();
                    while (it5.hasNext()) {
                        c7487.m19983(c0162.m1288(it5.next()));
                    }
                    c7487.m19984();
                }
            } finally {
                c7487.m19982();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ */
    public boolean mo22163() {
        return this.f51678 && this.f51667.f24881 >= 29;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m37914(C15249 c15249, C15249 c152410, int i, Map.Entry entry) throws IOException {
        if (entry == null || ((Integer) entry.getValue()).intValue() != -1) {
            return i;
        }
        Comparable comparable = (Comparable) entry.getKey();
        entry.setValue(0);
        C0162 c0162 = this.f51692;
        int iM37914 = m37914(c15249, c152410, i, c0162.m1280((CharSequence) c0162.m1305(comparable)));
        C4956 c4956M1274 = c0162.m1274(comparable);
        InterfaceC4395 interfaceC4395 = this.f51675;
        Iterator it = interfaceC4395.mo8597(c4956M1274).iterator();
        while (it.hasNext()) {
            iM37914 = m37914(c15249, c152410, iM37914, c0162.m1280((CharSequence) it.next()));
        }
        int i2 = iM37914 + 1;
        entry.setValue(Integer.valueOf(iM37914));
        C1428 c1428M1300 = c0162.m1300(comparable);
        C22596 c22596 = this.f51666;
        C15249.m36518(c15249, c22596.mo24178(c1428M1300));
        C15249.m36518(c15249, c0162.m1278(comparable));
        C15249.m36518(c15249, c22596.mo24177(c0162.m1305(comparable)));
        C15249.m36518(c15249, interfaceC4395.mo8596(c0162.m1274(comparable)));
        C15249.m36518(c15249, this.f51669.mo24177(c0162.m1307(comparable)));
        C15249.m36518(c15249, c0162.m1295(comparable));
        SortedSet sortedSetM1277 = c0162.m1277(comparable);
        SortedSet sortedSetM1273 = c0162.m1273(comparable);
        AbstractC0934 abstractC0934M1284 = c0162.m1284(comparable);
        AbstractC0934 abstractC0934M1286 = c0162.m1286(comparable);
        boolean z = sortedSetM1277.size() > 0 || sortedSetM1273.size() > 0 || abstractC0934M1284.size() > 0 || abstractC0934M1286.size() > 0;
        if (z) {
            C15249.m36518(c15249, c152410.getPosition());
        } else {
            C15249.m36518(c15249, 0);
        }
        C5807 c5807M1298 = c0162.m1298(comparable);
        if (c5807M1298 != null) {
            C15249.m36518(c15249, this.f51679.mo3477(c5807M1298));
        } else {
            C15249.m36518(c15249, 0);
        }
        if (z) {
            this.f51683++;
            C15249.m36519(c152410, sortedSetM1277.size());
            C15249.m36519(c152410, sortedSetM1273.size());
            C15249.m36519(c152410, abstractC0934M1284.size());
            C15249.m36519(c152410, abstractC0934M1286.size());
            m37920(c152410, sortedSetM1277);
            m37920(c152410, sortedSetM1273);
            m37922(c152410, abstractC0934M1284);
            m37922(c152410, abstractC0934M1286);
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m37924(C15249 c15249) throws IOException {
        C12158 c12158;
        this.f51671 = c15249.getPosition();
        C7931 c7931 = new C7931();
        ArrayList arrayList = new ArrayList();
        C21329 c21329 = this.f51687;
        int i = -1;
        for (Map.Entry entry : (AbstractC8713) c21329.mo1279()) {
            int index = ((InterfaceC18029) entry.getKey()).getIndex();
            if (index < 0 || index >= 65536 || c7931.mo8945(index)) {
                arrayList.add(entry);
            } else {
                c7931.mo8944(index, entry);
                if (index > i) {
                    i = index;
                }
            }
        }
        Collections.sort(arrayList, this.f51665);
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            c12158 = this.f51679;
            if (i2 > i) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) c7931.get(i2);
            if (entry2 == null && it.hasNext()) {
                entry2 = (Map.Entry) it.next();
            }
            if (entry2 != null) {
                entry2.setValue(Integer.valueOf(i2));
                C15249.m36518(c15249, c12158.mo3477(c21329.m47837((InterfaceC18029) entry2.getKey())));
            } else {
                C15249.m36518(c15249, -1);
            }
            i2++;
        }
        while (it.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it.next();
            i++;
            entry3.setValue(Integer.valueOf(i));
            C15249.m36518(c15249, c12158.mo3477(c21329.m47837((InterfaceC18029) entry3.getKey())));
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m37912(C15249 c15249) throws IOException {
        int iMo24178;
        this.f51664 = c15249.getPosition();
        C20707 c20707 = this.f51699;
        int i = 0;
        for (Map.Entry entry : (AbstractC8713) c20707.mo1279()) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            InterfaceC8152 interfaceC8152 = (InterfaceC8152) entry.getKey();
            c15249.m36528(interfaceC8152.mo20681());
            c15249.m36528(0);
            switch (interfaceC8152.mo20681()) {
                case 0:
                case 1:
                case 2:
                case 3:
                    iMo24178 = this.f51680.mo24178(c20707.m46556(interfaceC8152));
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    iMo24178 = this.f51694.mo24178(c20707.m46558(interfaceC8152));
                    break;
                default:
                    throw new C20749(null, "Invalid method handle type: %d", Integer.valueOf(interfaceC8152.mo20681()));
            }
            c15249.m36528(iMo24178);
            c15249.m36528(0);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37920(C15249 c15249, SortedSet sortedSet) throws IOException {
        int i = 0;
        for (Object obj : sortedSet) {
            int iM41507 = this.f51680.m41507(obj);
            C0162 c0162 = this.f51692;
            if (!c0162.m1297(obj).isEmpty()) {
                this.f51678 = true;
            }
            C15249.m36519(c15249, iM41507 - i);
            C15249.m36519(c15249, c0162.m1285(obj));
            i = iM41507;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37922(C15249 c15249, AbstractC0934 abstractC0934) throws IOException {
        int i = 0;
        for (Object obj : abstractC0934) {
            int iM30443 = this.f51694.m30443(obj);
            C0162 c0162 = this.f51692;
            if (!c0162.m1288(obj).isEmpty()) {
                this.f51678 = true;
            }
            C15249.m36519(c15249, iM30443 - i);
            C15249.m36519(c15249, c0162.m1299(obj));
            C15249.m36519(c15249, c0162.m1293(obj));
            i = iM30443;
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m37932(C15249 c15249) throws IOException {
        c15249.m36521();
        this.f51703 = c15249.getPosition();
        InterfaceC4395 interfaceC4395 = this.f51675;
        for (Map.Entry entry : (AbstractC8713) interfaceC4395.mo3473()) {
            c15249.m36521();
            entry.setValue(Integer.valueOf(c15249.getPosition()));
            List listMo8597 = interfaceC4395.mo8597(entry.getKey());
            C15249.m36518(c15249, listMo8597.size());
            Iterator it = listMo8597.iterator();
            while (it.hasNext()) {
                c15249.m36528(this.f51666.mo24178((CharSequence) it.next()));
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m37934(C15249 c15249) throws IOException {
        C10310 c10310 = new C10310(this, c15249);
        this.f51698 = c15249.getPosition();
        C12158 c12158 = this.f51679;
        for (Map.Entry entry : (AbstractC8713) c12158.mo3473()) {
            entry.setValue(Integer.valueOf(c15249.getPosition()));
            List listM30244 = c12158.m30244(entry.getKey());
            C15249.m36519(c15249, listM30244.size());
            Iterator it = listM30244.iterator();
            while (it.hasNext()) {
                mo22161(c10310, it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m37911(C15249 c15249) throws IOException {
        C10310 c10310 = new C10310(this, c15249);
        this.f51684 = c15249.getPosition();
        InterfaceC1136 interfaceC1136 = this.f51689;
        for (Map.Entry entry : (AbstractC8713) interfaceC1136.mo3473()) {
            entry.setValue(Integer.valueOf(c15249.getPosition()));
            InterfaceC3710 interfaceC3710 = (InterfaceC3710) entry.getKey();
            c15249.m36524(interfaceC1136.mo3478(interfaceC3710));
            C15249.m36519(c15249, this.f51666.mo24178(interfaceC1136.mo3474(interfaceC3710)));
            AbstractC22433 abstractC22433M49798 = AbstractC22433.m49798(AbstractC10959.m27715(AbstractC22436.f73218), interfaceC1136.mo3476(interfaceC3710));
            C15249.m36519(c15249, abstractC22433M49798.size());
            AbstractC16706 abstractC16706ListIterator = abstractC22433M49798.listIterator(0);
            while (abstractC16706ListIterator.hasNext()) {
                InterfaceC6533 interfaceC6533 = (InterfaceC6533) abstractC16706ListIterator.next();
                C15249.m36519(c15249, this.f51669.mo24178(interfaceC1136.mo3479(interfaceC6533)));
                mo22161(c10310, interfaceC1136.mo3475(interfaceC6533));
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m37926(C15249 c15249) throws IOException {
        c15249.m36521();
        this.f51702 = c15249.getPosition();
        if (this.f51667.f24881 < 17) {
            C15249.m36518(c15249, 0);
        }
        InterfaceC13132 interfaceC13132 = this.f51674;
        for (Map.Entry entry : (AbstractC8713) interfaceC13132.mo3473()) {
            AbstractC22433 abstractC22433M49798 = AbstractC22433.m49798(AbstractC10959.m27715(AbstractC2679.f10349), interfaceC13132.mo32490(entry.getKey()));
            c15249.m36521();
            entry.setValue(Integer.valueOf(c15249.getPosition()));
            C15249.m36518(c15249, abstractC22433M49798.size());
            AbstractC16706 abstractC16706ListIterator = abstractC22433M49798.listIterator(0);
            while (abstractC16706ListIterator.hasNext()) {
                C15249.m36518(c15249, this.f51689.mo3477(abstractC16706ListIterator.next()));
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m37930(C15249 c15249) throws IOException {
        int iMo3477;
        c15249.m36521();
        this.f51668 = c15249.getPosition();
        HashMap map = new HashMap();
        C0162 c0162 = this.f51692;
        AbstractC16706 abstractC16706ListIterator = c0162.m1275().listIterator(0);
        while (abstractC16706ListIterator.hasNext()) {
            for (Object obj : c0162.m1294((Comparable) abstractC16706ListIterator.next())) {
                List listM1302 = c0162.m1302(obj);
                if (listM1302 != null) {
                    Integer num = (Integer) map.get(listM1302);
                    if (num != null) {
                        c0162.m1282(num.intValue(), obj);
                    } else {
                        c15249.m36521();
                        int position = c15249.getPosition();
                        c0162.m1282(position, obj);
                        map.put(listM1302, Integer.valueOf(position));
                        this.f51676++;
                        C15249.m36518(c15249, listM1302.size());
                        for (Object obj2 : listM1302) {
                            InterfaceC13132 interfaceC13132 = this.f51674;
                            if (interfaceC13132.mo32490(obj2).size() > 0) {
                                iMo3477 = interfaceC13132.mo3477(obj2);
                            } else if (this.f51667.f24881 >= 17) {
                                C15249.m36518(c15249, 0);
                            } else {
                                iMo3477 = this.f51702;
                            }
                            C15249.m36518(c15249, iMo3477);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37917(C15249 c15249) throws IOException {
        InterfaceC13132 interfaceC13132;
        C12241 c12241;
        c15249.m36521();
        this.f51672 = c15249.getPosition();
        HashMap map = new HashMap();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(65536);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        C0162 c0162 = this.f51692;
        AbstractC16706 abstractC16706ListIterator = c0162.m1275().listIterator(0);
        while (abstractC16706ListIterator.hasNext()) {
            Comparable comparable = (Comparable) abstractC16706ListIterator.next();
            Collection collectionM1306 = c0162.m1306(comparable);
            Collection collectionM1294 = c0162.m1294(comparable);
            int size = (collectionM1294.size() * 16) + (collectionM1306.size() * 8);
            if (size > byteBufferAllocate.capacity()) {
                byteBufferAllocate = ByteBuffer.allocate(size);
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            }
            byteBufferAllocate.clear();
            Iterator it = collectionM1306.iterator();
            int i = 0;
            while (true) {
                boolean zHasNext = it.hasNext();
                interfaceC13132 = this.f51674;
                if (!zHasNext) {
                    break;
                }
                Object next = it.next();
                C12863 c12863M1308 = c0162.m1308(next);
                if (c12863M1308 != null) {
                    i++;
                    byteBufferAllocate.putInt(this.f51680.m41507(next));
                    byteBufferAllocate.putInt(interfaceC13132.mo3477(c12863M1308));
                }
            }
            Iterator it2 = collectionM1294.iterator();
            int i2 = 0;
            while (true) {
                boolean zHasNext2 = it2.hasNext();
                c12241 = this.f51694;
                if (!zHasNext2) {
                    break;
                }
                Object next2 = it2.next();
                C12863 c12863M1301 = c0162.m1301(next2);
                if (c12863M1301 != null) {
                    i2++;
                    byteBufferAllocate.putInt(c12241.m30443(next2));
                    byteBufferAllocate.putInt(interfaceC13132.mo3477(c12863M1301));
                }
            }
            int i3 = 0;
            for (Object obj : collectionM1294) {
                int iM1272 = c0162.m1272(obj);
                if (iM1272 != 0) {
                    i3++;
                    byteBufferAllocate.putInt(c12241.m30443(obj));
                    byteBufferAllocate.putInt(iM1272);
                }
            }
            C12863 c12863M1291 = c0162.m1291(comparable);
            if (i == 0 && i2 == 0 && i3 == 0) {
                if (c12863M1291 != null) {
                    Integer num = (Integer) map.get(c12863M1291);
                    if (num != null) {
                        c0162.m1281(num.intValue(), comparable);
                    } else {
                        map.put(c12863M1291, Integer.valueOf(c15249.getPosition()));
                    }
                }
            }
            this.f51695++;
            c0162.m1281(c15249.getPosition(), comparable);
            C15249.m36518(c15249, interfaceC13132.mo8596(c12863M1291));
            C15249.m36518(c15249, i);
            C15249.m36518(c15249, i2);
            C15249.m36518(c15249, i3);
            c15249.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:107:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:124:0x0250 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x026a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0203 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:84:0x024d  */
    /* JADX WARN: Code duplicated, block: B:89:0x025a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0267  */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x01bf, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37921(C15249 c15249, C0722 c0722) throws IOException {
        AbstractC16706 abstractC16706;
        List listMo11511;
        Iterable iterableMo11508;
        int position;
        int lineNumber;
        ArrayList arrayList;
        Iterable iterable;
        List list;
        byte[] byteArray;
        C6781 c6781;
        HashMap map;
        int iIntValue;
        InterfaceC20852 interfaceC20852Mo9023;
        C3067 c3067;
        InterfaceC15914 interfaceC15914Mo9026;
        C1428 c1428;
        InterfaceC20852 interfaceC20852Mo9025;
        C3067 c3068;
        ArrayList arrayList2;
        AbstractC16706 abstractC16707;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f51697 = c15249.getPosition();
        C15249 c152410 = new C15249(c0722, 0);
        ArrayList<C8899> arrayList3 = new ArrayList();
        C0162 c0162 = this.f51692;
        AbstractC16706 abstractC16706ListIterator = c0162.m1275().listIterator(0);
        while (abstractC16706ListIterator.hasNext()) {
            Comparable comparable = (Comparable) abstractC16706ListIterator.next();
            Iterator it = C22808.m50465(c0162.m1284(comparable), c0162.m1286(comparable)).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                List listM1287 = c0162.m1287(next);
                Iterable iterableM1304 = c0162.m1304(next);
                Iterable<InterfaceC7239> iterableM1276 = c0162.m1276(next);
                InterfaceC3253 interfaceC3253 = this.f51669;
                if (iterableM1304 == null || !interfaceC3253.mo9733()) {
                    abstractC16706 = abstractC16706ListIterator;
                    listMo11511 = listM1287;
                    iterableMo11508 = iterableM1304;
                } else {
                    Iterator it2 = iterableM1304.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            InterfaceC1594 interfaceC1594 = (InterfaceC1594) it2.next();
                            List list2 = listM1287;
                            Iterable iterable2 = iterableM1304;
                            if (interfaceC1594.mo5435() != EnumC10297.f35313 || interfaceC3253.mo9732((InterfaceC20852) ((InterfaceC13859) interfaceC1594).getReference()) < 65536) {
                                listM1287 = list2;
                                iterableM1304 = iterable2;
                                abstractC16706ListIterator = abstractC16706ListIterator;
                            } else {
                                C10111 c10111M1303 = c0162.m1303(next);
                                List listMo11508 = c10111M1303.mo11508();
                                int i = 0;
                                while (i < listMo11508.size()) {
                                    InterfaceC1594 interfaceC1595 = (InterfaceC1594) listMo11508.get(i);
                                    List list3 = listMo11508;
                                    if (interfaceC1595.mo5435() == EnumC10297.f35313) {
                                        InterfaceC13859 interfaceC13859 = (InterfaceC13859) interfaceC1595;
                                        abstractC16707 = abstractC16706ListIterator;
                                        if (interfaceC3253.mo9732((InterfaceC20852) interfaceC13859.getReference()) >= 65536) {
                                            c10111M1303.m25738(i, new C18722(EnumC10297.f35225, ((InterfaceC4685) interfaceC1595).mo1140(), interfaceC13859.getReference()));
                                        }
                                    } else {
                                        abstractC16707 = abstractC16706ListIterator;
                                    }
                                    i++;
                                    listMo11508 = list3;
                                    abstractC16706ListIterator = abstractC16707;
                                }
                                abstractC16706 = abstractC16706ListIterator;
                                iterableMo11508 = c10111M1303.mo11508();
                                listMo11511 = c10111M1303.mo11511();
                                iterableM1276 = c10111M1303.mo11510();
                            }
                        } else {
                            abstractC16706 = abstractC16706ListIterator;
                            listMo11511 = listM1287;
                            iterableMo11508 = iterableM1304;
                        }
                    }
                }
                Iterable iterableM1289 = c0162.m1289(next);
                int iM50463 = C22808.m50463(iterableM1289);
                Iterator it3 = iterableM1289.iterator();
                int i2 = 0;
                Iterator it4 = it;
                int i3 = -1;
                while (it3.hasNext()) {
                    if (((CharSequence) it3.next()) != null) {
                        i3 = i2;
                    }
                    i2++;
                }
                if (i3 == -1 && (iterableM1276 == null || C22808.m50473(iterableM1276))) {
                    list = listMo11511;
                    iterable = iterableMo11508;
                    arrayList = arrayList3;
                    position = 0;
                } else {
                    position = c15249.getPosition();
                    if (iterableM1276 != null) {
                        Iterator it5 = iterableM1276.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                Iterator it6 = it5;
                                InterfaceC7239 interfaceC7239 = (InterfaceC7239) it5.next();
                                if (interfaceC7239 instanceof InterfaceC15707) {
                                    lineNumber = ((InterfaceC15707) interfaceC7239).getLineNumber();
                                } else {
                                    it5 = it6;
                                }
                            } else {
                                lineNumber = 0;
                            }
                        }
                    } else {
                        lineNumber = 0;
                    }
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    arrayList = arrayList3;
                    iterable = iterableMo11508;
                    list = listMo11511;
                    C15249 c152411 = new C15249(byteArrayOutputStream2, 0, 64);
                    C23010 c23010 = new C23010(interfaceC3253, this.f51666, c152411);
                    C15249.m36519(c152411, lineNumber);
                    C15249.m36519(c152411, iM50463);
                    Iterator it7 = iterableM1289.iterator();
                    int i4 = 0;
                    while (it7.hasNext()) {
                        Iterator it8 = it7;
                        CharSequence charSequence = (CharSequence) it7.next();
                        if (i4 != iM50463) {
                            i4++;
                            C15249.m36519(c152411, interfaceC3253.mo24177(charSequence) + 1);
                            it7 = it8;
                        } else {
                            if (iterableM1276 != null) {
                                c23010.m50895(lineNumber);
                                for (InterfaceC7239 interfaceC72310 : iterableM1276) {
                                    c0162.getClass();
                                    switch (interfaceC72310.mo1599()) {
                                        case 3:
                                            InterfaceC12179 interfaceC12179 = (InterfaceC12179) interfaceC72310;
                                            int iMo17670 = interfaceC12179.mo17670();
                                            int iMo9024 = interfaceC12179.mo9024();
                                            interfaceC20852Mo9023 = interfaceC12179.mo9023();
                                            if (interfaceC20852Mo9023 == null) {
                                                c3067 = null;
                                            } else {
                                                try {
                                                    c3067 = (C3067) interfaceC20852Mo9023;
                                                } catch (ClassCastException unused) {
                                                    throw new IllegalStateException("Only StringReference instances returned by DexBuilder.internStringReference or DexBuilder.internNullableStringReference may be used.");
                                                }
                                            }
                                            interfaceC15914Mo9026 = interfaceC12179.mo9026();
                                            if (interfaceC15914Mo9026 == null) {
                                                c1428 = null;
                                            } else {
                                                try {
                                                    c1428 = (C1428) interfaceC15914Mo9026;
                                                } catch (ClassCastException unused2) {
                                                    throw new IllegalStateException("Only TypeReference instances returned by DexBuilder.internTypeReference or DexBuilder.internNullableTypeReference may be used.");
                                                }
                                            }
                                            interfaceC20852Mo9025 = interfaceC12179.mo9025();
                                            if (interfaceC20852Mo9025 == null) {
                                                c3068 = null;
                                            } else {
                                                try {
                                                    c3068 = (C3067) interfaceC20852Mo9025;
                                                } catch (ClassCastException unused3) {
                                                    throw new IllegalStateException("Only StringReference instances returned by DexBuilder.internStringReference or DexBuilder.internNullableStringReference may be used.");
                                                }
                                            }
                                            c23010.m50897(iMo17670, iMo9024, c3067, c1428, c3068);
                                            break;
                                        case 4:
                                        default:
                                            throw new C20749(null, "Unexpected debug item type: %d", Integer.valueOf(interfaceC72310.mo1599()));
                                        case 5:
                                            InterfaceC20645 interfaceC20645 = (InterfaceC20645) interfaceC72310;
                                            c23010.m50896(interfaceC20645.mo17670(), interfaceC20645.mo5491());
                                            break;
                                        case 6:
                                            InterfaceC0183 interfaceC0183 = (InterfaceC0183) interfaceC72310;
                                            c23010.m50900(interfaceC0183.mo17670(), interfaceC0183.mo1385());
                                            break;
                                        case 7:
                                            c23010.m50899(interfaceC72310.mo17670());
                                            break;
                                        case 8:
                                            c23010.m50901(interfaceC72310.mo17670());
                                            break;
                                        case 9:
                                            InterfaceC16412 interfaceC16412 = (InterfaceC16412) interfaceC72310;
                                            int iMo17671 = interfaceC16412.mo17670();
                                            InterfaceC20852 interfaceC20852Mo20790 = interfaceC16412.mo20790();
                                            if (interfaceC20852Mo20790 != null) {
                                                try {
                                                } catch (ClassCastException unused4) {
                                                    throw new IllegalStateException("Only StringReference instances returned by DexBuilder.internStringReference or DexBuilder.internNullableStringReference may be used.");
                                                }
                                            }
                                            c23010.m50898(iMo17671, interfaceC20852Mo20790 != null ? (C3067) interfaceC20852Mo20790 : null);
                                            break;
                                        case 10:
                                            InterfaceC15707 interfaceC15707 = (InterfaceC15707) interfaceC72310;
                                            c23010.m50902(interfaceC15707.mo17670(), interfaceC15707.getLineNumber());
                                            break;
                                    }
                                }
                            }
                            c152411.write(0);
                            c152411.flush();
                            byteArray = byteArrayOutputStream2.toByteArray();
                            c6781 = new C6781(byteArray);
                            map = this.f51696;
                            iIntValue = ((Integer) C9735.getOrDefault(map, c6781, -1)).intValue();
                            if (iIntValue >= 0) {
                                position = iIntValue;
                            } else {
                                c15249.write(byteArray);
                                map.put(c6781, Integer.valueOf(position));
                                this.f51691++;
                            }
                        }
                    }
                    if (iterableM1276 != null) {
                        c23010.m50895(lineNumber);
                        while (r1.hasNext()) {
                            c0162.getClass();
                            switch (interfaceC72310.mo1599()) {
                                case 3:
                                    InterfaceC12179 interfaceC121710 = (InterfaceC12179) interfaceC72310;
                                    int iMo17672 = interfaceC121710.mo17670();
                                    int iMo9025 = interfaceC121710.mo9024();
                                    interfaceC20852Mo9023 = interfaceC121710.mo9023();
                                    if (interfaceC20852Mo9023 == null) {
                                        c3067 = null;
                                    } else {
                                        c3067 = (C3067) interfaceC20852Mo9023;
                                    }
                                    interfaceC15914Mo9026 = interfaceC121710.mo9026();
                                    if (interfaceC15914Mo9026 == null) {
                                        c1428 = null;
                                    } else {
                                        c1428 = (C1428) interfaceC15914Mo9026;
                                    }
                                    interfaceC20852Mo9025 = interfaceC121710.mo9025();
                                    if (interfaceC20852Mo9025 == null) {
                                        c3068 = null;
                                    } else {
                                        c3068 = (C3067) interfaceC20852Mo9025;
                                    }
                                    c23010.m50897(iMo17672, iMo9025, c3067, c1428, c3068);
                                    break;
                                case 4:
                                default:
                                    throw new C20749(null, "Unexpected debug item type: %d", Integer.valueOf(interfaceC72310.mo1599()));
                                case 5:
                                    InterfaceC20645 interfaceC20646 = (InterfaceC20645) interfaceC72310;
                                    c23010.m50896(interfaceC20646.mo17670(), interfaceC20646.mo5491());
                                    break;
                                case 6:
                                    InterfaceC0183 interfaceC0184 = (InterfaceC0183) interfaceC72310;
                                    c23010.m50900(interfaceC0184.mo17670(), interfaceC0184.mo1385());
                                    break;
                                case 7:
                                    c23010.m50899(interfaceC72310.mo17670());
                                    break;
                                case 8:
                                    c23010.m50901(interfaceC72310.mo17670());
                                    break;
                                case 9:
                                    InterfaceC16412 interfaceC16413 = (InterfaceC16412) interfaceC72310;
                                    int iMo17673 = interfaceC16413.mo17670();
                                    InterfaceC20852 interfaceC20852Mo20791 = interfaceC16413.mo20790();
                                    c23010.m50898(iMo17673, interfaceC20852Mo20791 != null ? (C3067) interfaceC20852Mo20791 : null);
                                    break;
                                case 10:
                                    InterfaceC15707 interfaceC15708 = (InterfaceC15707) interfaceC72310;
                                    c23010.m50902(interfaceC15708.mo17670(), interfaceC15708.getLineNumber());
                                    break;
                            }
                        }
                    }
                    c152411.write(0);
                    c152411.flush();
                    byteArray = byteArrayOutputStream2.toByteArray();
                    c6781 = new C6781(byteArray);
                    map = this.f51696;
                    iIntValue = ((Integer) C9735.getOrDefault(map, c6781, -1)).intValue();
                    if (iIntValue >= 0) {
                        position = iIntValue;
                    } else {
                        c15249.write(byteArray);
                        map.put(c6781, Integer.valueOf(position));
                        this.f51691++;
                    }
                }
                try {
                    int iM37913 = m37913(c152410, byteArrayOutputStream, next, list, iterable, position);
                    if (iM37913 != -1) {
                        C8899 c8899 = new C8899();
                        c8899.f30537 = iM37913;
                        c8899.f30538 = next;
                        arrayList2 = arrayList;
                        arrayList2.add(c8899);
                    } else {
                        arrayList2 = arrayList;
                    }
                    arrayList3 = arrayList2;
                    abstractC16706ListIterator = abstractC16706;
                    it = it4;
                } catch (RuntimeException e) {
                    throw new C20749(e, "Exception occurred while writing code_item for method %s", this.f51694.m30448(next));
                }
            }
        }
        c15249.m36521();
        this.f51701 = c15249.getPosition();
        c152410.close();
        c0722.m3143(c15249);
        c0722.close();
        for (C8899 c88910 : arrayList3) {
            c0162.m1296(this.f51701 + c88910.f30537, c88910.f30538);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m37913(C15249 c15249, ByteArrayOutputStream byteArrayOutputStream, Object obj, List list, Iterable iterable, int i) throws IOException {
        C1428 c1428;
        Iterator it;
        int iMo2107;
        if (iterable == null && i == 0) {
            return -1;
        }
        this.f51705++;
        c15249.m36521();
        int position = c15249.getPosition();
        C0162 c0162 = this.f51692;
        int iM1290 = c0162.m1290(obj);
        c15249.m36528(iM1290);
        boolean zM36501 = EnumC15236.STATIC.m36501(c0162.m1299(obj));
        C12241 c12241 = this.f51694;
        C17179 c17179M30445 = c12241.m30445(obj);
        C23530 c23530 = this.f51670;
        int iM14887 = C5370.m14887(this.f51675.mo8597(c23530.m51844(c17179M30445)), zM36501);
        int i2 = 3;
        if (iM14887 > iM1290) {
            throw new RuntimeException(String.format("ins_size (%dd) > registers_size (%dd): %s", Integer.valueOf(iM14887), Integer.valueOf(iM1290), obj.toString()));
        }
        c15249.m36528(iM14887);
        if (iterable == null) {
            c15249.m36528(0);
            c15249.m36528(0);
            C15249.m36518(c15249, i);
            C15249.m36518(c15249, 0);
            return position;
        }
        ArrayList<InterfaceC8651> arrayListM8081 = C2609.m8081(list);
        Iterator it2 = iterable.iterator();
        int i3 = 0;
        int iMo5436 = 0;
        while (it2.hasNext()) {
            InterfaceC1594 interfaceC1594 = (InterfaceC1594) it2.next();
            iMo5436 = interfaceC1594.mo5436() + iMo5436;
            int i4 = interfaceC1594.mo5435().f35329;
            if (i4 != i2) {
                iMo2107 = i4 != 5 ? 0 : ((InterfaceC13153) interfaceC1594).mo2107();
                it = it2;
            } else {
                InterfaceC8858 interfaceC8858 = (InterfaceC8858) ((InterfaceC13859) interfaceC1594).getReference();
                EnumC10297 enumC10297Mo5435 = interfaceC1594.mo5435();
                it = it2;
                iMo2107 = (enumC10297Mo5435 == EnumC10297.f35268 || enumC10297Mo5435 == EnumC10297.f35145) ? ((InterfaceC13153) interfaceC1594).mo2107() : C5370.m14887(interfaceC8858.mo9699(), enumC10297Mo5435 == EnumC10297.f35162 || enumC10297Mo5435 == EnumC10297.f35129);
            }
            if (iMo2107 > i3) {
                i3 = iMo2107;
            }
            i2 = 3;
            it2 = it;
        }
        if (i3 > 5 && i3 > iM1290) {
            throw new RuntimeException(String.format("outs_size (%dd) > registers_size (%dd): %s", Integer.valueOf(i3), Integer.valueOf(iM1290), obj.toString()));
        }
        c15249.m36528(i3);
        c15249.m36528(arrayListM8081.size());
        C15249.m36518(c15249, i);
        C7474 c7474 = this.f51667;
        InterfaceC3253 interfaceC3253 = this.f51669;
        C22596 c22596 = this.f51666;
        C17365 c17365 = new C17365(c7474, c15249, interfaceC3253, c22596, this.f51680, c12241, c23530, this.f51699, this.f51687);
        C15249.m36518(c15249, iMo5436);
        Iterator it3 = iterable.iterator();
        int iMo5437 = 0;
        while (it3.hasNext()) {
            InterfaceC1594 interfaceC1595 = (InterfaceC1594) it3.next();
            try {
                switch (C19482.f62703[interfaceC1595.mo5435().f35328.ordinal()]) {
                    case 1:
                        c17365.m40425((InterfaceC15270) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 2:
                        c17365.m40434((InterfaceC21619) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 3:
                        c17365.m40429((InterfaceC18091) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 4:
                        c17365.m40430((InterfaceC18797) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 5:
                        c17365.m40414((InterfaceC8214) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 6:
                        c17365.m40431((InterfaceC19503) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 7:
                        c17365.m40415((InterfaceC8920) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 8:
                        c17365.m40417((InterfaceC10331) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 9:
                        c17365.m40413((InterfaceC7508) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 10:
                        c17365.m40433((InterfaceC20914) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 11:
                        c17365.m40426((InterfaceC15976) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 12:
                        c17365.m40432((InterfaceC20209) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 13:
                        c17365.m40403((InterfaceC0452) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 14:
                        c17365.m40427((InterfaceC16681) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 15:
                        c17365.m40420((InterfaceC12448) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 16:
                        c17365.m40428((InterfaceC17386) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 17:
                        c17365.m40411((InterfaceC6097) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 18:
                        c17365.m40418((InterfaceC11037) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 19:
                        c17365.m40438((InterfaceC23737) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 20:
                        c17365.m40423((InterfaceC14565) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 21:
                        c17365.m40405((InterfaceC1863) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 22:
                        c17365.m40416((InterfaceC9626) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 23:
                        c17365.m40407((InterfaceC3274) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 24:
                        c17365.m40409((InterfaceC4623) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 25:
                        c17365.m40422((InterfaceC13797) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 26:
                        c17365.m40419((InterfaceC11680) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 27:
                        c17365.m40406((InterfaceC2506) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 28:
                        c17365.m40410((InterfaceC5329) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 29:
                        c17365.m40435((InterfaceC22263) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 30:
                        c17365.m40404((InterfaceC1095) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 31:
                        c17365.m40421((InterfaceC13091) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 32:
                        c17365.m40408((InterfaceC3917) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 33:
                        c17365.m40412((InterfaceC6740) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 34:
                        c17365.m40437((InterfaceC23031) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 35:
                        c17365.m40436((InterfaceC22969) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    case 36:
                        c17365.m40424((InterfaceC15208) interfaceC1595);
                        continue;
                        iMo5437 += interfaceC1595.mo5436();
                        break;
                    default:
                        throw new C20749(null, "Unsupported instruction format: %s", interfaceC1595.mo5435().f35328);
                }
            } catch (RuntimeException e) {
                throw new C20749(e, "Error while writing instruction at code offset 0x%x", Integer.valueOf(iMo5437));
            }
            throw new C20749(e, "Error while writing instruction at code offset 0x%x", Integer.valueOf(iMo5437));
        }
        if (arrayListM8081.size() > 0) {
            c15249.m36521();
            HashMap map = new HashMap();
            Iterator it4 = arrayListM8081.iterator();
            while (it4.hasNext()) {
                map.put(((InterfaceC8651) it4.next()).mo18943(), 0);
            }
            C15249.m36519(byteArrayOutputStream, map.size());
            for (InterfaceC8651 interfaceC8651 : arrayListM8081) {
                int iMo18941 = interfaceC8651.mo18941();
                int iMo18942 = (interfaceC8651.mo18942() + iMo18941) - iMo18941;
                C15249.m36518(c15249, iMo18941);
                c15249.m36528(iMo18942);
                if (interfaceC8651.mo18943().size() == 0) {
                    throw new C20749(null, "No exception handlers for the try block!", new Object[0]);
                }
                Integer num = (Integer) map.get(interfaceC8651.mo18943());
                if (num.intValue() != 0) {
                    c15249.m36528(num.intValue());
                } else {
                    int size = byteArrayOutputStream.size();
                    Integer numValueOf = Integer.valueOf(size);
                    c15249.m36528(size);
                    map.put(interfaceC8651.mo18943(), numValueOf);
                    int size2 = interfaceC8651.mo18943().size();
                    if (((InterfaceC21350) interfaceC8651.mo18943().get(size2 - 1)).mo6347() == null) {
                        size2 = (size2 * (-1)) + 1;
                    }
                    C15249.m36520(byteArrayOutputStream, size2);
                    for (InterfaceC21350 interfaceC21350 : interfaceC8651.mo18943()) {
                        c0162.getClass();
                        InterfaceC15914 interfaceC15914Mo32743 = interfaceC21350.mo32743();
                        if (interfaceC15914Mo32743 == null) {
                            c1428 = null;
                        } else {
                            try {
                                c1428 = (C1428) interfaceC15914Mo32743;
                            } catch (ClassCastException unused) {
                                throw new IllegalStateException("Only TypeReference instances returned by DexBuilder.internTypeReference or DexBuilder.internNullableTypeReference may be used.");
                            }
                        }
                        int iMo6346 = interfaceC21350.mo6346();
                        if (c1428 != null) {
                            C15249.m36519(byteArrayOutputStream, c22596.mo24178(c1428));
                            C15249.m36519(byteArrayOutputStream, iMo6346);
                        } else {
                            C15249.m36519(byteArrayOutputStream, iMo6346);
                        }
                    }
                }
            }
            if (byteArrayOutputStream.size() > 0) {
                byteArrayOutputStream.writeTo(c15249);
                byteArrayOutputStream.reset();
            }
        }
        return position;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:67:0x0215  */
    /* JADX WARN: Code duplicated, block: B:68:0x021f  */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m37927(C15249 c15249) throws IOException {
        C7474 c7474;
        C0162 c0162;
        int i;
        int i2;
        c15249.m36521();
        this.f51693 = c15249.getPosition();
        InterfaceC3253 interfaceC3253 = this.f51669;
        int i3 = ((AbstractC8713) interfaceC3253.mo1279()).size() > 0 ? 3 : 1;
        C22596 c22596 = this.f51666;
        if (((AbstractC8713) c22596.mo1279()).size() > 0) {
            i3++;
        }
        C23530 c23530 = this.f51670;
        if (((AbstractC8713) c23530.mo1279()).size() > 0) {
            i3++;
        }
        C17884 c17884 = this.f51680;
        if (((AbstractC8713) c17884.mo1279()).size() > 0) {
            i3++;
        }
        C12241 c12241 = this.f51694;
        if (((AbstractC8713) c12241.mo1279()).size() > 0) {
            i3++;
        }
        C21329 c21329 = this.f51687;
        if (c21329.m47839() > 0) {
            i3++;
        }
        C20707 c20707 = this.f51699;
        if (((AbstractC8713) c20707.mo1279()).size() > 0) {
            i3++;
        }
        InterfaceC4395 interfaceC4395 = this.f51675;
        if (((AbstractC8713) interfaceC4395.mo3473()).size() > 0) {
            i3++;
        }
        C12158 c12158 = this.f51679;
        if (((AbstractC8713) c12158.mo3473()).size() > 0) {
            i3++;
        }
        InterfaceC1136 interfaceC1136 = this.f51689;
        if (((AbstractC8713) interfaceC1136.mo3473()).size() > 0) {
            i3++;
        }
        InterfaceC13132 interfaceC13132 = this.f51674;
        int size = ((AbstractC8713) interfaceC13132.mo3473()).size();
        C7474 c7475 = this.f51667;
        if (size <= 0) {
            c7474 = c7475;
            if (c7475.f24881 < 17) {
            }
            if (this.f51676 > 0) {
                i3++;
            }
            if (this.f51695 > 0) {
                i3++;
            }
            if (this.f51691 > 0) {
                i3++;
            }
            if (this.f51705 > 0) {
                i3++;
            }
            c0162 = this.f51692;
            if (((AbstractC8713) c0162.mo1279()).size() > 0) {
                i3++;
            }
            if (this.f51683 > 0) {
                i3++;
            }
            if (mo22163()) {
                i3++;
            }
            C15249.m36518(c15249, i3 + 1);
            m37919(c15249, 0, 1, 0);
            m37919(c15249, 1, ((AbstractC8713) interfaceC3253.mo1279()).size(), this.f51685);
            m37919(c15249, 2, ((AbstractC8713) c22596.mo1279()).size(), this.f51688);
            m37919(c15249, 3, ((AbstractC8713) c23530.mo1279()).size(), this.f51673);
            m37919(c15249, 4, ((AbstractC8713) c17884.mo1279()).size(), this.f51682);
            m37919(c15249, 5, ((AbstractC8713) c12241.mo1279()).size(), this.f51686);
            m37919(c15249, 6, ((AbstractC8713) c0162.mo1279()).size(), this.f51704);
            m37919(c15249, 7, c21329.m47839(), this.f51671);
            m37919(c15249, 8, ((AbstractC8713) c20707.mo1279()).size(), this.f51664);
            m37919(c15249, o.a.r, ((AbstractC8713) interfaceC3253.mo1279()).size(), this.f51690);
            m37919(c15249, o.a.a, ((AbstractC8713) interfaceC4395.mo3473()).size(), this.f51703);
            m37919(c15249, o.a.u, ((AbstractC8713) c12158.mo3473()).size(), this.f51698);
            m37919(c15249, o.a.t, ((AbstractC8713) interfaceC1136.mo3473()).size(), this.f51684);
            int size2 = ((AbstractC8713) interfaceC13132.mo3473()).size();
            if (c7474.f24881 < 17) {
                i = 1;
            } else {
                i = 0;
            }
            m37919(c15249, o.a.c, size2 + i, this.f51702);
            m37919(c15249, o.a.b, this.f51676, this.f51668);
            m37919(c15249, 8198, this.f51695, this.f51672);
            m37919(c15249, o.a.s, this.f51691, this.f51697);
            m37919(c15249, o.a.q, this.f51705, this.f51701);
            m37919(c15249, 8192, this.f51683, this.f51677);
            if (mo22163()) {
                i2 = 1;
                m37919(c15249, 61440, 1, this.f51700);
            } else {
                i2 = 1;
            }
            m37919(c15249, 4096, i2, this.f51693);
        }
        c7474 = c7475;
        i3++;
        if (this.f51676 > 0) {
            i3++;
        }
        if (this.f51695 > 0) {
            i3++;
        }
        if (this.f51691 > 0) {
            i3++;
        }
        if (this.f51705 > 0) {
            i3++;
        }
        c0162 = this.f51692;
        if (((AbstractC8713) c0162.mo1279()).size() > 0) {
            i3++;
        }
        if (this.f51683 > 0) {
            i3++;
        }
        if (mo22163()) {
            i3++;
        }
        C15249.m36518(c15249, i3 + 1);
        m37919(c15249, 0, 1, 0);
        m37919(c15249, 1, ((AbstractC8713) interfaceC3253.mo1279()).size(), this.f51685);
        m37919(c15249, 2, ((AbstractC8713) c22596.mo1279()).size(), this.f51688);
        m37919(c15249, 3, ((AbstractC8713) c23530.mo1279()).size(), this.f51673);
        m37919(c15249, 4, ((AbstractC8713) c17884.mo1279()).size(), this.f51682);
        m37919(c15249, 5, ((AbstractC8713) c12241.mo1279()).size(), this.f51686);
        m37919(c15249, 6, ((AbstractC8713) c0162.mo1279()).size(), this.f51704);
        m37919(c15249, 7, c21329.m47839(), this.f51671);
        m37919(c15249, 8, ((AbstractC8713) c20707.mo1279()).size(), this.f51664);
        m37919(c15249, o.a.r, ((AbstractC8713) interfaceC3253.mo1279()).size(), this.f51690);
        m37919(c15249, o.a.a, ((AbstractC8713) interfaceC4395.mo3473()).size(), this.f51703);
        m37919(c15249, o.a.u, ((AbstractC8713) c12158.mo3473()).size(), this.f51698);
        m37919(c15249, o.a.t, ((AbstractC8713) interfaceC1136.mo3473()).size(), this.f51684);
        int size3 = ((AbstractC8713) interfaceC13132.mo3473()).size();
        if (c7474.f24881 < 17) {
            i = 1;
        } else {
            i = 0;
        }
        m37919(c15249, o.a.c, size3 + i, this.f51702);
        m37919(c15249, o.a.b, this.f51676, this.f51668);
        m37919(c15249, 8198, this.f51695, this.f51672);
        m37919(c15249, o.a.s, this.f51691, this.f51697);
        m37919(c15249, o.a.q, this.f51705, this.f51701);
        m37919(c15249, 8192, this.f51683, this.f51677);
        if (mo22163()) {
            i2 = 1;
            m37919(c15249, 61440, 1, this.f51700);
        } else {
            i2 = 1;
        }
        m37919(c15249, 4096, i2, this.f51693);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37919(C15249 c15249, int i, int i2, int i3) throws IOException {
        if (i2 > 0) {
            c15249.m36528(i);
            c15249.m36528(0);
            C15249.m36518(c15249, i2);
            C15249.m36518(c15249, i3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37918(C15249 c15249, int i, int i2) throws IOException {
        byte[] bArrM22922 = C8804.m22922(this.f51667.f24881);
        c15249.write(bArrM22922, 0, bArrM22922.length);
        C15249.m36518(c15249, 0);
        c15249.write(new byte[20], 0, 20);
        C15249.m36518(c15249, i2);
        C15249.m36518(c15249, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        C15249.m36518(c15249, 305419896);
        C15249.m36518(c15249, 0);
        C15249.m36518(c15249, 0);
        C15249.m36518(c15249, this.f51693);
        m37931(c15249, ((AbstractC8713) this.f51669.mo1279()).size(), this.f51685);
        m37931(c15249, ((AbstractC8713) this.f51666.mo1279()).size(), this.f51688);
        m37931(c15249, ((AbstractC8713) this.f51670.mo1279()).size(), this.f51673);
        m37931(c15249, ((AbstractC8713) this.f51680.mo1279()).size(), this.f51682);
        m37931(c15249, ((AbstractC8713) this.f51694.mo1279()).size(), this.f51686);
        m37931(c15249, ((AbstractC8713) this.f51692.mo1279()).size(), this.f51704);
        C15249.m36518(c15249, i2 - i);
        C15249.m36518(c15249, i);
    }
}
