package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ۡ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7EX */
/* JADX INFO: loaded from: classes4.dex */
public final class C8878 extends AbstractC9584 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f30432;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f30433;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized int m23028() {
        C13111 c13111;
        if (this.f30432.isEmpty()) {
            return 0;
        }
        ArrayList<Map.Entry> arrayList = new ArrayList(this.f30432.entrySet());
        C23846.sort(arrayList, C3383.comparingByKey());
        InterfaceC10434 interfaceC10434Mo20148 = this.f32305.mo20148();
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : arrayList) {
            long jLongValue = ((Long) entry.getKey()).longValue();
            if (jLongValue == 2147483647L || this.f30433.isEmpty()) {
                c13111 = null;
            } else {
                long j = jLongValue >> 32;
                c13111 = new C13111(Long.valueOf(j), Long.valueOf(m23025(j, jLongValue)));
            }
            for (C1821 c1821 : (Set) entry.getValue()) {
                c1821.getClass();
                EnumC15934 enumC15934 = EnumC15934.WARNING;
                if (c1821.m5923() == EnumC15934.ERROR) {
                    interfaceC10434Mo20148 = this.f32305.mo20149();
                    i2++;
                }
                i += c1821.m5923() == enumC15934 ? 1 : 0;
                if (jLongValue == 2147483647L) {
                    interfaceC10434Mo20148.mo18527(c1821.m5922());
                } else {
                    interfaceC10434Mo20148.mo18527(String.format("%s (%d:%d) %s", m24459(), c13111.f43679, c13111.f43680, c1821.m5922()));
                    m23022(interfaceC10434Mo20148, c13111);
                }
            }
        }
        AbstractC21016 abstractC21016 = this.f32305;
        if (i != 0) {
            abstractC21016.mo20145(String.format("%d warning(s)%s", Integer.valueOf(i), i2 != 0 ? ", " : "\n"));
        }
        if (i2 != 0) {
            abstractC21016.mo20147(String.format("%d error(s)", Integer.valueOf(i2)));
        }
        synchronized (interfaceC10434Mo20148) {
            interfaceC10434Mo20148.flush();
            abstractC21016.flush();
            this.f30432.clear();
        }
        return i2;
    }

    public C8878(C16078 c16078) {
        super("jasm", c16078);
        this.f30432 = new HashMap();
        this.f30433 = new ArrayList();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23030(long j, String str, Object... objArr) {
        EnumC15934 enumC15934 = EnumC15934.WARNING;
        String strM24455 = AbstractC9584.m24455(str, objArr);
        m23023(j, strM24455 == null ? new C1821(EnumC15934.ERROR, null) : new C1821(enumC15934, strM24455));
    }

    @Override // l.AbstractC9584, l.InterfaceC12406
    /* JADX INFO: renamed from: ۙ */
    public final void mo2149(long j, String str, Object... objArr) {
        EnumC15934 enumC15934 = EnumC15934.ERROR;
        String strM24455 = AbstractC9584.m24455(str, objArr);
        m23023(j, strM24455 == null ? new C1821(enumC15934, null) : new C1821(enumC15934, strM24455));
    }

    @Override // l.AbstractC9584
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String mo23029(String str, Object... objArr) {
        return AbstractC9584.m24455(str, objArr);
    }

    @Override // l.AbstractC9584
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23027(InterfaceC1260 interfaceC1260) {
        super.mo23027(interfaceC1260);
        ArrayList arrayList = this.f30433;
        arrayList.clear();
        arrayList.addAll(interfaceC1260.mo4570());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m23025(long j, long j2) {
        return (j2 & 4294967295L) - ((((long) C9030.stream(this.f30433.subList(0, ((int) j) - 1)).mapToInt(new C21115()).sum()) + j) - 1);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m23024() {
        return this.f30432.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m23026(EnumC15934 enumC15934) {
        HashMap map = this.f30432;
        if (map.isEmpty()) {
            return 0L;
        }
        return C9030.stream(map.values()).flatMap(new C12291(5)).filter(new C19789(1, enumC15934)).count();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23022(InterfaceC10434 interfaceC10434, C13111 c13111) {
        int iLongValue = (int) (((Long) c13111.f43679).longValue() - 1);
        long jLongValue = ((Long) c13111.f43679).longValue();
        ArrayList arrayList = this.f30433;
        boolean z = jLongValue > ((long) arrayList.size());
        String str = (String) arrayList.get(Math.min(arrayList.size() - 1, iLongValue));
        long j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '\t') {
                j++;
            }
        }
        String str2 = InterfaceC12406.f41439;
        String strReplace = str.replace("\t", str2);
        long length = z ? strReplace.length() : ((((long) str2.length()) * j) + ((Long) c13111.f43680).longValue()) - j;
        interfaceC10434.mo18527(strReplace);
        StringBuilder sb = new StringBuilder();
        int i2 = (int) length;
        sb.append(i2 <= 0 ? "" : new String(new char[i2]).replace(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, " "));
        sb.append("^");
        interfaceC10434.mo18527(sb.toString());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m23023(long j, C1821 c1821) {
        String strM34965;
        if (j != 2147483647L && this.f30433.isEmpty()) {
            EnumC15934 enumC15934 = EnumC15934.ERROR;
            m23021(2147483647L, new C1821(enumC15934, EnumC14523.LONG.m34966(enumC15934, m24456(), "Content of the file %s not found", m24459())));
            j = 2147483647L;
        }
        EnumC15934 enumC15934M5923 = c1821.m5923();
        if (j == 2147483647L) {
            strM34965 = EnumC14523.VERBOSE.m34965(m24456(), c1821);
        } else {
            strM34965 = EnumC14523.LONG.m34965(m24456(), c1821);
        }
        m23021(j, new C1821(enumC15934M5923, strM34965));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23021(long j, C1821 c1821) {
        Long lValueOf = Long.valueOf(j);
        HashMap map = this.f30432;
        Set set = (Set) map.get(lValueOf);
        if (set != null) {
            set.add(c1821);
            return;
        }
        HashSet hashSet = new HashSet(1);
        hashSet.add(c1821);
        map.put(Long.valueOf(j), hashSet);
    }
}
