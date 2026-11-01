package l;

import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K7A5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6815 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Consumer f22977;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7221 f22978;

    public C6815() {
        this(new C7221(), new C5404(0));
    }

    public C6815(C7221 c7221, Consumer consumer) {
        this.f22978 = c7221;
        this.f22977 = consumer;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m18418() {
        return m18417();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private ArrayList m18417() throws Throwable {
        String strM39288;
        String str;
        C3992 c3992M11494;
        C2455 c2455;
        int i;
        ArrayList arrayList = new ArrayList();
        AbstractC20745 abstractC20745M19205 = this.f22978.m19205();
        if (!abstractC20745M19205.mo33974()) {
            return arrayList;
        }
        boolean z = true;
        for (AbstractC20745 abstractC20745 : abstractC20745M19205.mo33983(true)) {
            String name = abstractC20745.getName();
            if (abstractC20745.mo33974() && !abstractC20745.m46723() && !name.startsWith(".tmp-") && !name.equals("xref")) {
                String name2 = abstractC20745.getName();
                LinkedList linkedList = new LinkedList();
                linkedList.add(abstractC20745);
                long jMo33964 = 0;
                while (!linkedList.isEmpty()) {
                    for (AbstractC20745 abstractC20746 : ((AbstractC20745) linkedList.removeFirst()).mo33983(z)) {
                        if (abstractC20746.mo33974()) {
                            if (!abstractC20746.m46723()) {
                                linkedList.addLast(abstractC20746);
                            }
                        } else if (!abstractC20746.m46723()) {
                            jMo33964 = abstractC20746.mo33964() + jMo33964;
                        }
                    }
                }
                long jMo33991 = abstractC20745.mo33991();
                AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("metadata.json");
                if (!abstractC20745M46690.mo33971()) {
                    strM39288 = C16737.m39288(R.string.MT_Protector);
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(abstractC20745M46690.m46727(), StandardCharsets.UTF_8));
                        boolean z2 = jSONObject.getBoolean("temporary", false);
                        long j = jSONObject.getLong("createdAt", -1L);
                        long j2 = jSONObject.getLong("lastAccessedAt", -1L);
                        long j3 = j2 >= 0 ? j2 : j >= 0 ? j : jMo33991;
                        String strSubstring = null;
                        String string = jSONObject.getString("sourcePath", null);
                        if (!name2.equals(jSONObject.getString("workspaceId", null))) {
                            c3992M11494 = C3992.m11494(jMo33964, j3, abstractC20745, name2, string, C16737.m39288(R.string.MT_Protector), z2);
                        } else {
                            AbstractC20745 abstractC20745M46691 = abstractC20745.m46690("original.apk");
                            if (!abstractC20745M46691.mo33971()) {
                                c3992M11494 = C3992.m11494(jMo33964, j3, abstractC20745, name2, string, C16737.m39288(R.string.MT_Protector), z2);
                            } else {
                                try {
                                    C2455 c2456 = new C2455(abstractC20745M46691);
                                    try {
                                        C0465 c0465M30940 = C12461.m30940(c2456);
                                        if (c0465M30940.f2099) {
                                            c2455 = c2456;
                                            str = string;
                                            String str2 = c0465M30940.f2096;
                                            if (str2 == null && (str2 = c0465M30940.f2101) == null) {
                                                str2 = c0465M30940.f2093;
                                            }
                                            if (str2 != null) {
                                                strSubstring = str2;
                                            } else if (str != null && !str.isEmpty()) {
                                                int iLastIndexOf = str.lastIndexOf(47);
                                                strSubstring = (iLastIndexOf < 0 || (i = iLastIndexOf + 1) >= str.length()) ? str : str.substring(i);
                                            }
                                            c3992M11494 = C3992.m11495(jMo33964, j3, abstractC20745, name2, strSubstring == null ? name2 : strSubstring, str, z2);
                                        } else {
                                            c2455 = c2456;
                                            str = string;
                                            try {
                                                c3992M11494 = C3992.m11494(jMo33964, j3, abstractC20745, name2, string, C16737.m39288(R.string.MT_Protector), z2);
                                            } catch (Throwable th) {
                                                th = th;
                                                Throwable th2 = th;
                                                try {
                                                    c2455.close();
                                                } catch (Throwable th3) {
                                                    th2.addSuppressed(th3);
                                                }
                                                throw th2;
                                            }
                                        }
                                        try {
                                            c2455.close();
                                        } catch (Exception unused) {
                                            c3992M11494 = C3992.m11494(jMo33964, j3, abstractC20745, name2, str, C16737.m39288(R.string.MT_Protector), z2);
                                            arrayList.add(c3992M11494);
                                            z = true;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        c2455 = c2456;
                                        str = string;
                                    }
                                } catch (Exception unused2) {
                                    str = string;
                                }
                            }
                        }
                    } catch (Exception unused3) {
                        strM39288 = C16737.m39288(R.string.MT_Protector);
                        c3992M11494 = C3992.m11494(jMo33964, jMo33991, abstractC20745, name2, null, strM39288, false);
                    }
                    arrayList.add(c3992M11494);
                }
                c3992M11494 = C3992.m11494(jMo33964, jMo33991, abstractC20745, name2, null, strM39288, false);
                arrayList.add(c3992M11494);
            }
            z = true;
        }
        C23846.sort(arrayList, C21023.reversed(C7618.comparingLong(new C22338())));
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18420(C3992 c3992) {
        this.f22977.n(c3992);
        AbstractC20745 abstractC20745 = c3992.f14832;
        this.f22978.getClass();
        C7221.m19197(abstractC20745);
        C15157.m36345();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m18419(String str, int i, long j) throws Throwable {
        Set setSingleton = Collections.singleton(str);
        ArrayList arrayList = new ArrayList();
        ArrayList<C3992> arrayListM18417 = m18417();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<C3992> arrayList3 = new ArrayList();
        for (C3992 c3992 : arrayListM18417) {
            if (c3992.f14827) {
                arrayList3.add(c3992);
            } else {
                arrayList2.add(c3992);
            }
        }
        m18415(arrayList2, i, setSingleton, arrayList);
        C23846.sort(arrayList3, C7618.comparingLong(new C13166()));
        ArrayList arrayList4 = new ArrayList();
        for (C3992 c3993 : arrayList3) {
            if (setSingleton.contains(c3993.f14833) || j - c3993.f14825 <= 600000 || !m18416(c3993, arrayList)) {
                arrayList4.add(c3993);
            }
        }
        m18415(arrayList4, 2, setSingleton, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18415(ArrayList arrayList, int i, Set set, ArrayList arrayList2) {
        int size = arrayList.size();
        C23846.sort(arrayList, C7618.comparingLong(new C1170()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3992 c3992 = (C3992) it.next();
            if (size <= i) {
                return;
            }
            if (!set.contains(c3992.f14833) && m18416(c3992, arrayList2)) {
                size--;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m18416(C3992 c3992, ArrayList arrayList) {
        String str = c3992.f14833;
        try {
            this.f22977.n(c3992);
            C7221 c7221 = this.f22978;
            AbstractC20745 abstractC20745 = c3992.f14832;
            c7221.getClass();
            C7221.m19197(abstractC20745);
            arrayList.add(str);
            return true;
        } catch (IOException e) {
            C0577.m2747("MT MCP session delete failed, sessionId=" + str, e);
            return false;
        }
    }
}
