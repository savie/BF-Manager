package l;

import com.google.android.material.motion.MotionUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.۠֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: S16D */
/* JADX INFO: loaded from: classes3.dex */
public final class C7864 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f25878;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f25881;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f25882;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2446 f25879 = new C2446();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2446 f25880 = new C2446();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C2446 f25883 = new C2446();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C2446 f25877 = new C2446();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20762(C7864 c7864) {
        this.f25879.m7426(c7864.f25879);
        this.f25880.m7426(c7864.f25880);
        this.f25883.m7426(c7864.f25883);
        this.f25877.m7426(c7864.f25877);
        this.f25878 = c7864.f25878;
        this.f25882 = c7864.f25882;
        this.f25881 = c7864.f25881;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m20761() {
        return this.f25879 + "->" + this.f25880 + MotionUtils.EASING_TYPE_FORMAT_START + this.f25883 + MotionUtils.EASING_TYPE_FORMAT_END + this.f25877;
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
    public final JSONObject m20763() {
        try {
            JSONObject jSONObject = new JSONObject();
            this.f25879.m7431(jSONObject, 'a');
            this.f25880.m7431(jSONObject, 'd');
            this.f25883.m7431(jSONObject, 'g');
            this.f25877.m7431(jSONObject, 'j');
            jSONObject.put("m", this.f25878 ? 1 : 0);
            jSONObject.put("n", this.f25882 ? 1 : 0);
            jSONObject.put("o", this.f25881 ? 1 : 0);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
