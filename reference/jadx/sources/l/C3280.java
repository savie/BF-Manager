package l;

import com.google.android.material.motion.MotionUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۗ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: S16D */
/* JADX INFO: loaded from: classes2.dex */
public final class C3280 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f10690;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f10694;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f10695;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22629 f10689 = new C22629();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C22629 f10693 = new C22629();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C22629 f10692 = new C22629();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C22629 f10691 = new C22629();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10816(C3280 c3280) {
        this.f10689.m50978(c3280.f10689);
        this.f10693.m50978(c3280.f10693);
        this.f10692.m50978(c3280.f10692);
        this.f10691.m50978(c3280.f10691);
        this.f10695 = c3280.f10695;
        this.f10694 = c3280.f10694;
        this.f10690 = c3280.f10690;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m10815() {
        return this.f10689 + "->" + this.f10693 + MotionUtils.EASING_TYPE_FORMAT_START + this.f10692 + MotionUtils.EASING_TYPE_FORMAT_END + this.f10691;
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
    public final JSONObject m10817() {
        try {
            JSONObject jSONObject = new JSONObject();
            this.f10689.m50983(jSONObject, 'a');
            this.f10693.m50983(jSONObject, 'd');
            this.f10692.m50983(jSONObject, 'g');
            this.f10691.m50983(jSONObject, 'j');
            jSONObject.put("m", this.f10695 ? 1 : 0);
            jSONObject.put("n", this.f10694 ? 1 : 0);
            jSONObject.put("o", this.f10690 ? 1 : 0);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
