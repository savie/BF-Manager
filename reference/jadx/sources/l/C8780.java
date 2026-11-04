package l;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠ܿۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6CC */
/* JADX INFO: loaded from: classes3.dex */
public final class C8780 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f28563;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1610 f28564;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C7289[] f28565;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f28561 = C16980.m40037(C8780.class);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final AbstractC1566[] f28562 = new AbstractC1566[0];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final AbstractC1566[] f28560 = {AbstractC1566.f5426};

    public C8780(C1610 c1610) {
        this.f28564 = c1610;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m23485() throws IOException {
        AbstractC1566[] abstractC1566Arr;
        long jCurrentTimeMillis = System.currentTimeMillis();
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(C6707.m18719().m18721()));
        try {
            byte[] bArr = new byte[8];
            if (dataInputStream.read(bArr) != 8 || !"jadx-cst".equals(new String(bArr, "US-ASCII"))) {
                throw new C19039("Wrong jadx class set header");
            }
            byte b = dataInputStream.readByte();
            if (b != 5) {
                throw new C19039("Wrong jadx class set version, got: " + ((int) b) + ", expect: 5");
            }
            this.f28563 = dataInputStream.readInt();
            int i = dataInputStream.readInt();
            this.f28565 = new C7289[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = dataInputStream.readInt();
                int i4 = dataInputStream.readByte() & 255;
                EnumC14000[] enumC14000ArrValues = EnumC14000.values();
                if (i4 < 0 || i4 > enumC14000ArrValues.length) {
                    throw new C19039("Wrong jadx source identifier: " + i4);
                }
                EnumC14000 enumC14000 = enumC14000ArrValues[i4];
                this.f28565[i2] = new C7289(i3, AbstractC1566.m5538(m23481(dataInputStream)));
            }
            for (int i5 = 0; i5 < i; i5++) {
                C7289 c7289 = this.f28565[i5];
                C1345 c1345M4955 = C1345.m4955(this.f28564, c7289.m19952());
                int i6 = dataInputStream.readByte();
                if (i6 == -2) {
                    abstractC1566Arr = f28560;
                } else if (i6 == -1) {
                    abstractC1566Arr = null;
                } else if (i6 == 0) {
                    abstractC1566Arr = f28562;
                } else {
                    abstractC1566Arr = new AbstractC1566[i6];
                    for (int i7 = 0; i7 < i6; i7++) {
                        abstractC1566Arr[i7] = m23479(dataInputStream);
                    }
                }
                c7289.m19955(abstractC1566Arr);
                c7289.m19954(m23482(dataInputStream));
                c7289.m19953(m23478(dataInputStream, c1345M4955));
            }
            dataInputStream.close();
            InterfaceC25186 interfaceC25186 = f28561;
            if (interfaceC25186.mo13707()) {
                interfaceC25186.mo13725("Clst file loaded in {}ms, android api: {}, classes: {}, methods: {}", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), Integer.valueOf(this.f28563), Integer.valueOf(this.f28565.length), Integer.valueOf(C23654.of((Object[]) this.f28565).mapToInt(new C9525()).sum()));
            }
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC1566[] m23480(C24927 c24927) {
        AbstractC1566 abstractC1566M55553 = c24927.m55553();
        if (abstractC1566M55553 == null) {
            return f28562;
        }
        int size = c24927.m55564().size();
        if (size == 0 && abstractC1566M55553 == AbstractC1566.f5426) {
            return f28560;
        }
        AbstractC1566[] abstractC1566Arr = new AbstractC1566[size + 1];
        abstractC1566Arr[0] = abstractC1566M55553;
        Iterator it = c24927.m55564().iterator();
        int i = 1;
        while (it.hasNext()) {
            abstractC1566Arr[i] = (AbstractC1566) it.next();
            i++;
        }
        return abstractC1566Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m23478(DataInputStream dataInputStream, C1345 c1345) throws IOException {
        short s = dataInputStream.readShort();
        ArrayList arrayList = new ArrayList(s);
        for (int i = 0; i < s; i++) {
            String strM23481 = m23481(dataInputStream);
            List listM23482 = m23482(dataInputStream);
            AbstractC1566 abstractC1566M23479 = m23479(dataInputStream);
            List listM23483 = m23482(dataInputStream);
            List list = (listM23483.isEmpty() || listM23483.equals(listM23482)) ? listM23482 : listM23483;
            AbstractC1566 abstractC1566M234710 = m23479(dataInputStream);
            AbstractC1566 abstractC1566 = C17359.equals(abstractC1566M234710, abstractC1566M23479) ? abstractC1566M23479 : abstractC1566M234710;
            arrayList.add(new C10492(C21965.m49691(this.f28564, c1345, strM23481, listM23482, abstractC1566M23479), list, abstractC1566, m23482(dataInputStream), m23482(dataInputStream), dataInputStream.readInt()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private List m23482(DataInputStream dataInputStream) throws IOException {
        byte b = dataInputStream.readByte();
        if (b == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(b);
        for (int i = 0; i < b; i++) {
            arrayList.add(m23479(dataInputStream));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC1566 m23479(DataInputStream dataInputStream) throws IOException {
        byte b = dataInputStream.readByte();
        if (b == -1) {
            return null;
        }
        switch (EnumC2814.values()[b].ordinal()) {
            case 0:
                EnumC12752 enumC12752M31587 = EnumC12752.m31587(dataInputStream.readByte());
                return enumC12752M31587 == EnumC12752.UNBOUND ? AbstractC1566.f5413 : AbstractC1566.m5531(m23479(dataInputStream), enumC12752M31587);
            case 1:
                return AbstractC1566.m5529(this.f28565[dataInputStream.readInt()].m19952(), m23482(dataInputStream));
            case 2:
                return AbstractC1566.m5539(m23481(dataInputStream), m23482(dataInputStream));
            case 3:
                return AbstractC1566.m5530(m23479(dataInputStream), m23479(dataInputStream));
            case 4:
                return this.f28565[dataInputStream.readInt()].m19952();
            case 5:
                AbstractC1566 abstractC1566M23479 = m23479(dataInputStream);
                C17359.requireNonNull(abstractC1566M23479);
                return AbstractC1566.m5528(abstractC1566M23479);
            case 6:
                return AbstractC1566.m5524((char) dataInputStream.readByte());
            default:
                throw new C8597(C13645.m33382(b, "Unsupported Arg Type: "));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m23481(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readByte() & 255;
        byte[] bArr = new byte[i];
        int i2 = dataInputStream.read(bArr);
        while (i2 != i) {
            int i3 = dataInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new IOException("String read error");
            }
            i2 += i3;
        }
        return new String(bArr, "US-ASCII");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23483() {
        return this.f28565.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23484(HashMap map) {
        for (C7289 c7289 : this.f28565) {
            map.put(c7289.m19956(), c7289);
        }
    }
}
