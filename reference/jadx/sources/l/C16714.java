package l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ܽܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG2 */
/* JADX INFO: loaded from: classes5.dex */
public class C16714 extends AbstractC12233 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f53507 = 0;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f53508;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f53509;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Boolean f53510;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile Boolean f53511;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C12481 f53512;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Boolean f53513;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18062 f53514;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Boolean f53515;

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo10259() {
        return false;
    }

    public C16714(int i, AbstractC12068 abstractC12068) {
        super(i, abstractC12068);
        this.f53509 = true;
        this.f53514 = new C18062(new C10364(this), mo24615());
        this.f53512 = C12481.m30982(i, abstractC12068);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۙ */
    public final void mo10266(AbstractC12068 abstractC12068) {
        super.mo10266(abstractC12068);
        C12481 c12481M30982 = C12481.m30982(this.f40872, abstractC12068);
        if (this.f53512.equals(c12481M30982)) {
            return;
        }
        C17648.m41121(this.f53512);
        this.f53512 = c12481M30982;
        this.f53514.m42059();
    }

    public C16714(int i, AbstractC12068 abstractC12068, C17367 c17367) {
        this(i, abstractC12068);
        this.f53510 = c17367.m40456();
        this.f53513 = c17367.m40456();
        this.f53515 = c17367.m40456();
        this.f53511 = c17367.m40456();
        this.f53509 = c17367.m40461();
        Boolean bool = this.f53510;
        if (bool != null) {
            this.f53514.m42061(bool.booleanValue());
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ܰ */
    public final void mo10274(C11018 c11018) {
        c11018.m27781(this.f53510);
        c11018.m27781(this.f53513);
        c11018.m27781(this.f53515);
        c11018.m27781(this.f53511);
        c11018.m27784(this.f53509);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ᩳ */
    public final String mo10276() {
        return this.f53512.f41609;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ᩸ */
    public final String mo10279() {
        return this.f53512.f41609;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo10277() {
        return this.f53515 != Boolean.FALSE;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ܰ */
    public final void mo30346(final int i, final String str) throws Throwable {
        m39197(new InterfaceC0485() { // from class: l.ᩳܶ֨
            @Override // l.InterfaceC0485
            /* JADX INFO: renamed from: ۙ */
            public final void mo2360(InterfaceC17419 interfaceC17419) {
                C16714.m39199(this.f57947, str, i, interfaceC17419);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39199(C16714 c16714, String str, int i, InterfaceC17419 interfaceC17419) {
        if (!interfaceC17419.mo17116(C6730.m18172(str))) {
            interfaceC17419.mo17113();
            throw null;
        }
        if (interfaceC17419.m40592("CHMOD " + Integer.toOctalString(i) + " " + C6730.m18175(str))) {
            return;
        }
        if (interfaceC17419.m40609() == 550) {
            c16714.f53515 = Boolean.FALSE;
        }
        interfaceC17419.mo17113();
        throw null;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo10271() {
        return this.f53509;
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        f53508 = simpleDateFormat;
        simpleDateFormat.setTimeZone(C12557.getTimeZone("GMT"));
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۨ */
    public final void mo30344(final long j, final String str) throws Throwable {
        m39197(new InterfaceC0485() { // from class: l.᩵ܶ֨
            @Override // l.InterfaceC0485
            /* JADX INFO: renamed from: ۙ */
            public final void mo2360(InterfaceC17419 interfaceC17419) {
                C16714.m39196(j, str, interfaceC17419);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39196(long j, String str, InterfaceC17419 interfaceC17419) {
        String str2;
        SimpleDateFormat simpleDateFormat = f53508;
        synchronized (simpleDateFormat) {
            str2 = simpleDateFormat.format(Long.valueOf(j));
        }
        if (interfaceC17419.mo17116(C6730.m18172(str)) && interfaceC17419.m40601(C6730.m18175(str), str2)) {
            return;
        }
        interfaceC17419.mo17113();
        throw null;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ᩷ */
    public final String mo10278() {
        return (String) m39192(new InterfaceC20242() { // from class: l.᩺ܶ֨
            @Override // l.InterfaceC20242
            /* JADX INFO: renamed from: ۙ */
            public final Object mo21637(InterfaceC17419 interfaceC17419) {
                return C16714.m39193(this.f74935, interfaceC17419);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m39193(C16714 c16714, InterfaceC17419 interfaceC17419) {
        String str = c16714.f53512.f41604;
        if (!TextUtils.isEmpty(str) && interfaceC17419.mo17116(str)) {
            return interfaceC17419.getPath();
        }
        return interfaceC17419.mo17114();
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ܺ */
    public final void mo10275() {
        C4716.f16635.execute(new RunnableC20519(1, this));
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo10267(boolean z) {
        this.f53514.m42059();
        if (z) {
            C17648.m41121(this.f53512);
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo19632() {
        if (this.f53511 == null) {
            synchronized (this) {
                if (this.f53511 == null) {
                    this.f53511 = (Boolean) m39192(new C8247());
                }
            }
        }
        return this.f53511.booleanValue();
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo10262(long j, String str) {
        return m39191(j, str, true);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ܰ */
    public final OutputStream mo10273(long j, String str) {
        return m39190(str, true);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۨ */
    public final void mo10270(final String str, final boolean z) throws Throwable {
        m39197(new InterfaceC0485() { // from class: l.ۘܶ֨
            @Override // l.InterfaceC0485
            /* JADX INFO: renamed from: ۙ */
            public final void mo2360(InterfaceC17419 interfaceC17419) {
                int i = C16714.f53507;
                String str2 = str;
                if (!interfaceC17419.mo17116(C6730.m18172(str2))) {
                    interfaceC17419.mo17113();
                    throw null;
                }
                if (z) {
                    if (interfaceC17419.m40600(C6730.m18175(str2))) {
                        return;
                    }
                    interfaceC17419.mo17113();
                    throw null;
                }
                if (interfaceC17419.m40594(C6730.m18175(str2))) {
                    return;
                }
                interfaceC17419.mo17113();
                throw null;
            }
        });
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo30347(final String str, final String str2) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (!str2.startsWith("/")) {
            str2 = "/".concat(str2);
        }
        return ((Boolean) m39192(new InterfaceC20242() { // from class: l.᩸ܶ֨
            @Override // l.InterfaceC20242
            /* JADX INFO: renamed from: ۙ */
            public final Object mo21637(InterfaceC17419 interfaceC17419) {
                int i = C16714.f53507;
                return Boolean.valueOf(interfaceC17419.m40595(str, str2));
            }
        })).booleanValue();
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۙ */
    public final void mo10265(final String str, final String str2) throws Throwable {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (!str2.startsWith("/")) {
            str2 = "/".concat(str2);
        }
        m39197(new InterfaceC0485() { // from class: l.ܶܶ֨
            @Override // l.InterfaceC0485
            /* JADX INFO: renamed from: ۙ */
            public final void mo2360(InterfaceC17419 interfaceC17419) {
                int i = C16714.f53507;
                if (interfaceC17419.m40595(str, str2)) {
                    return;
                }
                interfaceC17419.mo17113();
                throw null;
            }
        });
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۚ */
    public final void mo10268(final String str) throws Throwable {
        m39197(new InterfaceC0485() { // from class: l.ۡܶ֨
            @Override // l.InterfaceC0485
            /* JADX INFO: renamed from: ۙ */
            public final void mo2360(InterfaceC17419 interfaceC17419) {
                int i = C16714.f53507;
                String str2 = str;
                if (interfaceC17419.mo17116(C6730.m18172(str2)) && interfaceC17419.m40596(C6730.m18175(str2))) {
                    return;
                }
                interfaceC17419.mo17113();
                throw null;
            }
        });
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo10272(String str) {
        return this.f53514.m42062(str);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo10261(String str) {
        C18062 c18062 = this.f53514;
        c18062.getClass();
        return c18062.m42058(C6730.m18172(str), C6730.m18175(str)) != null;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ֨ */
    public final String mo10260(String str) {
        return this.f53514.m42063(str);
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2557 mo10264(String str) {
        String strM18172 = C6730.m18172(str);
        C11086 c11086 = (C11086) this.f53514.m42058(strM18172, C6730.m18175(str));
        if (c11086 != null) {
            return new C6359(c11086, strM18172);
        }
        return null;
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo10263(String str, boolean z) {
        String strM28608 = AbstractC11462.m28608(str);
        Collection<C11086> collectionValues = this.f53514.m42057(strM28608).values();
        ArrayList arrayList = new ArrayList(collectionValues.size() + 1);
        for (C11086 c11086 : collectionValues) {
            if (z || !c11086.m27956().startsWith(".")) {
                arrayList.add(new C6359(c11086, strM28608));
            }
        }
        return arrayList;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۜ */
    public final void mo10269(String str) {
        this.f53514.m42060(str);
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo24615() {
        return this.f53510 == Boolean.TRUE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39200(InterfaceC17419 interfaceC17419, C11086[] c11086Arr, String str) {
        String lowerCase;
        HashSet hashSet = new HashSet();
        for (C11086 c11086 : c11086Arr) {
            hashSet.add(c11086.m27956());
        }
        for (C11086 c11087 : c11086Arr) {
            if (c11087.m27955()) {
                String strM27956 = c11087.m27956();
                char cCharAt = strM27956.charAt(0);
                if ('a' <= cCharAt && cCharAt <= 'z') {
                    lowerCase = strM27956.toUpperCase();
                } else if ('A' <= cCharAt && cCharAt <= 'Z') {
                    lowerCase = strM27956.toLowerCase();
                }
                if (!hashSet.contains(lowerCase)) {
                    if (interfaceC17419.mo17116(str)) {
                        int iM40615 = interfaceC17419.m40615(lowerCase);
                        if (iM40615 == 213) {
                            this.f53510 = Boolean.TRUE;
                        } else if (iM40615 == 550 || iM40615 == 502) {
                            this.f53510 = Boolean.FALSE;
                        }
                        Boolean bool = this.f53510;
                        if (bool != null) {
                            this.f53514.m42061(bool.booleanValue());
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m39194(final C16714 c16714, String str) {
        final String strM28608 = AbstractC11462.m28608(str);
        return (List) c16714.m39192(new InterfaceC20242() { // from class: l.ᩴܶ֨
            @Override // l.InterfaceC20242
            /* JADX INFO: renamed from: ۙ */
            public final Object mo21637(InterfaceC17419 interfaceC17419) {
                return C16714.m39195(this.f61018, strM28608, interfaceC17419);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m39195(C16714 c16714, String str, InterfaceC17419 interfaceC17419) {
        C11086[] c11086ArrM40604;
        boolean z;
        String strM27959;
        String absolutePath;
        if (c16714.f53513 == null) {
            c16714.f53513 = Boolean.valueOf(interfaceC17419.m40602(EnumC17435.MLST));
            c16714.f53509 = interfaceC17419.m40602(EnumC17435.MFMT);
        }
        if (!interfaceC17419.mo17116(str)) {
            interfaceC17419.mo17113();
            throw null;
        }
        if (c16714.f53513.booleanValue()) {
            c11086ArrM40604 = interfaceC17419.m40606();
            for (int i = 0; i < c11086ArrM40604.length; i++) {
                if (c11086ArrM40604[i].m27943().toLowerCase(Locale.ENGLISH).contains("type=cdir;")) {
                    C11086[] c11086Arr = new C11086[c11086ArrM40604.length - 1];
                    System.arraycopy(c11086ArrM40604, 0, c11086Arr, 0, i);
                    System.arraycopy(c11086ArrM40604, i + 1, c11086Arr, i, (c11086ArrM40604.length - i) - 1);
                    c11086ArrM40604 = c11086Arr;
                    break;
                }
            }
            if (c16714.f53515 == null && c11086ArrM40604.length > 0) {
                for (C11086 c11086 : c11086ArrM40604) {
                    if (c11086.m27956().indexOf(61) == -1) {
                        String strM27943 = c11086.m27943();
                        c16714.f53515 = Boolean.valueOf(strM27943.contains("UNIX.mode=") || strM27943.contains("perm="));
                        break;
                    }
                }
            }
        } else {
            c11086ArrM40604 = interfaceC17419.m40604();
            ArrayList arrayList = new ArrayList();
            for (final C11086 c11087 : c11086ArrM40604) {
                if (c11087.m27962() && (strM27959 = c11087.m27959()) != null) {
                    if (strM27959.indexOf(47) != -1) {
                        if (strM27959.startsWith("/")) {
                            absolutePath = new File(strM27959).getAbsolutePath();
                        } else {
                            absolutePath = new File(str, strM27959).getAbsolutePath();
                        }
                        strM27959 = str.equals(C6730.m18172(absolutePath)) ? C6730.m18175(absolutePath) : null;
                    }
                    if (strM27959 != null) {
                        for (final C11086 c11088 : c11086ArrM40604) {
                            if (c11088.m27956().equals(strM27959)) {
                                arrayList.add(new BooleanSupplier() { // from class: l.ۜܶ֨
                                    @Override // java.util.function.BooleanSupplier
                                    public final boolean getAsBoolean() {
                                        int i2 = C16714.f53507;
                                        C11086 c11089 = c11087;
                                        int iM27942 = c11089.m27942();
                                        C11086 c110810 = c11088;
                                        if (iM27942 == c110810.m27942()) {
                                            return false;
                                        }
                                        c11089.m27947(c110810.m27942());
                                        return true;
                                    }
                                });
                                break;
                            }
                        }
                    }
                }
            }
            do {
                Iterator it = arrayList.iterator();
                z = false;
                while (it.hasNext()) {
                    if (((BooleanSupplier) it.next()).getAsBoolean()) {
                        z = true;
                    }
                }
            } while (z);
        }
        if (c16714.f53510 == null && c11086ArrM40604.length > 0) {
            try {
                c16714.m39200(interfaceC17419, c11086ArrM40604, str);
            } catch (IOException unused) {
            }
        }
        return Arrays.asList(c11086ArrM40604);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private OutputStream m39190(String str, boolean z) throws Throwable {
        InterfaceC17419 interfaceC17419M41119 = C17648.m41119(this.f53512);
        try {
            if (!interfaceC17419M41119.mo17116(C6730.m18172(str))) {
                interfaceC17419M41119.mo17113();
                throw null;
            }
            OutputStream outputStreamMo27914 = interfaceC17419M41119.mo27914(C6730.m18175(str));
            if (outputStreamMo27914 == null) {
                interfaceC17419M41119.mo17113();
                throw null;
            }
            return new C16009(this, outputStreamMo27914, interfaceC17419M41119, outputStreamMo27914);
        } catch (IOException e) {
            if (!z || !m39201(e)) {
                C17648.m41122(interfaceC17419M41119);
                throw e;
            }
            C17648.m41120(interfaceC17419M41119);
            return m39190(str, false);
        } catch (Error e2) {
            e = e2;
            C17648.m41122(interfaceC17419M41119);
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            C17648.m41122(interfaceC17419M41119);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InputStream m39191(long j, String str, boolean z) throws Throwable {
        InterfaceC17419 interfaceC17419M41119 = C17648.m41119(this.f53512);
        try {
            if (!interfaceC17419M41119.mo17116(C6730.m18172(str))) {
                interfaceC17419M41119.mo17113();
                throw null;
            }
            interfaceC17419M41119.m40599(j);
            C10568 c10568M40603 = interfaceC17419M41119.m40603(C6730.m18175(str));
            if (c10568M40603 == null) {
                interfaceC17419M41119.mo17113();
                throw null;
            }
            return new C20947(this, c10568M40603, interfaceC17419M41119);
        } catch (IOException e) {
            interfaceC17419M41119.m40599(0L);
            if (!z || !m39201(e)) {
                C17648.m41122(interfaceC17419M41119);
                throw e;
            }
            C17648.m41120(interfaceC17419M41119);
            return m39191(j, str, false);
        } catch (Error e2) {
            e = e2;
            interfaceC17419M41119.m40599(0L);
            C17648.m41122(interfaceC17419M41119);
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            interfaceC17419M41119.m40599(0L);
            C17648.m41122(interfaceC17419M41119);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0032  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m39192(InterfaceC20242 interfaceC20242) throws Throwable {
        InterfaceC17419 interfaceC17419M41119 = C17648.m41119(this.f53512);
        try {
            try {
                Object objMo21637 = interfaceC20242.mo21637(interfaceC17419M41119);
                if (interfaceC17419M41119 != null) {
                    C17648.m41122(interfaceC17419M41119);
                }
                return objMo21637;
            } catch (IOException e) {
                if (m39201(e)) {
                    C17648.m41120(interfaceC17419M41119);
                    try {
                        InterfaceC17419 interfaceC17419M411110 = C17648.m41119(this.f53512);
                        Object objMo21638 = interfaceC20242.mo21637(interfaceC17419M411110);
                        if (interfaceC17419M411110 != null) {
                            C17648.m41122(interfaceC17419M411110);
                        }
                        return objMo21638;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC17419M41119 = null;
                        if (interfaceC17419M41119 != null) {
                            C17648.m41122(interfaceC17419M41119);
                        }
                        throw th;
                    }
                }
                throw e;
            }
        } catch (Throwable th2) {
            th = th2;
            if (interfaceC17419M41119 != null) {
                C17648.m41122(interfaceC17419M41119);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0030  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39197(InterfaceC0485 interfaceC0485) throws Throwable {
        InterfaceC17419 interfaceC17419M41119 = C17648.m41119(this.f53512);
        try {
            try {
                interfaceC0485.mo2360(interfaceC17419M41119);
                if (interfaceC17419M41119 != null) {
                    C17648.m41122(interfaceC17419M41119);
                }
            } catch (IOException e) {
                if (m39201(e)) {
                    C17648.m41120(interfaceC17419M41119);
                    try {
                        InterfaceC17419 interfaceC17419M411110 = C17648.m41119(this.f53512);
                        interfaceC0485.mo2360(interfaceC17419M411110);
                        if (interfaceC17419M411110 != null) {
                            C17648.m41122(interfaceC17419M411110);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC17419M41119 = null;
                        if (interfaceC17419M41119 != null) {
                            C17648.m41122(interfaceC17419M41119);
                        }
                        throw th;
                    }
                }
                throw e;
            }
        } catch (Throwable th2) {
            th = th2;
            if (interfaceC17419M41119 != null) {
                C17648.m41122(interfaceC17419M41119);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39201(IOException iOException) {
        if (iOException instanceof C6146) {
            return true;
        }
        String message = iOException.getMessage();
        if (message == null) {
            return false;
        }
        String lowerCase = message.toLowerCase(Locale.ENGLISH);
        return (lowerCase.contains("connection") && (lowerCase.contains("closed") || lowerCase.contains("reset"))) || lowerCase.contains("broken pipe") || lowerCase.contains("connection abort");
    }
}
