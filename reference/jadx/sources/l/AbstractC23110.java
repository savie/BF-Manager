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

/* JADX INFO: renamed from: l.᩸᩹ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VZ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23110 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static Comparator f74917 = new C1261();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C5868 f74918;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C5365 f74922;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C1481 f74926;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13413[] f74929;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C19647 f74931;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9092 f74937;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final C14816 f74939;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C17054 f74940;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C15059 f74945;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18414 f74949;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20872 f74950;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11087 f74952;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC21398 f74953;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3718 f74956;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final HashMap f74944 = new HashMap();

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f74935 = 0;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f74927 = 0;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f74925 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f74928 = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f74930 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f74959 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f74920 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f74947 = 0;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f74954 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f74936 = 0;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f74943 = 0;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f74951 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f74934 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f74942 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f74955 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f74924 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f74957 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f74946 = 0;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f74923 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f74941 = 0;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f74958 = false;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f74933 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f74948 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f74921 = 0;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f74932 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f74919 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Comparator f74938 = new C9463((C8850) this);

    /* JADX INFO: renamed from: ۙ */
    public abstract C2884 mo23707();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo23716(C5210 c5210, Object obj);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m52038(C10209 c10209, int i, int i2) throws IOException {
        C10209.m26338(c10209, i);
        if (i > 0) {
            C10209.m26338(c10209, i2);
        } else {
            C10209.m26338(c10209, 0);
        }
    }

    public AbstractC23110(C19647 c19647) {
        this.f74931 = c19647;
        C2884 c2884Mo23707 = mo23707();
        this.f74956 = c2884Mo23707.m9504();
        C14816 c14816M9507 = c2884Mo23707.m9507();
        this.f74939 = c14816M9507;
        C17054 c17054M9500 = c2884Mo23707.m9500();
        this.f74940 = c17054M9500;
        C9092 c9092M9506 = c2884Mo23707.m9506();
        this.f74937 = c9092M9506;
        C5868 c5868M9502 = c2884Mo23707.m9502();
        this.f74918 = c5868M9502;
        this.f74945 = c2884Mo23707.m9510();
        C1481 c1481M9503 = c2884Mo23707.m9503();
        this.f74926 = c1481M9503;
        C11087 c11087M9505 = c2884Mo23707.m9505();
        this.f74952 = c11087M9505;
        this.f74950 = c2884Mo23707.m9511();
        this.f74953 = c2884Mo23707.m9501();
        this.f74949 = c2884Mo23707.m9509();
        this.f74922 = c2884Mo23707.m9508();
        this.f74929 = new InterfaceC13413[]{c14816M9507, c17054M9500, c9092M9506, c5868M9502, c1481M9503, c11087M9505};
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10209 m52036(InterfaceC14070 interfaceC14070, int i) {
        return new C10209(interfaceC14070.mo14972(i), i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m52040() {
        return (this.f74952.getItemCount() * 8) + (this.f74926.m5274() * 4) + (this.f74945.getItemCount() * 32) + (this.f74918.getItemCount() * 8) + (this.f74937.getItemCount() * 8) + (this.f74940.getItemCount() * 12) + (this.f74939.getItemCount() * 4) + (this.f74956.getItemCount() * 4) + UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m52045() {
        for (InterfaceC13413 interfaceC13413 : this.f74929) {
            if (interfaceC13413.getItemCount() > 65536) {
                System.err.println("Number of section items overflowed: 65535: " + interfaceC13413.getClass().getSimpleName() + "[" + interfaceC13413.getItemCount() + "]");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52043(InterfaceC14070 interfaceC14070) {
        InterfaceC7359 interfaceC7359M36768 = C15321.m36768();
        C15059 c15059 = this.f74945;
        if (this.f74918.getItemCount() <= 65536) {
            if (m52045()) {
                throw new IOException("Number of section items overflowed: 65535");
            }
            C1481 c1481 = this.f74926;
            Iterator it = ((AbstractC13567) c1481.mo5271()).iterator();
            int i = -1;
            while (it.hasNext()) {
                int index = ((InterfaceC2338) ((Map.Entry) it.next()).getKey()).getIndex();
                if (index >= 0 && index < 65536 && index > i) {
                    i = index;
                }
            }
            int itemCount = (i + 1) - c1481.getItemCount();
            if (itemCount > 0) {
                c1481.m5273(itemCount);
            }
            try {
                int iM52040 = m52040();
                C10209 c10209M52036 = m52036(interfaceC14070, 0);
                C10209 c10209M52037 = m52036(interfaceC14070, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                C10209 c10209M52038 = m52036(interfaceC14070, iM52040);
                try {
                    m52025(c10209M52037, c10209M52038);
                    m52034(c10209M52037);
                    m52033(c10209M52038);
                    m52042(c10209M52037);
                    m52031(c10209M52037);
                    m52030(c10209M52037);
                    C10209 c10209M52039 = m52036(interfaceC14070, (c1481.m5274() * 4) + (c15059.getItemCount() * 32) + c10209M52037.getPosition());
                    try {
                        m52016(c10209M52039);
                        c10209M52039.close();
                        m52032(c10209M52038);
                        C10209 c10209M520310 = m52036(interfaceC14070, (c15059.getItemCount() * 32) + c10209M52037.getPosition());
                        try {
                            m52035(c10209M520310);
                            c10209M520310.close();
                            m52041(c10209M52038);
                            m52029(c10209M52038);
                            m52037(c10209M52038);
                            m52020(c10209M52038);
                            m52026(c10209M52038, interfaceC7359M36768.mo20182());
                            m52027(interfaceC14070, c10209M52037, c10209M52038);
                            m52028(c10209M52038);
                            m52021(c10209M52036, iM52040, c10209M52038.getPosition());
                            c10209M52036.close();
                            c10209M52037.close();
                            c10209M52038.close();
                            m52039(interfaceC14070);
                            Adler32 adler32 = new Adler32();
                            byte[] bArr = new byte[4096];
                            InputStream inputStreamMo14973 = interfaceC14070.mo14973(12);
                            for (int i2 = inputStreamMo14973.read(bArr); i2 >= 0; i2 = inputStreamMo14973.read(bArr)) {
                                adler32.update(bArr, 0, i2);
                            }
                            OutputStream outputStreamMo14972 = interfaceC14070.mo14972(8);
                            C10209.m26338(outputStreamMo14972, (int) adler32.getValue());
                            outputStreamMo14972.close();
                            interfaceC14070.close();
                            return;
                        } catch (Throwable th) {
                            c10209M520310.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        c10209M52039.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c10209M52036.close();
                    c10209M52037.close();
                    c10209M52038.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                interfaceC14070.close();
                throw th4;
            }
        }
        throw new IOException(C21576.m49088(R.string.MT_Protector));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52044(AbstractC22044 abstractC22044) {
        if (!abstractC22044.mo2934()) {
            C4881 c4881 = new C4881(abstractC22044);
            try {
                m52043(c4881);
                c4881.close();
            } catch (Throwable th) {
                try {
                    c4881.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            AbstractC22044 abstractC22044M49862 = abstractC22044.m49862(".tmp");
            try {
                C4881 c4882 = new C4881(abstractC22044M49862);
                try {
                    m52043(c4882);
                    c4882.close();
                    abstractC22044M49862.m49845(abstractC22044, (Runnable) null);
                    abstractC22044M49862.mo4296();
                } catch (Throwable th3) {
                    try {
                        c4882.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                abstractC22044M49862.mo4296();
                throw th5;
            }
        }
        C14584.m35196(abstractC22044);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m52039(InterfaceC14070 interfaceC14070) throws IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            byte[] bArr = new byte[4096];
            InputStream inputStreamMo14973 = interfaceC14070.mo14973(32);
            for (int i = inputStreamMo14973.read(bArr); i >= 0; i = inputStreamMo14973.read(bArr)) {
                messageDigest.update(bArr, 0, i);
            }
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest.length != 20) {
                throw new RuntimeException(C12669.m31437(bArrDigest.length, " bytes", new StringBuilder("unexpected digest write: ")));
            }
            OutputStream outputStreamMo14972 = interfaceC14070.mo14972(12);
            outputStreamMo14972.write(bArrDigest);
            outputStreamMo14972.close();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52025(C10209 c10209, C10209 c102010) throws IOException {
        this.f74935 = c10209.getPosition();
        this.f74954 = c102010.getPosition();
        ArrayList<Map.Entry> arrayList = new ArrayList((AbstractCollection) this.f74956.mo5271());
        Collections.sort(arrayList, f74917);
        int i = 0;
        for (Map.Entry entry : arrayList) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            C10209.m26338(c10209, c102010.getPosition());
            String string = ((CharSequence) entry.getKey()).toString();
            C10209.m26339(c102010, string.length());
            c102010.m26346(string);
            c102010.write(0);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m52034(C10209 c10209) throws IOException {
        this.f74927 = c10209.getPosition();
        C14816 c14816 = this.f74939;
        ArrayList<Map.Entry> arrayList = new ArrayList((AbstractCollection) c14816.mo5271());
        Collections.sort(arrayList, f74917);
        int i = 0;
        for (Map.Entry entry : arrayList) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            C10209.m26338(c10209, this.f74956.mo5275(c14816.m35670((CharSequence) entry.getKey())));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m52042(C10209 c10209) throws IOException {
        this.f74925 = c10209.getPosition();
        C17054 c17054 = this.f74940;
        ArrayList<Map.Entry> arrayList = new ArrayList((AbstractCollection) c17054.mo5271());
        Collections.sort(arrayList, new C2752());
        int i = 0;
        for (Map.Entry entry : arrayList) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            InterfaceC13524 interfaceC13524 = (InterfaceC13524) entry.getKey();
            C10209.m26338(c10209, this.f74956.mo5275(c17054.m40182(interfaceC13524)));
            C10209.m26338(c10209, this.f74939.mo5275(c17054.m40183(interfaceC13524)));
            C10209.m26338(c10209, this.f74950.mo41743(c17054.m40181(interfaceC13524)));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m52031(C10209 c10209) throws IOException {
        this.f74928 = c10209.getPosition();
        C9092 c9092 = this.f74937;
        ArrayList<Map.Entry> arrayList = new ArrayList((AbstractCollection) c9092.mo5271());
        Collections.sort(arrayList, new C2752());
        int i = 0;
        for (Map.Entry entry : arrayList) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            InterfaceC8304 interfaceC8304 = (InterfaceC8304) entry.getKey();
            C21530 c21530M24230 = c9092.m24230(interfaceC8304);
            C14816 c14816 = this.f74939;
            c10209.m26348(c14816.mo5275(c21530M24230));
            c10209.m26348(c14816.mo5275(c9092.m24233(interfaceC8304)));
            C10209.m26338(c10209, this.f74956.mo5275(c9092.m24231(interfaceC8304)));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m52030(C10209 c10209) throws IOException {
        this.f74930 = c10209.getPosition();
        C5868 c5868 = this.f74918;
        ArrayList<Map.Entry> arrayList = new ArrayList((AbstractCollection) c5868.mo5271());
        Collections.sort(arrayList, new C2752());
        int i = 0;
        for (Map.Entry entry : arrayList) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            InterfaceC4859 interfaceC4859 = (InterfaceC4859) entry.getKey();
            c10209.m26348(this.f74939.mo5275(c5868.m17095(interfaceC4859)));
            c10209.m26348(this.f74940.mo5275(c5868.m17097(interfaceC4859)));
            C10209.m26338(c10209, this.f74956.mo5275(c5868.m17099(interfaceC4859)));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52027(InterfaceC14070 interfaceC14070, C10209 c10209, C10209 c102010) throws IOException {
        this.f74959 = c10209.getPosition();
        this.f74936 = c102010.getPosition();
        C15059 c15059 = this.f74945;
        ArrayList arrayList = new ArrayList((AbstractCollection) c15059.mo5271());
        Collections.sort(arrayList, new C2752());
        Iterator it = arrayList.iterator();
        int iM52018 = 0;
        while (it.hasNext()) {
            iM52018 = m52018(c10209, c102010, iM52018, (Map.Entry) it.next());
        }
        if (mo23718()) {
            c102010.m26341();
            this.f74923 = c102010.getPosition();
            ArrayList<Map.Entry> arrayList2 = new ArrayList((AbstractCollection) c15059.mo5271());
            Collections.sort(arrayList2, new C8718());
            C22364 c22364 = new C22364(interfaceC14070, c102010, arrayList2.size());
            try {
                for (Map.Entry entry : arrayList2) {
                    Iterator it2 = c15059.m36256((Comparable) entry.getKey()).iterator();
                    while (it2.hasNext()) {
                        c22364.m50441(c15059.m36277(it2.next()));
                    }
                    Iterator it3 = c15059.m36273((Comparable) entry.getKey()).iterator();
                    while (it3.hasNext()) {
                        c22364.m50441(c15059.m36277(it3.next()));
                    }
                    Iterator<E> it4 = c15059.m36281((Comparable) entry.getKey()).iterator();
                    while (it4.hasNext()) {
                        c22364.m50441(c15059.m36257(it4.next()));
                    }
                    Iterator<E> it5 = c15059.m36270((Comparable) entry.getKey()).iterator();
                    while (it5.hasNext()) {
                        c22364.m50441(c15059.m36257(it5.next()));
                    }
                    c22364.m50442();
                }
            } finally {
                c22364.m50440();
            }
        }
    }

    /* JADX INFO: renamed from: ۤ */
    public boolean mo23718() {
        return this.f74958 && this.f74931.f63286 >= 29;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m52018(C10209 c10209, C10209 c102010, int i, Map.Entry entry) throws IOException {
        if (entry == null || ((Integer) entry.getValue()).intValue() != -1) {
            return i;
        }
        Comparable comparable = (Comparable) entry.getKey();
        entry.setValue(0);
        C15059 c15059 = this.f74945;
        int iM52018 = m52018(c10209, c102010, i, c15059.m36260((CharSequence) c15059.m36280(comparable)));
        C20784 c20784M36286 = c15059.m36286(comparable);
        InterfaceC20872 interfaceC20872 = this.f74950;
        Iterator it = interfaceC20872.mo47700(c20784M36286).iterator();
        while (it.hasNext()) {
            iM52018 = m52018(c10209, c102010, iM52018, c15059.m36260((CharSequence) it.next()));
        }
        int i2 = iM52018 + 1;
        entry.setValue(Integer.valueOf(iM52018));
        C21530 c21530M36276 = c15059.m36276(comparable);
        C14816 c14816 = this.f74939;
        C10209.m26338(c10209, c14816.mo5275(c21530M36276));
        C10209.m26338(c10209, c15059.m36259(comparable));
        C10209.m26338(c10209, c14816.mo35672(c15059.m36280(comparable)));
        C10209.m26338(c10209, interfaceC20872.mo41743(c15059.m36286(comparable)));
        C10209.m26338(c10209, this.f74956.mo35672(c15059.m36289(comparable)));
        C10209.m26338(c10209, c15059.m36283(comparable));
        SortedSet sortedSetM36256 = c15059.m36256(comparable);
        SortedSet sortedSetM36273 = c15059.m36273(comparable);
        AbstractC5439 abstractC5439M36281 = c15059.m36281(comparable);
        AbstractC5439 abstractC5439M36270 = c15059.m36270(comparable);
        boolean z = sortedSetM36256.size() > 0 || sortedSetM36273.size() > 0 || abstractC5439M36281.size() > 0 || abstractC5439M36270.size() > 0;
        if (z) {
            C10209.m26338(c10209, c102010.getPosition());
        } else {
            C10209.m26338(c10209, 0);
        }
        C11330 c11330M36278 = c15059.m36278(comparable);
        if (c11330M36278 != null) {
            C10209.m26338(c10209, this.f74922.mo16027(c11330M36278));
        } else {
            C10209.m26338(c10209, 0);
        }
        if (z) {
            this.f74919++;
            C10209.m26339(c102010, sortedSetM36256.size());
            C10209.m26339(c102010, sortedSetM36273.size());
            C10209.m26339(c102010, abstractC5439M36281.size());
            C10209.m26339(c102010, abstractC5439M36270.size());
            m52023(c102010, sortedSetM36256);
            m52023(c102010, sortedSetM36273);
            m52024(c102010, abstractC5439M36281);
            m52024(c102010, abstractC5439M36270);
        }
        return i2;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m52035(C10209 c10209) throws IOException {
        C5365 c5365;
        this.f74920 = c10209.getPosition();
        C19327 c19327 = new C19327();
        ArrayList arrayList = new ArrayList();
        C1481 c1481 = this.f74926;
        int i = -1;
        for (Map.Entry entry : (AbstractC13567) c1481.mo5271()) {
            int index = ((InterfaceC2338) entry.getKey()).getIndex();
            if (index < 0 || index >= 65536 || c19327.mo13467(index)) {
                arrayList.add(entry);
            } else {
                c19327.mo13466(index, entry);
                if (index > i) {
                    i = index;
                }
            }
        }
        Collections.sort(arrayList, this.f74938);
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            c5365 = this.f74922;
            if (i2 > i) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) c19327.get(i2);
            if (entry2 == null && it.hasNext()) {
                entry2 = (Map.Entry) it.next();
            }
            if (entry2 != null) {
                entry2.setValue(Integer.valueOf(i2));
                C10209.m26338(c10209, c5365.mo16027(c1481.m5272((InterfaceC2338) entry2.getKey())));
            } else {
                C10209.m26338(c10209, -1);
            }
            i2++;
        }
        while (it.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it.next();
            i++;
            entry3.setValue(Integer.valueOf(i));
            C10209.m26338(c10209, c5365.mo16027(c1481.m5272((InterfaceC2338) entry3.getKey())));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52016(C10209 c10209) throws IOException {
        int iMo5275;
        this.f74947 = c10209.getPosition();
        C11087 c11087 = this.f74952;
        int i = 0;
        for (Map.Entry entry : (AbstractC13567) c11087.mo5271()) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            InterfaceC6813 interfaceC6813 = (InterfaceC6813) entry.getKey();
            c10209.m26348(interfaceC6813.mo17433());
            c10209.m26348(0);
            switch (interfaceC6813.mo17433()) {
                case 0:
                case 1:
                case 2:
                case 3:
                    iMo5275 = this.f74937.mo5275(c11087.m27999(interfaceC6813));
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    iMo5275 = this.f74918.mo5275(c11087.m28001(interfaceC6813));
                    break;
                default:
                    throw new C23044(null, "Invalid method handle type: %d", Integer.valueOf(interfaceC6813.mo17433()));
            }
            c10209.m26348(iMo5275);
            c10209.m26348(0);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52023(C10209 c10209, SortedSet sortedSet) throws IOException {
        int i = 0;
        for (Object obj : sortedSet) {
            int iM24232 = this.f74937.m24232(obj);
            C15059 c15059 = this.f74945;
            if (!c15059.m36277(obj).isEmpty()) {
                this.f74958 = true;
            }
            C10209.m26339(c10209, iM24232 - i);
            C10209.m26339(c10209, c15059.m36269(obj));
            i = iM24232;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52024(C10209 c10209, AbstractC5439 abstractC5439) throws IOException {
        int i = 0;
        for (Object obj : abstractC5439) {
            int iM17098 = this.f74918.m17098(obj);
            C15059 c15059 = this.f74945;
            if (!c15059.m36257(obj).isEmpty()) {
                this.f74958 = true;
            }
            C10209.m26339(c10209, iM17098 - i);
            C10209.m26339(c10209, c15059.m36275(obj));
            C10209.m26339(c10209, c15059.m36264(obj));
            i = iM17098;
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m52033(C10209 c10209) throws IOException {
        c10209.m26341();
        this.f74943 = c10209.getPosition();
        InterfaceC20872 interfaceC20872 = this.f74950;
        for (Map.Entry entry : (AbstractC13567) interfaceC20872.mo16024()) {
            c10209.m26341();
            entry.setValue(Integer.valueOf(c10209.getPosition()));
            List listMo47700 = interfaceC20872.mo47700(entry.getKey());
            C10209.m26338(c10209, listMo47700.size());
            Iterator it = listMo47700.iterator();
            while (it.hasNext()) {
                c10209.m26348(this.f74939.mo5275((CharSequence) it.next()));
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m52032(C10209 c10209) throws IOException {
        C5210 c5210 = new C5210(this, c10209);
        this.f74951 = c10209.getPosition();
        C5365 c5365 = this.f74922;
        for (Map.Entry entry : (AbstractC13567) c5365.mo16024()) {
            entry.setValue(Integer.valueOf(c10209.getPosition()));
            List listM16026 = c5365.m16026(entry.getKey());
            C10209.m26339(c10209, listM16026.size());
            Iterator it = listM16026.iterator();
            while (it.hasNext()) {
                mo23716(c5210, it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m52041(C10209 c10209) throws IOException {
        C5210 c5210 = new C5210(this, c10209);
        this.f74934 = c10209.getPosition();
        InterfaceC21398 interfaceC21398 = this.f74953;
        for (Map.Entry entry : (AbstractC13567) interfaceC21398.mo16024()) {
            entry.setValue(Integer.valueOf(c10209.getPosition()));
            InterfaceC7886 interfaceC7886 = (InterfaceC7886) entry.getKey();
            c10209.m26344(interfaceC21398.mo48652(interfaceC7886));
            C10209.m26339(c10209, this.f74939.mo5275(interfaceC21398.mo48649(interfaceC7886)));
            AbstractC1928 abstractC1928M6613 = AbstractC1928.m6613(AbstractC18753.m43551(AbstractC18155.f59356), interfaceC21398.mo48651(interfaceC7886));
            C10209.m26339(c10209, abstractC1928M6613.size());
            AbstractC14956 abstractC14956ListIterator = abstractC1928M6613.listIterator(0);
            while (abstractC14956ListIterator.hasNext()) {
                InterfaceC19073 interfaceC19073 = (InterfaceC19073) abstractC14956ListIterator.next();
                C10209.m26339(c10209, this.f74956.mo5275(interfaceC21398.mo48653(interfaceC19073)));
                mo23716(c5210, interfaceC21398.mo48650(interfaceC19073));
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m52029(C10209 c10209) throws IOException {
        c10209.m26341();
        this.f74942 = c10209.getPosition();
        if (this.f74931.f63286 < 17) {
            C10209.m26338(c10209, 0);
        }
        InterfaceC18414 interfaceC18414 = this.f74949;
        for (Map.Entry entry : (AbstractC13567) interfaceC18414.mo16024()) {
            AbstractC1928 abstractC1928M6613 = AbstractC1928.m6613(AbstractC18753.m43551(AbstractC14425.f45428), interfaceC18414.mo42922(entry.getKey()));
            c10209.m26341();
            entry.setValue(Integer.valueOf(c10209.getPosition()));
            C10209.m26338(c10209, abstractC1928M6613.size());
            AbstractC14956 abstractC14956ListIterator = abstractC1928M6613.listIterator(0);
            while (abstractC14956ListIterator.hasNext()) {
                C10209.m26338(c10209, this.f74953.mo16027(abstractC14956ListIterator.next()));
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m52037(C10209 c10209) throws IOException {
        int iMo16027;
        c10209.m26341();
        this.f74955 = c10209.getPosition();
        HashMap map = new HashMap();
        C15059 c15059 = this.f74945;
        AbstractC14956 abstractC14956ListIterator = c15059.m36285().listIterator(0);
        while (abstractC14956ListIterator.hasNext()) {
            for (Object obj : c15059.m36265((Comparable) abstractC14956ListIterator.next())) {
                List listM36282 = c15059.m36282(obj);
                if (listM36282 != null) {
                    Integer num = (Integer) map.get(listM36282);
                    if (num != null) {
                        c15059.m36262(num.intValue(), obj);
                    } else {
                        c10209.m26341();
                        int position = c10209.getPosition();
                        c15059.m36262(position, obj);
                        map.put(listM36282, Integer.valueOf(position));
                        this.f74933++;
                        C10209.m26338(c10209, listM36282.size());
                        for (Object obj2 : listM36282) {
                            InterfaceC18414 interfaceC18414 = this.f74949;
                            if (interfaceC18414.mo42922(obj2).size() > 0) {
                                iMo16027 = interfaceC18414.mo16027(obj2);
                            } else if (this.f74931.f63286 >= 17) {
                                C10209.m26338(c10209, 0);
                            } else {
                                iMo16027 = this.f74942;
                            }
                            C10209.m26338(c10209, iMo16027);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52020(C10209 c10209) throws IOException {
        InterfaceC18414 interfaceC18414;
        C5868 c5868;
        c10209.m26341();
        this.f74924 = c10209.getPosition();
        HashMap map = new HashMap();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(65536);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        C15059 c15059 = this.f74945;
        AbstractC14956 abstractC14956ListIterator = c15059.m36285().listIterator(0);
        while (abstractC14956ListIterator.hasNext()) {
            Comparable comparable = (Comparable) abstractC14956ListIterator.next();
            Collection collectionM36274 = c15059.m36274(comparable);
            Collection collectionM36265 = c15059.m36265(comparable);
            int size = (collectionM36265.size() * 16) + (collectionM36274.size() * 8);
            if (size > byteBufferAllocate.capacity()) {
                byteBufferAllocate = ByteBuffer.allocate(size);
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            }
            byteBufferAllocate.clear();
            Iterator it = collectionM36274.iterator();
            int i = 0;
            while (true) {
                boolean zHasNext = it.hasNext();
                interfaceC18414 = this.f74949;
                if (!zHasNext) {
                    break;
                }
                Object next = it.next();
                C18634 c18634M36290 = c15059.m36290(next);
                if (c18634M36290 != null) {
                    i++;
                    byteBufferAllocate.putInt(this.f74937.m24232(next));
                    byteBufferAllocate.putInt(interfaceC18414.mo16027(c18634M36290));
                }
            }
            Iterator it2 = collectionM36265.iterator();
            int i2 = 0;
            while (true) {
                boolean zHasNext2 = it2.hasNext();
                c5868 = this.f74918;
                if (!zHasNext2) {
                    break;
                }
                Object next2 = it2.next();
                C18634 c18634M36287 = c15059.m36287(next2);
                if (c18634M36287 != null) {
                    i2++;
                    byteBufferAllocate.putInt(c5868.m17098(next2));
                    byteBufferAllocate.putInt(interfaceC18414.mo16027(c18634M36287));
                }
            }
            int i3 = 0;
            for (Object obj : collectionM36265) {
                int iM36272 = c15059.m36272(obj);
                if (iM36272 != 0) {
                    i3++;
                    byteBufferAllocate.putInt(c5868.m17098(obj));
                    byteBufferAllocate.putInt(iM36272);
                }
            }
            C18634 c18634M36268 = c15059.m36268(comparable);
            if (i == 0 && i2 == 0 && i3 == 0) {
                if (c18634M36268 != null) {
                    Integer num = (Integer) map.get(c18634M36268);
                    if (num != null) {
                        c15059.m36261(num.intValue(), comparable);
                    } else {
                        map.put(c18634M36268, Integer.valueOf(c10209.getPosition()));
                    }
                }
            }
            this.f74948++;
            c15059.m36261(c10209.getPosition(), comparable);
            C10209.m26338(c10209, interfaceC18414.mo41743(c18634M36268));
            C10209.m26338(c10209, i);
            C10209.m26338(c10209, i2);
            C10209.m26338(c10209, i3);
            c10209.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
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
    private void m52026(C10209 c10209, C15321 c15321) throws IOException {
        AbstractC14956 abstractC14956;
        List listMo2839;
        Iterable iterableMo2840;
        int position;
        int lineNumber;
        ArrayList arrayList;
        Iterable iterable;
        List list;
        byte[] byteArray;
        C7973 c7973;
        HashMap map;
        int iIntValue;
        InterfaceC22759 interfaceC22759Mo6063;
        C3630 c3630;
        InterfaceC19775 interfaceC19775Mo6065;
        C21530 c21530;
        InterfaceC22759 interfaceC22759Mo6064;
        C3630 c3631;
        ArrayList arrayList2;
        AbstractC14956 abstractC14957;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f74957 = c10209.getPosition();
        C10209 c102010 = new C10209(c15321, 0);
        ArrayList<C13938> arrayList3 = new ArrayList();
        C15059 c15059 = this.f74945;
        AbstractC14956 abstractC14956ListIterator = c15059.m36285().listIterator(0);
        while (abstractC14956ListIterator.hasNext()) {
            Comparable comparable = (Comparable) abstractC14956ListIterator.next();
            Iterator it = C16625.m39329(c15059.m36281(comparable), c15059.m36270(comparable)).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                List listM36288 = c15059.m36288(next);
                Iterable iterableM36279 = c15059.m36279(next);
                Iterable<InterfaceC10650> iterableM36255 = c15059.m36255(next);
                InterfaceC3718 interfaceC3718 = this.f74956;
                if (iterableM36279 == null || !interfaceC3718.mo12104()) {
                    abstractC14956 = abstractC14956ListIterator;
                    listMo2839 = listM36288;
                    iterableMo2840 = iterableM36279;
                } else {
                    Iterator it2 = iterableM36279.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            InterfaceC23331 interfaceC23331 = (InterfaceC23331) it2.next();
                            List list2 = listM36288;
                            Iterable iterable2 = iterableM36279;
                            if (interfaceC23331.mo30864() != EnumC22631.f73506 || interfaceC3718.mo12103((InterfaceC22759) ((InterfaceC6177) interfaceC23331).getReference()) < 65536) {
                                listM36288 = list2;
                                iterableM36279 = iterable2;
                                abstractC14956ListIterator = abstractC14956ListIterator;
                            } else {
                                C10628 c10628M36258 = c15059.m36258(next);
                                List listMo2840 = c10628M36258.mo2840();
                                int i = 0;
                                while (i < listMo2840.size()) {
                                    InterfaceC23331 interfaceC23332 = (InterfaceC23331) listMo2840.get(i);
                                    List list3 = listMo2840;
                                    if (interfaceC23332.mo30864() == EnumC22631.f73506) {
                                        InterfaceC6177 interfaceC6177 = (InterfaceC6177) interfaceC23332;
                                        abstractC14957 = abstractC14956ListIterator;
                                        if (interfaceC3718.mo12103((InterfaceC22759) interfaceC6177.getReference()) >= 65536) {
                                            c10628M36258.m27115(i, new C6900(EnumC22631.f73418, ((InterfaceC12142) interfaceC23332).mo1542(), interfaceC6177.getReference()));
                                        }
                                    } else {
                                        abstractC14957 = abstractC14956ListIterator;
                                    }
                                    i++;
                                    listMo2840 = list3;
                                    abstractC14956ListIterator = abstractC14957;
                                }
                                abstractC14956 = abstractC14956ListIterator;
                                iterableMo2840 = c10628M36258.mo2840();
                                listMo2839 = c10628M36258.mo2839();
                                iterableM36255 = c10628M36258.mo2842();
                            }
                        } else {
                            abstractC14956 = abstractC14956ListIterator;
                            listMo2839 = listM36288;
                            iterableMo2840 = iterableM36279;
                        }
                    }
                }
                Iterable iterableM36271 = c15059.m36271(next);
                int iM39340 = C16625.m39340(iterableM36271);
                Iterator it3 = iterableM36271.iterator();
                int i2 = 0;
                Iterator it4 = it;
                int i3 = -1;
                while (it3.hasNext()) {
                    if (((CharSequence) it3.next()) != null) {
                        i3 = i2;
                    }
                    i2++;
                }
                if (i3 == -1 && (iterableM36255 == null || C16625.m39336(iterableM36255))) {
                    list = listMo2839;
                    iterable = iterableMo2840;
                    arrayList = arrayList3;
                    position = 0;
                } else {
                    position = c10209.getPosition();
                    if (iterableM36255 != null) {
                        Iterator it5 = iterableM36255.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                Iterator it6 = it5;
                                InterfaceC10650 interfaceC10650 = (InterfaceC10650) it5.next();
                                if (interfaceC10650 instanceof InterfaceC19601) {
                                    lineNumber = ((InterfaceC19601) interfaceC10650).getLineNumber();
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
                    iterable = iterableMo2840;
                    list = listMo2839;
                    C10209 c102011 = new C10209(byteArrayOutputStream2, 0, 64);
                    C19160 c19160 = new C19160(interfaceC3718, this.f74939, c102011);
                    C10209.m26339(c102011, lineNumber);
                    C10209.m26339(c102011, iM39340);
                    Iterator it7 = iterableM36271.iterator();
                    int i4 = 0;
                    while (it7.hasNext()) {
                        Iterator it8 = it7;
                        CharSequence charSequence = (CharSequence) it7.next();
                        if (i4 != iM39340) {
                            i4++;
                            C10209.m26339(c102011, interfaceC3718.mo35672(charSequence) + 1);
                            it7 = it8;
                        } else {
                            if (iterableM36255 != null) {
                                c19160.m44400(lineNumber);
                                for (InterfaceC10650 interfaceC10651 : iterableM36255) {
                                    c15059.getClass();
                                    switch (interfaceC10651.mo4171()) {
                                        case 3:
                                            InterfaceC1702 interfaceC1702 = (InterfaceC1702) interfaceC10651;
                                            int iMo15046 = interfaceC1702.mo15046();
                                            int iMo6062 = interfaceC1702.mo6062();
                                            interfaceC22759Mo6063 = interfaceC1702.mo6063();
                                            if (interfaceC22759Mo6063 == null) {
                                                c3630 = null;
                                            } else {
                                                try {
                                                    c3630 = (C3630) interfaceC22759Mo6063;
                                                } catch (ClassCastException unused) {
                                                    throw new IllegalStateException("Only StringReference instances returned by DexBuilder.internStringReference or DexBuilder.internNullableStringReference may be used.");
                                                }
                                            }
                                            interfaceC19775Mo6065 = interfaceC1702.mo6065();
                                            if (interfaceC19775Mo6065 == null) {
                                                c21530 = null;
                                            } else {
                                                try {
                                                    c21530 = (C21530) interfaceC19775Mo6065;
                                                } catch (ClassCastException unused2) {
                                                    throw new IllegalStateException("Only TypeReference instances returned by DexBuilder.internTypeReference or DexBuilder.internNullableTypeReference may be used.");
                                                }
                                            }
                                            interfaceC22759Mo6064 = interfaceC1702.mo6064();
                                            if (interfaceC22759Mo6064 == null) {
                                                c3631 = null;
                                            } else {
                                                try {
                                                    c3631 = (C3630) interfaceC22759Mo6064;
                                                } catch (ClassCastException unused3) {
                                                    throw new IllegalStateException("Only StringReference instances returned by DexBuilder.internStringReference or DexBuilder.internNullableStringReference may be used.");
                                                }
                                            }
                                            c19160.m44402(iMo15046, iMo6062, c3630, c21530, c3631);
                                            break;
                                        case 4:
                                        default:
                                            throw new C23044(null, "Unexpected debug item type: %d", Integer.valueOf(interfaceC10651.mo4171()));
                                        case 5:
                                            InterfaceC22585 interfaceC22585 = (InterfaceC22585) interfaceC10651;
                                            c19160.m44401(interfaceC22585.mo15046(), interfaceC22585.mo26041());
                                            break;
                                        case 6:
                                            InterfaceC12888 interfaceC12888 = (InterfaceC12888) interfaceC10651;
                                            c19160.m44405(interfaceC12888.mo15046(), interfaceC12888.mo6025());
                                            break;
                                        case 7:
                                            c19160.m44404(interfaceC10651.mo15046());
                                            break;
                                        case 8:
                                            c19160.m44406(interfaceC10651.mo15046());
                                            break;
                                        case 9:
                                            InterfaceC5431 interfaceC5431 = (InterfaceC5431) interfaceC10651;
                                            int iMo15047 = interfaceC5431.mo15046();
                                            InterfaceC22759 interfaceC22759Mo16162 = interfaceC5431.mo16162();
                                            if (interfaceC22759Mo16162 != null) {
                                                try {
                                                } catch (ClassCastException unused4) {
                                                    throw new IllegalStateException("Only StringReference instances returned by DexBuilder.internStringReference or DexBuilder.internNullableStringReference may be used.");
                                                }
                                            }
                                            c19160.m44403(iMo15047, interfaceC22759Mo16162 != null ? (C3630) interfaceC22759Mo16162 : null);
                                            break;
                                        case 10:
                                            InterfaceC19601 interfaceC19601 = (InterfaceC19601) interfaceC10651;
                                            c19160.m44407(interfaceC19601.mo15046(), interfaceC19601.getLineNumber());
                                            break;
                                    }
                                }
                            }
                            c102011.write(0);
                            c102011.flush();
                            byteArray = byteArrayOutputStream2.toByteArray();
                            c7973 = new C7973(byteArray);
                            map = this.f74944;
                            iIntValue = ((Integer) C11392.getOrDefault(map, c7973, -1)).intValue();
                            if (iIntValue >= 0) {
                                position = iIntValue;
                            } else {
                                c10209.write(byteArray);
                                map.put(c7973, Integer.valueOf(position));
                                this.f74921++;
                            }
                        }
                    }
                    if (iterableM36255 != null) {
                        c19160.m44400(lineNumber);
                        while (r1.hasNext()) {
                            c15059.getClass();
                            switch (interfaceC10651.mo4171()) {
                                case 3:
                                    InterfaceC1702 interfaceC1703 = (InterfaceC1702) interfaceC10651;
                                    int iMo15048 = interfaceC1703.mo15046();
                                    int iMo6063 = interfaceC1703.mo6062();
                                    interfaceC22759Mo6063 = interfaceC1703.mo6063();
                                    if (interfaceC22759Mo6063 == null) {
                                        c3630 = null;
                                    } else {
                                        c3630 = (C3630) interfaceC22759Mo6063;
                                    }
                                    interfaceC19775Mo6065 = interfaceC1703.mo6065();
                                    if (interfaceC19775Mo6065 == null) {
                                        c21530 = null;
                                    } else {
                                        c21530 = (C21530) interfaceC19775Mo6065;
                                    }
                                    interfaceC22759Mo6064 = interfaceC1703.mo6064();
                                    if (interfaceC22759Mo6064 == null) {
                                        c3631 = null;
                                    } else {
                                        c3631 = (C3630) interfaceC22759Mo6064;
                                    }
                                    c19160.m44402(iMo15048, iMo6063, c3630, c21530, c3631);
                                    break;
                                case 4:
                                default:
                                    throw new C23044(null, "Unexpected debug item type: %d", Integer.valueOf(interfaceC10651.mo4171()));
                                case 5:
                                    InterfaceC22585 interfaceC22586 = (InterfaceC22585) interfaceC10651;
                                    c19160.m44401(interfaceC22586.mo15046(), interfaceC22586.mo26041());
                                    break;
                                case 6:
                                    InterfaceC12888 interfaceC12889 = (InterfaceC12888) interfaceC10651;
                                    c19160.m44405(interfaceC12889.mo15046(), interfaceC12889.mo6025());
                                    break;
                                case 7:
                                    c19160.m44404(interfaceC10651.mo15046());
                                    break;
                                case 8:
                                    c19160.m44406(interfaceC10651.mo15046());
                                    break;
                                case 9:
                                    InterfaceC5431 interfaceC5432 = (InterfaceC5431) interfaceC10651;
                                    int iMo15049 = interfaceC5432.mo15046();
                                    InterfaceC22759 interfaceC22759Mo16163 = interfaceC5432.mo16162();
                                    c19160.m44403(iMo15049, interfaceC22759Mo16163 != null ? (C3630) interfaceC22759Mo16163 : null);
                                    break;
                                case 10:
                                    InterfaceC19601 interfaceC19602 = (InterfaceC19601) interfaceC10651;
                                    c19160.m44407(interfaceC19602.mo15046(), interfaceC19602.getLineNumber());
                                    break;
                            }
                        }
                    }
                    c102011.write(0);
                    c102011.flush();
                    byteArray = byteArrayOutputStream2.toByteArray();
                    c7973 = new C7973(byteArray);
                    map = this.f74944;
                    iIntValue = ((Integer) C11392.getOrDefault(map, c7973, -1)).intValue();
                    if (iIntValue >= 0) {
                        position = iIntValue;
                    } else {
                        c10209.write(byteArray);
                        map.put(c7973, Integer.valueOf(position));
                        this.f74921++;
                    }
                }
                try {
                    int iM52017 = m52017(c102010, byteArrayOutputStream, next, list, iterable, position);
                    if (iM52017 != -1) {
                        C13938 c13938 = new C13938();
                        c13938.f44182 = iM52017;
                        c13938.f44183 = next;
                        arrayList2 = arrayList;
                        arrayList2.add(c13938);
                    } else {
                        arrayList2 = arrayList;
                    }
                    arrayList3 = arrayList2;
                    abstractC14956ListIterator = abstractC14956;
                    it = it4;
                } catch (RuntimeException e) {
                    throw new C23044(e, "Exception occurred while writing code_item for method %s", this.f74918.m17096(next));
                }
            }
        }
        c10209.m26341();
        this.f74946 = c10209.getPosition();
        c102010.close();
        c15321.m36769(c10209);
        c15321.close();
        for (C13938 c13939 : arrayList3) {
            c15059.m36284(this.f74946 + c13939.f44182, c13939.f44183);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m52017(C10209 c10209, ByteArrayOutputStream byteArrayOutputStream, Object obj, List list, Iterable iterable, int i) throws IOException {
        C21530 c21530;
        Iterator it;
        int iMo1655;
        if (iterable == null && i == 0) {
            return -1;
        }
        this.f74932++;
        c10209.m26341();
        int position = c10209.getPosition();
        C15059 c15059 = this.f74945;
        int iM36266 = c15059.m36266(obj);
        c10209.m26348(iM36266);
        boolean zM8459 = EnumC2536.STATIC.m8459(c15059.m36275(obj));
        C5868 c5868 = this.f74918;
        C2139 c2139M17094 = c5868.m17094(obj);
        C17054 c17054 = this.f74940;
        int iM13548 = C4244.m13548(this.f74950.mo47700(c17054.m40181(c2139M17094)), zM8459);
        int i2 = 3;
        if (iM13548 > iM36266) {
            throw new RuntimeException(String.format("ins_size (%dd) > registers_size (%dd): %s", Integer.valueOf(iM13548), Integer.valueOf(iM36266), obj.toString()));
        }
        c10209.m26348(iM13548);
        if (iterable == null) {
            c10209.m26348(0);
            c10209.m26348(0);
            C10209.m26338(c10209, i);
            C10209.m26338(c10209, 0);
            return position;
        }
        ArrayList<InterfaceC4685> arrayListM13260 = C4135.m13260(list);
        Iterator it2 = iterable.iterator();
        int i3 = 0;
        int iMo3033 = 0;
        while (it2.hasNext()) {
            InterfaceC23331 interfaceC23331 = (InterfaceC23331) it2.next();
            iMo3033 = interfaceC23331.mo3033() + iMo3033;
            int i4 = interfaceC23331.mo30864().f73513;
            if (i4 != i2) {
                iMo1655 = i4 != 5 ? 0 : ((InterfaceC0210) interfaceC23331).mo1655();
                it = it2;
            } else {
                InterfaceC4859 interfaceC4859 = (InterfaceC4859) ((InterfaceC6177) interfaceC23331).getReference();
                EnumC22631 enumC22631Mo30864 = interfaceC23331.mo30864();
                it = it2;
                iMo1655 = (enumC22631Mo30864 == EnumC22631.f73459 || enumC22631Mo30864 == EnumC22631.f73371) ? ((InterfaceC0210) interfaceC23331).mo1655() : C4244.m13548(interfaceC4859.mo6805(), enumC22631Mo30864 == EnumC22631.f73304 || enumC22631Mo30864 == EnumC22631.f73499);
            }
            if (iMo1655 > i3) {
                i3 = iMo1655;
            }
            i2 = 3;
            it2 = it;
        }
        if (i3 > 5 && i3 > iM36266) {
            throw new RuntimeException(String.format("outs_size (%dd) > registers_size (%dd): %s", Integer.valueOf(i3), Integer.valueOf(iM36266), obj.toString()));
        }
        c10209.m26348(i3);
        c10209.m26348(arrayListM13260.size());
        C10209.m26338(c10209, i);
        C19647 c19647 = this.f74931;
        InterfaceC3718 interfaceC3718 = this.f74956;
        C14816 c14816 = this.f74939;
        C2227 c2227 = new C2227(c19647, c10209, interfaceC3718, c14816, this.f74937, c5868, c17054, this.f74952, this.f74926);
        C10209.m26338(c10209, iMo3033);
        Iterator it3 = iterable.iterator();
        int iMo3034 = 0;
        while (it3.hasNext()) {
            InterfaceC23331 interfaceC23332 = (InterfaceC23331) it3.next();
            try {
                switch (C7227.f23827[interfaceC23332.mo30864().f73508.ordinal()]) {
                    case 1:
                        c2227.m7585((InterfaceC0956) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 2:
                        c2227.m7596((InterfaceC9158) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 3:
                        c2227.m7587((InterfaceC2447) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 4:
                        c2227.m7595((InterfaceC8413) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 5:
                        c2227.m7593((InterfaceC6922) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 6:
                        c2227.m7603((InterfaceC13633) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 7:
                        c2227.m7590((InterfaceC4575) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 8:
                        c2227.m7614((InterfaceC21729) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 9:
                        c2227.m7599((InterfaceC10540) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 10:
                        c2227.m7615((InterfaceC22475) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 11:
                        c2227.m7611((InterfaceC19491) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 12:
                        c2227.m7605((InterfaceC15015) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 13:
                        c2227.m7602((InterfaceC12778) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 14:
                        c2227.m7591((InterfaceC5321) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 15:
                        c2227.m7586((InterfaceC1592) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 16:
                        c2227.m7600((InterfaceC11286) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 17:
                        c2227.m7618((InterfaceC24713) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 18:
                        c2227.m7607((InterfaceC16507) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 19:
                        c2227.m7608((InterfaceC17253) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 20:
                        c2227.m7606((InterfaceC15761) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 21:
                        c2227.m7616((InterfaceC23221) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 22:
                        c2227.m7588((InterfaceC3083) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 23:
                        c2227.m7612((InterfaceC20237) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 24:
                        c2227.m7601((InterfaceC12032) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 25:
                        c2227.m7592((InterfaceC6067) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 26:
                        c2227.m7617((InterfaceC23967) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 27:
                        c2227.m7589((InterfaceC3829) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 28:
                        c2227.m7604((InterfaceC14269) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 29:
                        c2227.m7613((InterfaceC20983) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 30:
                        c2227.m7609((InterfaceC17999) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 31:
                        c2227.m7583((InterfaceC0100) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 32:
                        c2227.m7594((InterfaceC7558) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 33:
                        c2227.m7610((InterfaceC18745) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 34:
                        c2227.m7598((InterfaceC9904) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 35:
                        c2227.m7597((InterfaceC9794) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    case 36:
                        c2227.m7584((InterfaceC0846) interfaceC23332);
                        continue;
                        iMo3034 += interfaceC23332.mo3033();
                        break;
                    default:
                        throw new C23044(null, "Unsupported instruction format: %s", interfaceC23332.mo30864().f73508);
                }
            } catch (RuntimeException e) {
                throw new C23044(e, "Error while writing instruction at code offset 0x%x", Integer.valueOf(iMo3034));
            }
            throw new C23044(e, "Error while writing instruction at code offset 0x%x", Integer.valueOf(iMo3034));
        }
        if (arrayListM13260.size() > 0) {
            c10209.m26341();
            HashMap map = new HashMap();
            Iterator it4 = arrayListM13260.iterator();
            while (it4.hasNext()) {
                map.put(((InterfaceC4685) it4.next()).mo4116(), 0);
            }
            C10209.m26339(byteArrayOutputStream, map.size());
            for (InterfaceC4685 interfaceC4685 : arrayListM13260) {
                int iMo4114 = interfaceC4685.mo4114();
                int iMo4115 = (interfaceC4685.mo4115() + iMo4114) - iMo4114;
                C10209.m26338(c10209, iMo4114);
                c10209.m26348(iMo4115);
                if (interfaceC4685.mo4116().size() == 0) {
                    throw new C23044(null, "No exception handlers for the try block!", new Object[0]);
                }
                Integer num = (Integer) map.get(interfaceC4685.mo4116());
                if (num.intValue() != 0) {
                    c10209.m26348(num.intValue());
                } else {
                    int size = byteArrayOutputStream.size();
                    Integer numValueOf = Integer.valueOf(size);
                    c10209.m26348(size);
                    map.put(interfaceC4685.mo4116(), numValueOf);
                    int size2 = interfaceC4685.mo4116().size();
                    if (((InterfaceC9376) interfaceC4685.mo4116().get(size2 - 1)).mo11196() == null) {
                        size2 = (size2 * (-1)) + 1;
                    }
                    C10209.m26340(byteArrayOutputStream, size2);
                    for (InterfaceC9376 interfaceC9376 : interfaceC4685.mo4116()) {
                        c15059.getClass();
                        InterfaceC19775 interfaceC19775Mo20989 = interfaceC9376.mo20989();
                        if (interfaceC19775Mo20989 == null) {
                            c21530 = null;
                        } else {
                            try {
                                c21530 = (C21530) interfaceC19775Mo20989;
                            } catch (ClassCastException unused) {
                                throw new IllegalStateException("Only TypeReference instances returned by DexBuilder.internTypeReference or DexBuilder.internNullableTypeReference may be used.");
                            }
                        }
                        int iMo11197 = interfaceC9376.mo11197();
                        if (c21530 != null) {
                            C10209.m26339(byteArrayOutputStream, c14816.mo5275(c21530));
                            C10209.m26339(byteArrayOutputStream, iMo11197);
                        } else {
                            C10209.m26339(byteArrayOutputStream, iMo11197);
                        }
                    }
                }
            }
            if (byteArrayOutputStream.size() > 0) {
                byteArrayOutputStream.writeTo(c10209);
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
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m52028(C10209 c10209) throws IOException {
        C19647 c19647;
        C15059 c15059;
        int i;
        int i2;
        c10209.m26341();
        this.f74941 = c10209.getPosition();
        InterfaceC3718 interfaceC3718 = this.f74956;
        int i3 = ((AbstractC13567) interfaceC3718.mo5271()).size() > 0 ? 3 : 1;
        C14816 c14816 = this.f74939;
        if (((AbstractC13567) c14816.mo5271()).size() > 0) {
            i3++;
        }
        C17054 c17054 = this.f74940;
        if (((AbstractC13567) c17054.mo5271()).size() > 0) {
            i3++;
        }
        C9092 c9092 = this.f74937;
        if (((AbstractC13567) c9092.mo5271()).size() > 0) {
            i3++;
        }
        C5868 c5868 = this.f74918;
        if (((AbstractC13567) c5868.mo5271()).size() > 0) {
            i3++;
        }
        C1481 c1481 = this.f74926;
        if (c1481.m5274() > 0) {
            i3++;
        }
        C11087 c11087 = this.f74952;
        if (((AbstractC13567) c11087.mo5271()).size() > 0) {
            i3++;
        }
        InterfaceC20872 interfaceC20872 = this.f74950;
        if (((AbstractC13567) interfaceC20872.mo16024()).size() > 0) {
            i3++;
        }
        C5365 c5365 = this.f74922;
        if (((AbstractC13567) c5365.mo16024()).size() > 0) {
            i3++;
        }
        InterfaceC21398 interfaceC21398 = this.f74953;
        if (((AbstractC13567) interfaceC21398.mo16024()).size() > 0) {
            i3++;
        }
        InterfaceC18414 interfaceC18414 = this.f74949;
        int size = ((AbstractC13567) interfaceC18414.mo16024()).size();
        C19647 c19648 = this.f74931;
        if (size <= 0) {
            c19647 = c19648;
            if (c19648.f63286 < 17) {
            }
            if (this.f74933 > 0) {
                i3++;
            }
            if (this.f74948 > 0) {
                i3++;
            }
            if (this.f74921 > 0) {
                i3++;
            }
            if (this.f74932 > 0) {
                i3++;
            }
            c15059 = this.f74945;
            if (((AbstractC13567) c15059.mo5271()).size() > 0) {
                i3++;
            }
            if (this.f74919 > 0) {
                i3++;
            }
            if (mo23718()) {
                i3++;
            }
            C10209.m26338(c10209, i3 + 1);
            m52022(c10209, 0, 1, 0);
            m52022(c10209, 1, ((AbstractC13567) interfaceC3718.mo5271()).size(), this.f74935);
            m52022(c10209, 2, ((AbstractC13567) c14816.mo5271()).size(), this.f74927);
            m52022(c10209, 3, ((AbstractC13567) c17054.mo5271()).size(), this.f74925);
            m52022(c10209, 4, ((AbstractC13567) c9092.mo5271()).size(), this.f74928);
            m52022(c10209, 5, ((AbstractC13567) c5868.mo5271()).size(), this.f74930);
            m52022(c10209, 6, ((AbstractC13567) c15059.mo5271()).size(), this.f74959);
            m52022(c10209, 7, c1481.m5274(), this.f74920);
            m52022(c10209, 8, ((AbstractC13567) c11087.mo5271()).size(), this.f74947);
            m52022(c10209, o.a.r, ((AbstractC13567) interfaceC3718.mo5271()).size(), this.f74954);
            m52022(c10209, o.a.a, ((AbstractC13567) interfaceC20872.mo16024()).size(), this.f74943);
            m52022(c10209, o.a.u, ((AbstractC13567) c5365.mo16024()).size(), this.f74951);
            m52022(c10209, o.a.t, ((AbstractC13567) interfaceC21398.mo16024()).size(), this.f74934);
            int size2 = ((AbstractC13567) interfaceC18414.mo16024()).size();
            if (c19647.f63286 < 17) {
                i = 1;
            } else {
                i = 0;
            }
            m52022(c10209, o.a.c, size2 + i, this.f74942);
            m52022(c10209, o.a.b, this.f74933, this.f74955);
            m52022(c10209, 8198, this.f74948, this.f74924);
            m52022(c10209, o.a.s, this.f74921, this.f74957);
            m52022(c10209, o.a.q, this.f74932, this.f74946);
            m52022(c10209, 8192, this.f74919, this.f74936);
            if (mo23718()) {
                i2 = 1;
                m52022(c10209, 61440, 1, this.f74923);
            } else {
                i2 = 1;
            }
            m52022(c10209, 4096, i2, this.f74941);
        }
        c19647 = c19648;
        i3++;
        if (this.f74933 > 0) {
            i3++;
        }
        if (this.f74948 > 0) {
            i3++;
        }
        if (this.f74921 > 0) {
            i3++;
        }
        if (this.f74932 > 0) {
            i3++;
        }
        c15059 = this.f74945;
        if (((AbstractC13567) c15059.mo5271()).size() > 0) {
            i3++;
        }
        if (this.f74919 > 0) {
            i3++;
        }
        if (mo23718()) {
            i3++;
        }
        C10209.m26338(c10209, i3 + 1);
        m52022(c10209, 0, 1, 0);
        m52022(c10209, 1, ((AbstractC13567) interfaceC3718.mo5271()).size(), this.f74935);
        m52022(c10209, 2, ((AbstractC13567) c14816.mo5271()).size(), this.f74927);
        m52022(c10209, 3, ((AbstractC13567) c17054.mo5271()).size(), this.f74925);
        m52022(c10209, 4, ((AbstractC13567) c9092.mo5271()).size(), this.f74928);
        m52022(c10209, 5, ((AbstractC13567) c5868.mo5271()).size(), this.f74930);
        m52022(c10209, 6, ((AbstractC13567) c15059.mo5271()).size(), this.f74959);
        m52022(c10209, 7, c1481.m5274(), this.f74920);
        m52022(c10209, 8, ((AbstractC13567) c11087.mo5271()).size(), this.f74947);
        m52022(c10209, o.a.r, ((AbstractC13567) interfaceC3718.mo5271()).size(), this.f74954);
        m52022(c10209, o.a.a, ((AbstractC13567) interfaceC20872.mo16024()).size(), this.f74943);
        m52022(c10209, o.a.u, ((AbstractC13567) c5365.mo16024()).size(), this.f74951);
        m52022(c10209, o.a.t, ((AbstractC13567) interfaceC21398.mo16024()).size(), this.f74934);
        int size3 = ((AbstractC13567) interfaceC18414.mo16024()).size();
        if (c19647.f63286 < 17) {
            i = 1;
        } else {
            i = 0;
        }
        m52022(c10209, o.a.c, size3 + i, this.f74942);
        m52022(c10209, o.a.b, this.f74933, this.f74955);
        m52022(c10209, 8198, this.f74948, this.f74924);
        m52022(c10209, o.a.s, this.f74921, this.f74957);
        m52022(c10209, o.a.q, this.f74932, this.f74946);
        m52022(c10209, 8192, this.f74919, this.f74936);
        if (mo23718()) {
            i2 = 1;
            m52022(c10209, 61440, 1, this.f74923);
        } else {
            i2 = 1;
        }
        m52022(c10209, 4096, i2, this.f74941);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52022(C10209 c10209, int i, int i2, int i3) throws IOException {
        if (i2 > 0) {
            c10209.m26348(i);
            c10209.m26348(0);
            C10209.m26338(c10209, i2);
            C10209.m26338(c10209, i3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52021(C10209 c10209, int i, int i2) throws IOException {
        byte[] bArrM15174 = C4968.m15174(this.f74931.f63286);
        c10209.write(bArrM15174, 0, bArrM15174.length);
        C10209.m26338(c10209, 0);
        c10209.write(new byte[20], 0, 20);
        C10209.m26338(c10209, i2);
        C10209.m26338(c10209, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        C10209.m26338(c10209, 305419896);
        C10209.m26338(c10209, 0);
        C10209.m26338(c10209, 0);
        C10209.m26338(c10209, this.f74941);
        m52038(c10209, ((AbstractC13567) this.f74956.mo5271()).size(), this.f74935);
        m52038(c10209, ((AbstractC13567) this.f74939.mo5271()).size(), this.f74927);
        m52038(c10209, ((AbstractC13567) this.f74940.mo5271()).size(), this.f74925);
        m52038(c10209, ((AbstractC13567) this.f74937.mo5271()).size(), this.f74928);
        m52038(c10209, ((AbstractC13567) this.f74918.mo5271()).size(), this.f74930);
        m52038(c10209, ((AbstractC13567) this.f74945.mo5271()).size(), this.f74959);
        C10209.m26338(c10209, i2 - i);
        C10209.m26338(c10209, i);
    }
}
