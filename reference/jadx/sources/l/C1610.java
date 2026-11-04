package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֫ۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36DM */
/* JADX INFO: loaded from: classes3.dex */
public final class C1610 extends AbstractC16678 {

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f5531 = C16980.m40037(C1610.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f5532;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C7311 f5533;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C4811 f5534;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f5535;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f5536;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final HashMap f5537;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C6990 f5538;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C23977 f5539;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f5540;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f5541;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final HashMap f5542;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final C3101 f5543;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6129 f5544;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C21681 f5545;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C10132 f5546;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C1323 f5547;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C12326 f5548;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m5661(C1610 c1610, Map.Entry entry) {
        c1610.getClass();
        C1345 c1345 = (C1345) entry.getKey();
        List list = (List) entry.getValue();
        C24927 c24927M55205 = C24731.m55205(list);
        c1610.f5537.put(c1345, c24927M55205);
        c1610.f5541.put(c24927M55205.m55569(), c24927M55205);
        String strM55573 = c24927M55205.m55573();
        String str = (String) C1170.stream(list).map(new C10558(0)).sorted().collect(C2025.joining("\n  "));
        f5531.mo13703("Found duplicated class: {}, count: {}, sources:\n  {}\n Keep class with source: {}, others will be removed.", c1345, Integer.valueOf(list.size()), str, strM55573);
        c24927M55205.m31138("Classes with same name are omitted, all sources:\n  " + str + '\n');
    }

    public C1610(C0162 c0162) {
        C6129 c6129M1365 = c0162.m1365();
        this.f5539 = new C23977();
        this.f5534 = new C4811();
        new C3254();
        this.f5540 = new ArrayList();
        this.f5537 = new HashMap();
        this.f5541 = new HashMap();
        this.f5532 = new ArrayList();
        this.f5542 = new HashMap();
        this.f5536 = new ArrayList();
        this.f5544 = c6129M1365;
        int i = C10271.f32803;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C13401());
        arrayList.add(new C24065());
        arrayList.add(new C19091());
        arrayList.add(new C12152());
        arrayList.add(new C17876());
        arrayList.add(new C12876());
        arrayList.add(new C11384());
        this.f5535 = arrayList;
        this.f5547 = new C1323(C10271.m26477(c6129M1365));
        this.f5548 = new C12326(c6129M1365);
        this.f5533 = new C7311(c6129M1365);
        this.f5546 = new C10132(this);
        this.f5538 = new C6990(this);
        this.f5543 = new C3101(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5662(C1610 c1610, InterfaceC10161 interfaceC10161) {
        String strConcat;
        try {
            c1610.m5676(new C24927(c1610, interfaceC10161));
        } catch (Exception e) {
            InterfaceC25186 interfaceC25186 = f5531;
            try {
                String type = interfaceC10161.getType();
                try {
                    strConcat = C1345.m4955(c1610, AbstractC1566.m5538(type)).m4971();
                } catch (Exception e2) {
                    interfaceC25186.mo13718("Failed to get name for class with type {}", type, e2);
                    strConcat = null;
                }
                if (strConcat == null || strConcat.isEmpty()) {
                    strConcat = "CLASS_".concat(type);
                }
                C23977.m53506(C24927.m55524(c1610, strConcat, interfaceC10161.mo26275()), "Load error", e);
            } catch (Exception unused) {
                interfaceC25186.mo13718("Failed to load class from file: {}", interfaceC10161.mo26274(), e);
            }
        }
        C4123.m13227();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m5665() {
        String strM4957;
        int iLastIndexOf;
        int size = this.f5532.size();
        HashMap map = this.f5537;
        int i = 0;
        if (size != map.size()) {
            C1170.stream(((Map) C1170.stream(this.f5532).collect(C2025.groupingBy(new C21045(5)))).entrySet()).filter(new C4593(i)).forEach(new C21747(this, i));
        }
        ArrayList arrayList = new ArrayList(map.values());
        this.f5532 = arrayList;
        f5531.mo13712("Loaded classes: {}, methods: {}, instructions: {}", Integer.valueOf(this.f5532.size()), Integer.valueOf(C1170.stream(arrayList).mapToInt(new C13737(i)).sum()), Integer.valueOf(C1170.stream(this.f5532).flatMap(new C22493(i)).mapToInt(new C19509()).sum()));
        C12884.sort(this.f5532, C2661.comparing(new C15033(i)));
        boolean zM17707 = this.f5544.m17707();
        ArrayList arrayList2 = this.f5536;
        if (zM17707) {
            ArrayList<C24927> arrayList3 = new ArrayList();
            for (C24927 c24927 : this.f5532) {
                if (c24927.m55571().m4962()) {
                    arrayList3.add(c24927);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (C24927 c24928 : arrayList3) {
                C1345 c1345M55571 = c24928.m55571();
                C1345 c1345M4973 = c1345M55571.m4973();
                C24927 c24927M5671 = m5671(c1345M4973);
                if (c24927M5671 == null && c1345M4973 != null && (iLastIndexOf = (strM4957 = c1345M4973.m4957()).lastIndexOf(46)) > 0 && iLastIndexOf != strM4957.length() - 1) {
                    String strSubstring = strM4957.substring(iLastIndexOf + 1);
                    C24927 c24927M5672 = m5671(C1345.m4954(this, strM4957.substring(0, iLastIndexOf)));
                    if (c24927M5672 != null && c24927M5672.m55563(strSubstring) != null) {
                        c1345M55571.m4961(c24927M5672);
                        c24927M5671 = c24927M5672;
                    }
                }
                if (c24927M5671 == null) {
                    arrayList4.add(c24928);
                    c24928.m55565();
                } else {
                    c24927M5671.m55558(c24928);
                }
            }
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C24927) it.next()).m55534().iterator();
                while (it2.hasNext()) {
                    ((C24927) it2.next()).m55571().m4969(this);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C1170.removeIf((ArrayList) ((C8517) it3.next()).m22835(), new C5339(i));
            }
        }
        Collections.sort(arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5676(C24927 c24927) {
        this.f5532.add(c24927);
        this.f5537.put(c24927.m55571(), c24927);
        this.f5541.put(c24927.m55569(), c24927);
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final void m5666() {
        try {
            if (this.f5545 == null) {
                C21681 c21681 = new C21681(this);
                if (this.f5544.m17701()) {
                    c21681.m49228();
                }
                c21681.m49225(this.f5532);
                c21681.m49224();
                this.f5545 = c21681;
            }
        } catch (Exception e) {
            throw new C8597("Error loading jadx class set", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5673(HashMap map) {
        C6129 c6129 = this.f5544;
        EnumC15823 enumC15823M17700 = c6129.m17700();
        if (enumC15823M17700 == EnumC15823.FALLBACK || enumC15823M17700 == EnumC15823.SIMPLE) {
            return;
        }
        new C25007(this.f5535).m55841((List) map.get(InterfaceC12509.f40163), new C12796(0));
        new C25007(this.f5547.m4864()).m55841((List) map.get(InterfaceC3560.f12202), new C20299(5));
        ArrayList arrayListM17713 = c6129.m17713();
        if (arrayListM17713.isEmpty()) {
            return;
        }
        C3891 c3891 = new C3891(1, new HashSet(arrayListM17713));
        C1170.removeIf(this.f5535, c3891);
        C1170.removeIf((ArrayList) this.f5547.m4864(), c3891);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m5663(HashSet hashSet, InterfaceC13673 interfaceC13673) {
        if (!hashSet.contains(interfaceC13673.getName())) {
            return false;
        }
        f5531.mo13716(interfaceC13673.getName(), "Disable pass: {}");
        return true;
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final void m5693() {
        InterfaceC25186 interfaceC25186 = f5531;
        boolean zMo13707 = interfaceC25186.mo13707();
        for (InterfaceC13673 interfaceC13673 : this.f5535) {
            C4123.m13227();
            long jCurrentTimeMillis = zMo13707 ? System.currentTimeMillis() : 0L;
            try {
                interfaceC13673.mo8439(this);
            } catch (Exception e) {
                interfaceC25186.mo13718("Visitor init failed: {}", interfaceC13673.getClass().getSimpleName(), e);
            }
            for (C24927 c24927 : this.f5532) {
                if (!c24927.m55552()) {
                    C7005.m19327(interfaceC13673, c24927);
                }
            }
            if (zMo13707) {
                interfaceC25186.mo13701("Prepare pass: '{}' - {}ms", interfaceC13673, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m5690(C24927 c24927) {
        Iterator it = this.f5535.iterator();
        while (it.hasNext()) {
            C7005.m19327((InterfaceC13673) it.next(), c24927);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List m5680() {
        return this.f5532;
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final List m5677() {
        return this.f5532;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8517 m5669(String str) {
        return (C8517) this.f5542.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5674(C8517 c8517) {
        this.f5542.put(c8517.m22834().m27469(), c8517);
        this.f5536.add(c8517);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24927 m5671(C1345 c1345) {
        return (C24927) this.f5537.get(c1345);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24927 m5672(AbstractC1566 abstractC1566) {
        if (!abstractC1566.mo5564() || abstractC1566.m5569() || abstractC1566.mo5542() == EnumC12752.UNBOUND) {
            return null;
        }
        if (abstractC1566.mo5550()) {
            abstractC1566 = AbstractC1566.m5538(abstractC1566.mo5570());
        }
        return m5671(C1345.m4955(this, abstractC1566));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2551 m5667(String str, String str2) {
        C24927 c24927 = (C24927) this.f5541.get(str);
        if (c24927 == null) {
            throw new RuntimeException(C25272.m56409("Class not found: ", str));
        }
        C2551 c2551M55570 = c24927.m55570(str2);
        if (c2551M55570 != null) {
            return c2551M55570;
        }
        throw new RuntimeException(ExternalValue$$ExternalSyntheticOutline0.m("Method not found: ", str, ".", str2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2551 m5668(C21965 c21965) {
        C24927 c24927M5671 = m5671(c21965.m49700());
        if (c24927M5671 == null) {
            return null;
        }
        C2551 c2551M55535 = c24927M5671.m55535(c21965);
        return c2551M55535 != null ? c2551M55535 : m5659(c24927M5671, c21965.m49697(false, false));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C2551 m5659(C24927 c24927, String str) {
        C2551 c2551M5659;
        C24927 c24927M5672;
        C2551 c2551M56510;
        for (C2551 c2551 : c24927.getMethods()) {
            if (c2551.mo8532().m49701().startsWith(str)) {
                return c2551;
            }
        }
        AbstractC1566 abstractC1566M55553 = c24927.m55553();
        if (abstractC1566M55553 != null && (c24927M5672 = m5672(abstractC1566M55553)) != null && (c2551M56510 = m5659(c24927M5672, str)) != null) {
            return c2551M56510;
        }
        Iterator it = c24927.m55564().iterator();
        while (it.hasNext()) {
            C24927 c24927M5673 = m5672((AbstractC1566) it.next());
            if (c24927M5673 != null && (c2551M5659 = m5659(c24927M5673, str)) != null) {
                return c2551M5659;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17467 m5670(C14022 c14022) {
        C24927 c24927M5671 = m5671(c14022.m34148());
        if (c24927M5671 == null) {
            return null;
        }
        C17467 c17467M55538 = c24927M5671.m55538(c14022);
        return c17467M55538 != null ? c17467M55538 : m5660(c24927M5671, c14022);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17467 m5660(C24927 c24927, C14022 c14022) {
        C17467 c17467M5660;
        C24927 c24927M5672;
        C17467 c17467M5661;
        C17467 c17467M55575 = c24927.m55575(c14022);
        if (c17467M55575 != null) {
            return c17467M55575;
        }
        AbstractC1566 abstractC1566M55553 = c24927.m55553();
        if (abstractC1566M55553 != null && (c24927M5672 = m5672(abstractC1566M55553)) != null && (c17467M5661 = m5660(c24927M5672, c14022)) != null) {
            return c17467M5661;
        }
        Iterator it = c24927.m55564().iterator();
        while (it.hasNext()) {
            C24927 c24927M5673 = m5672((AbstractC1566) it.next());
            if (c24927M5673 != null && (c17467M5660 = m5660(c24927M5673, c14022)) != null) {
                return c17467M5660;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final C1323 m5694() {
        return this.f5547;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final void m5689() {
        this.f5547.m4865(this);
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final C10907 m5679() {
        C6129 c6129 = this.f5544;
        c6129.m17709().getClass();
        return new C10907(c6129);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5675(C12225 c12225) {
        this.f5540.add(c12225);
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C21681 m5691() {
        return this.f5545;
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final C23977 m5684() {
        return this.f5539;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final C12326 m5686() {
        return this.f5548;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C7311 m5688() {
        return this.f5533;
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C4811 m5678() {
        return this.f5534;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C6129 m5681() {
        return this.f5544;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final C10132 m5685() {
        return this.f5546;
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final C8706 m5687() {
        return this.f5546.m26142();
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C22842 m5682() {
        return this.f5544.m17698();
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final C6990 m5683() {
        return this.f5538;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final C3101 m5692() {
        return this.f5543;
    }
}
