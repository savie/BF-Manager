package l;

import android.content.Context;
import android.webkit.WebStorage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ᩴۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6JA */
/* JADX INFO: loaded from: classes5.dex */
public final class C19780 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C19780 f63629;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f63630;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f63631;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9801 f63632;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f63633;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f63634;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f63635;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f63636;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6356 f63637;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f63638;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45538(C19780 c19780, String str, C12049 c12049, Boolean bool) {
        c19780.getClass();
        if (bool.booleanValue()) {
            c19780.m45543(str, c12049);
        } else {
            c12049.n(null);
        }
    }

    public C19780(InterfaceC9801 interfaceC9801, C6356 c6356) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f63638 = linkedHashMap;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f63634 = linkedHashSet;
        this.f63631 = new HashMap();
        this.f63630 = new ArrayList();
        this.f63632 = interfaceC9801;
        this.f63637 = c6356;
        String string = interfaceC9801.getString("hpst", "");
        if (string.isEmpty() || string.length() > 1048576) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.getInt("version") != 1) {
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("entries");
            JSONArray jSONArray2 = jSONObject.getJSONArray("pending");
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray jSONArray3 = jSONArray.getJSONArray(i);
                String string2 = jSONArray3.getString(0);
                String string3 = jSONArray3.getString(1);
                if (string2.length() == 32) {
                    for (int i2 = 0; i2 < string2.length(); i2++) {
                        char cCharAt = string2.charAt(i2);
                        if ((cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'f')) {
                        }
                    }
                    if (m45540(string3) && linkedHashSet2.add(string3) && linkedHashMap.put(string2, string3) == null) {
                    }
                }
                throw new JSONException("Invalid preview entry");
            }
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                String string4 = jSONArray2.getString(i3);
                if (!m45540(string4) || !linkedHashSet2.add(string4)) {
                    throw new JSONException("Invalid preview origin");
                }
                linkedHashSet.add(string4);
            }
            this.f63636 = true;
        } catch (JSONException unused) {
            linkedHashMap.clear();
            linkedHashSet.clear();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19780 m45534(Context context) {
        C19780 c19780 = f63629;
        if (c19780 == null || c19780.f63632 != C21576.f68931) {
            f63629 = new C19780(C21576.f68931, new C6356(context.getApplicationContext()));
        }
        return f63629;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m45532(C2343 c2343, String str) {
        String str2;
        if (c2343 == null || (str2 = c2343.f7558) == null) {
            return null;
        }
        return C15022.m36181(str2 + (char) 0 + c2343.f7559 + (char) 0 + C2343.m7888(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.᩷ۧܳ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45546(final String str, final C12049 c12049) {
        if (!this.f63636) {
            this.f63630.add(new Consumer() { // from class: l.ۙۧܳ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    C19780.m45538(this.f16963, str, c12049, (Boolean) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }
            });
            if (this.f63635) {
                return;
            }
            this.f63635 = true;
            this.f63637.m18075((C22018) new Consumer() { // from class: l.᩷ۧܳ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    C19780.m45536(this.f71047, (Boolean) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }
            });
            return;
        }
        m45543(str, c12049);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45536(C19780 c19780, Boolean bool) {
        ArrayList arrayList = c19780.f63630;
        c19780.f63635 = false;
        c19780.f63636 = bool.booleanValue();
        if (bool.booleanValue() && !c19780.m45539()) {
            c19780.f63636 = false;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).n(Boolean.valueOf(c19780.f63636));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m45543(String str, C12049 c12049) {
        LinkedHashMap linkedHashMap = this.f63638;
        String str2 = str == null ? null : (String) linkedHashMap.remove(str);
        if (str2 == null) {
            str2 = "preview-" + UUID.randomUUID() + ".invalid";
        }
        if (str == null) {
            this.f63634.add(str2);
        } else {
            linkedHashMap.put(str, str2);
        }
        HashMap map = this.f63631;
        Integer num = (Integer) map.get(str2);
        map.put(str2, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        C22764 c22764 = new C22764(this, str2);
        m45542();
        if (!m45539()) {
            c22764.close();
            c12049.n(null);
            return;
        }
        c12049.n(c22764);
        if (!this.f63636 || this.f63633) {
            return;
        }
        m45535(new LinkedHashSet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m45542() {
        LinkedHashMap linkedHashMap = this.f63638;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (linkedHashMap.size() > 64 && it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!this.f63631.containsKey(entry.getValue())) {
                this.f63634.add((String) entry.getValue());
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m45544(C19780 c19780) {
        if (!c19780.f63636 || c19780.f63633) {
            return;
        }
        c19780.m45535(new LinkedHashSet());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45535(LinkedHashSet linkedHashSet) {
        String str;
        Iterator it = this.f63634.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            str = (String) it.next();
            if (!this.f63631.containsKey(str) && linkedHashSet.add(str)) {
                break;
            }
        }
        if (str == null) {
            this.f63633 = false;
            return;
        }
        this.f63633 = true;
        C10829 c10829 = new C10829(this, str, linkedHashSet);
        C6356 c6356 = this.f63637;
        c6356.getClass();
        if (!m45540(str)) {
            c10829.n(Boolean.FALSE);
            return;
        }
        String strConcat = "https://".concat(str);
        if (C11972.m30031("DELETE_BROWSING_DATA")) {
            final C16796 c16796 = new C16796(c6356, c10829);
            try {
                WebStorage webStorage = WebStorage.getInstance();
                Runnable runnable = new Runnable() { // from class: l.֫ۧܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c16796.accept(Boolean.TRUE);
                    }
                };
                ExecutorC19851 executorC19851 = new ExecutorC19851();
                if (C19580.f63139.mo27117()) {
                    C5410.m16135().m52380(webStorage).deleteBrowsingDataForSite(strConcat, executorC19851, runnable);
                    return;
                }
                throw C19580.m45180();
            } catch (RuntimeException unused) {
                c16796.accept(Boolean.FALSE);
                return;
            }
        }
        new C12321(c6356, strConcat, c10829).m30736();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45537(C19780 c19780, String str, LinkedHashSet linkedHashSet, Boolean bool) {
        if (bool.booleanValue()) {
            c19780.f63634.remove(str);
            c19780.m45539();
        }
        c19780.m45535(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m45539() {
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : this.f63638.entrySet()) {
                jSONArray.put(new JSONArray().put(entry.getKey()).put(entry.getValue()));
            }
            return this.f63632.edit().putString("hpst", new JSONObject().put("version", 1).put("entries", jSONArray).put("pending", new JSONArray((Collection) this.f63634)).toString()).commit();
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45540(String str) {
        if (str.startsWith("preview-") && str.endsWith(".invalid")) {
            String strM5124 = C1402.m5124(8, 8, str);
            try {
                return UUID.fromString(strM5124).toString().equals(strM5124);
            } catch (IllegalArgumentException unused) {
            }
        }
        return false;
    }
}
