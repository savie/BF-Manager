package l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.֨֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 492R */
/* JADX INFO: loaded from: classes2.dex */
public final class C0807 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f3415;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f3417;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f3418;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f3419;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2446 f3416 = new C2446();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C2446 f3420 = new C2446();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C2446 f3414 = new C2446();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3378(C0807 c0807) {
        this.f3416.m7426(c0807.f3416);
        this.f3420.m7426(c0807.f3420);
        this.f3414.m7426(c0807.f3414);
        this.f3419 = c0807.f3419;
        this.f3415 = c0807.f3415;
        this.f3418 = c0807.f3418;
        this.f3417 = c0807.f3417;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m3377() {
        return this.f3416 + "->" + this.f3420 + ":" + this.f3414;
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
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final JSONObject m3379() {
        try {
            JSONObject jSONObject = new JSONObject();
            this.f3416.m7431(jSONObject, 'a');
            this.f3414.m7431(jSONObject, 'd');
            this.f3420.m7431(jSONObject, 'g');
            jSONObject.put("j", this.f3419 ? 1 : 0);
            jSONObject.put("k", this.f3415 ? 1 : 0);
            jSONObject.put("l", this.f3418 ? 1 : 0);
            jSONObject.put("m", this.f3417 ? 1 : 0);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
