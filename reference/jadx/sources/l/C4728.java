package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ۙۜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7EX */
/* JADX INFO: loaded from: classes3.dex */
public final class C4728 extends AbstractC3236 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f16652;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f16653;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized int m14631() {
        C18941 c18941;
        if (this.f16653.isEmpty()) {
            return 0;
        }
        ArrayList<Map.Entry> arrayList = new ArrayList(this.f16653.entrySet());
        C12884.sort(arrayList, C24819.comparingByKey());
        InterfaceC13676 interfaceC13676Mo15107 = this.f10544.mo15107();
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : arrayList) {
            long jLongValue = ((Long) entry.getKey()).longValue();
            if (jLongValue == 2147483647L || this.f16652.isEmpty()) {
                c18941 = null;
            } else {
                long j = jLongValue >> 32;
                c18941 = new C18941(Long.valueOf(j), Long.valueOf(m14629(j, jLongValue)));
            }
            for (C23374 c23374 : (Set) entry.getValue()) {
                c23374.getClass();
                EnumC19644 enumC19644 = EnumC19644.WARNING;
                if (c23374.m52540() == EnumC19644.ERROR) {
                    interfaceC13676Mo15107 = this.f10544.mo15109();
                    i2++;
                }
                i += c23374.m52540() == enumC19644 ? 1 : 0;
                if (jLongValue == 2147483647L) {
                    interfaceC13676Mo15107.mo3881(c23374.m52541());
                } else {
                    interfaceC13676Mo15107.mo3881(String.format("%s (%d:%d) %s", m10585(), c18941.f61428, c18941.f61429, c23374.m52541()));
                    m14627(interfaceC13676Mo15107, c18941);
                }
            }
        }
        AbstractC22078 abstractC22078 = this.f10544;
        if (i != 0) {
            abstractC22078.mo15110(String.format("%d warning(s)%s", Integer.valueOf(i), i2 != 0 ? ", " : "\n"));
        }
        if (i2 != 0) {
            abstractC22078.mo15108(String.format("%d error(s)", Integer.valueOf(i2)));
        }
        synchronized (interfaceC13676Mo15107) {
            interfaceC13676Mo15107.flush();
            abstractC22078.flush();
            this.f16653.clear();
        }
        return i2;
    }

    public C4728(C10889 c10889) {
        super("jasm", c10889);
        this.f16653 = new HashMap();
        this.f16652 = new ArrayList();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m14632(long j, String str, Object... objArr) {
        EnumC19644 enumC19644 = EnumC19644.WARNING;
        String strM10580 = AbstractC3236.m10580(str, objArr);
        m14628(j, strM10580 == null ? new C23374(EnumC19644.ERROR, null) : new C23374(enumC19644, strM10580));
    }

    @Override // l.AbstractC3236, l.InterfaceC1745
    /* JADX INFO: renamed from: ۙ */
    public final void mo4159(long j, String str, Object... objArr) {
        EnumC19644 enumC19644 = EnumC19644.ERROR;
        String strM10580 = AbstractC3236.m10580(str, objArr);
        m14628(j, strM10580 == null ? new C23374(enumC19644, null) : new C23374(enumC19644, strM10580));
    }

    @Override // l.AbstractC3236
    /* JADX INFO: renamed from: ᩷ */
    public final String mo10586(String str, Object... objArr) {
        return AbstractC3236.m10580(str, objArr);
    }

    @Override // l.AbstractC3236
    /* JADX INFO: renamed from: ۙ */
    public final void mo10584(InterfaceC18152 interfaceC18152) {
        super.mo10584(interfaceC18152);
        ArrayList arrayList = this.f16652;
        arrayList.clear();
        arrayList.addAll(interfaceC18152.mo30462());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m14629(long j, long j2) {
        return (j2 & 4294967295L) - ((((long) C1170.stream(this.f16652.subList(0, ((int) j) - 1)).mapToInt(new C3919()).sum()) + j) - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m14630(EnumC19644 enumC19644) {
        HashMap map = this.f16653;
        if (map.isEmpty()) {
            return 0L;
        }
        return C1170.stream(map.values()).flatMap(new C18061(8)).filter(new C4221(1, enumC19644)).count();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m14633() {
        return this.f16653.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14627(InterfaceC13676 interfaceC13676, C18941 c18941) {
        int iLongValue = (int) (((Long) c18941.f61428).longValue() - 1);
        long jLongValue = ((Long) c18941.f61428).longValue();
        ArrayList arrayList = this.f16652;
        boolean z = jLongValue > ((long) arrayList.size());
        String str = (String) arrayList.get(Math.min(arrayList.size() - 1, iLongValue));
        long j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '\t') {
                j++;
            }
        }
        String str2 = InterfaceC1745.f5953;
        String strReplace = str.replace("\t", str2);
        long length = z ? strReplace.length() : ((((long) str2.length()) * j) + ((Long) c18941.f61429).longValue()) - j;
        interfaceC13676.mo3881(strReplace);
        StringBuilder sb = new StringBuilder();
        int i2 = (int) length;
        sb.append(i2 <= 0 ? "" : new String(new char[i2]).replace(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, " "));
        sb.append("^");
        interfaceC13676.mo3881(sb.toString());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m14628(long j, C23374 c23374) {
        String strM37949;
        if (j != 2147483647L && this.f16652.isEmpty()) {
            EnumC19644 enumC19644 = EnumC19644.ERROR;
            m14626(2147483647L, new C23374(enumC19644, EnumC15914.LONG.m37950(enumC19644, m10581(), "Content of the file %s not found", m10585())));
            j = 2147483647L;
        }
        EnumC19644 enumC19644M52540 = c23374.m52540();
        if (j == 2147483647L) {
            strM37949 = EnumC15914.VERBOSE.m37949(m10581(), c23374);
        } else {
            strM37949 = EnumC15914.LONG.m37949(m10581(), c23374);
        }
        m14626(j, new C23374(enumC19644M52540, strM37949));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14626(long j, C23374 c23374) {
        Long lValueOf = Long.valueOf(j);
        HashMap map = this.f16653;
        Set set = (Set) map.get(lValueOf);
        if (set != null) {
            set.add(c23374);
            return;
        }
        HashSet hashSet = new HashSet(1);
        hashSet.add(c23374);
        map.put(Long.valueOf(j), hashSet);
    }
}
