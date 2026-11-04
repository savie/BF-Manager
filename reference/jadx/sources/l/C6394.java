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

/* JADX INFO: renamed from: l.ۛ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7A5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6394 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Consumer f21586;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20893 f21587;

    public C6394() {
        this(new C20893(), new C16088());
    }

    public C6394(C20893 c20893, Consumer consumer) {
        this.f21587 = c20893;
        this.f21586 = consumer;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m18146() {
        return m18145();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private ArrayList m18145() throws Throwable {
        String strM49088;
        String str;
        C12359 c12359M30833;
        C22941 c22941;
        int i;
        ArrayList arrayList = new ArrayList();
        AbstractC22044 abstractC22044M47755 = this.f21587.m47755();
        if (!abstractC22044M47755.mo4281()) {
            return arrayList;
        }
        boolean z = true;
        for (AbstractC22044 abstractC22044 : abstractC22044M47755.mo4299(true)) {
            String name = abstractC22044.getName();
            if (abstractC22044.mo4281() && !abstractC22044.m49860() && !name.startsWith(".tmp-") && !name.equals("xref")) {
                String name2 = abstractC22044.getName();
                LinkedList linkedList = new LinkedList();
                linkedList.add(abstractC22044);
                long jMo4285 = 0;
                while (!linkedList.isEmpty()) {
                    for (AbstractC22044 abstractC22045 : ((AbstractC22044) linkedList.removeFirst()).mo4299(z)) {
                        if (abstractC22045.mo4281()) {
                            if (!abstractC22045.m49860()) {
                                linkedList.addLast(abstractC22045);
                            }
                        } else if (!abstractC22045.m49860()) {
                            jMo4285 = abstractC22045.mo4285() + jMo4285;
                        }
                    }
                }
                long jMo4286 = abstractC22044.mo4286();
                AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("metadata.json");
                if (!abstractC22044M49876.mo4304()) {
                    strM49088 = C21576.m49088(R.string.MT_Protector);
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(abstractC22044M49876.m49865(), StandardCharsets.UTF_8));
                        boolean z2 = jSONObject.getBoolean("temporary", false);
                        long j = jSONObject.getLong("createdAt", -1L);
                        long j2 = jSONObject.getLong("lastAccessedAt", -1L);
                        long j3 = j2 >= 0 ? j2 : j >= 0 ? j : jMo4286;
                        String strSubstring = null;
                        String string = jSONObject.getString("sourcePath", null);
                        if (!name2.equals(jSONObject.getString("workspaceId", null))) {
                            c12359M30833 = C12359.m30833(jMo4285, j3, abstractC22044, name2, string, C21576.m49088(R.string.MT_Protector), z2);
                        } else {
                            AbstractC22044 abstractC22044M49877 = abstractC22044.m49876("original.apk");
                            if (!abstractC22044M49877.mo4304()) {
                                c12359M30833 = C12359.m30833(jMo4285, j3, abstractC22044, name2, string, C21576.m49088(R.string.MT_Protector), z2);
                            } else {
                                try {
                                    C22941 c22942 = new C22941(abstractC22044M49877);
                                    try {
                                        C7139 c7139M14548 = C4684.m14548(c22942);
                                        if (c7139M14548.f23605) {
                                            c22941 = c22942;
                                            str = string;
                                            String str2 = c7139M14548.f23603;
                                            if (str2 == null && (str2 = c7139M14548.f23610) == null) {
                                                str2 = c7139M14548.f23607;
                                            }
                                            if (str2 != null) {
                                                strSubstring = str2;
                                            } else if (str != null && !str.isEmpty()) {
                                                int iLastIndexOf = str.lastIndexOf(47);
                                                strSubstring = (iLastIndexOf < 0 || (i = iLastIndexOf + 1) >= str.length()) ? str : str.substring(i);
                                            }
                                            c12359M30833 = C12359.m30834(jMo4285, j3, abstractC22044, name2, strSubstring == null ? name2 : strSubstring, str, z2);
                                        } else {
                                            c22941 = c22942;
                                            str = string;
                                            try {
                                                c12359M30833 = C12359.m30833(jMo4285, j3, abstractC22044, name2, string, C21576.m49088(R.string.MT_Protector), z2);
                                            } catch (Throwable th) {
                                                th = th;
                                                Throwable th2 = th;
                                                try {
                                                    c22941.close();
                                                } catch (Throwable th3) {
                                                    th2.addSuppressed(th3);
                                                }
                                                throw th2;
                                            }
                                        }
                                        try {
                                            c22941.close();
                                        } catch (Exception unused) {
                                            c12359M30833 = C12359.m30833(jMo4285, j3, abstractC22044, name2, str, C21576.m49088(R.string.MT_Protector), z2);
                                            arrayList.add(c12359M30833);
                                            z = true;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        c22941 = c22942;
                                        str = string;
                                    }
                                } catch (Exception unused2) {
                                    str = string;
                                }
                            }
                        }
                    } catch (Exception unused3) {
                        strM49088 = C21576.m49088(R.string.MT_Protector);
                        c12359M30833 = C12359.m30833(jMo4285, jMo4286, abstractC22044, name2, null, strM49088, false);
                    }
                    arrayList.add(c12359M30833);
                }
                c12359M30833 = C12359.m30833(jMo4285, jMo4286, abstractC22044, name2, null, strM49088, false);
                arrayList.add(c12359M30833);
            }
            z = true;
        }
        C12884.sort(arrayList, C8627.reversed(C2661.comparingLong(new C3410())));
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18148(C12359 c12359) {
        this.f21586.n(c12359);
        AbstractC22044 abstractC22044 = c12359.f39700;
        this.f21587.getClass();
        C20893.m47744(abstractC22044);
        C22099.m50062();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m18147(String str, int i, long j) throws Throwable {
        Set setSingleton = Collections.singleton(str);
        ArrayList arrayList = new ArrayList();
        ArrayList<C12359> arrayListM18145 = m18145();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<C12359> arrayList3 = new ArrayList();
        for (C12359 c12359 : arrayListM18145) {
            if (c12359.f39693) {
                arrayList3.add(c12359);
            } else {
                arrayList2.add(c12359);
            }
        }
        m18143(arrayList2, i, setSingleton, arrayList);
        C12884.sort(arrayList3, C2661.comparingLong(new C20564()));
        ArrayList arrayList4 = new ArrayList();
        for (C12359 c123510 : arrayList3) {
            if (setSingleton.contains(c123510.f39698) || j - c123510.f39697 <= 600000 || !m18144(c123510, arrayList)) {
                arrayList4.add(c123510);
            }
        }
        m18143(arrayList4, 2, setSingleton, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18143(ArrayList arrayList, int i, Set set, ArrayList arrayList2) {
        int size = arrayList.size();
        C12884.sort(arrayList, C2661.comparingLong(new C23548()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C12359 c12359 = (C12359) it.next();
            if (size <= i) {
                return;
            }
            if (!set.contains(c12359.f39698) && m18144(c12359, arrayList2)) {
                size--;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m18144(C12359 c12359, ArrayList arrayList) {
        String str = c12359.f39698;
        try {
            this.f21586.n(c12359);
            C20893 c20893 = this.f21587;
            AbstractC22044 abstractC22044 = c12359.f39700;
            c20893.getClass();
            C20893.m47744(abstractC22044);
            arrayList.add(str);
            return true;
        } catch (IOException e) {
            C20653.m47272("MT MCP session delete failed, sessionId=" + str, e);
            return false;
        }
    }
}
