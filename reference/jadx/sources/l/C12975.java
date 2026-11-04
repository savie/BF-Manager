package l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.۫۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 492R */
/* JADX INFO: loaded from: classes4.dex */
public final class C12975 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f41600;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f41603;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f41604;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f41605;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22629 f41599 = new C22629();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22629 f41602 = new C22629();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C22629 f41601 = new C22629();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32386(C12975 c12975) {
        this.f41599.m50978(c12975.f41599);
        this.f41602.m50978(c12975.f41602);
        this.f41601.m50978(c12975.f41601);
        this.f41604 = c12975.f41604;
        this.f41605 = c12975.f41605;
        this.f41600 = c12975.f41600;
        this.f41603 = c12975.f41603;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m32385() {
        return this.f41599 + "->" + this.f41602 + ":" + this.f41601;
    }

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
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final JSONObject m32387() {
        try {
            JSONObject jSONObject = new JSONObject();
            this.f41599.m50983(jSONObject, 'a');
            this.f41601.m50983(jSONObject, 'd');
            this.f41602.m50983(jSONObject, 'g');
            jSONObject.put("j", this.f41604 ? 1 : 0);
            jSONObject.put("k", this.f41605 ? 1 : 0);
            jSONObject.put("l", this.f41600 ? 1 : 0);
            jSONObject.put("m", this.f41603 ? 1 : 0);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
