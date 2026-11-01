package l;

import android.graphics.Bitmap;
import android.view.View;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.search.SearchView;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2544 implements InterfaceC7359, InterfaceC16464, InterfaceC1692, InterfaceC0380, ViewUtils.OnApplyWindowInsetsListener, InterfaceC3740 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f10061;

    public /* synthetic */ C2544(Object obj) {
        this.f10061 = obj;
    }

    public /* synthetic */ C2544(C19602 c19602, List list) {
        this.f10061 = list;
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public C15844 onApplyWindowInsets(View view, C15844 c15844, ViewUtils.RelativePadding relativePadding) {
        return ((SearchView) this.f10061).lambda$setUpToolbarInsetListener$4(view, c15844, relativePadding);
    }

    @Override // l.InterfaceC1692
    public /* synthetic */ void onCanceled() {
    }

    @Override // l.InterfaceC0380
    /* JADX INFO: renamed from: ۙ */
    public void mo1825(Object obj) {
        C20890.m46986((C20890) this.f10061);
    }

    @Override // l.InterfaceC1692
    /* JADX INFO: renamed from: ۙ */
    public void mo3908(String str) {
        C15347.m36743((C15347) this.f10061, str);
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }

    @Override // l.InterfaceC16464
    /* JADX INFO: renamed from: ۙ */
    public Bitmap mo947() {
        return C5443.m15057(new C11794((AbstractC20745) this.f10061));
    }

    @Override // l.InterfaceC3740
    /* JADX INFO: renamed from: ܰ */
    public Object mo1620() {
        Type type = (Type) this.f10061;
        if (!(type instanceof ParameterizedType)) {
            throw new C9573("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new C9573("Invalid EnumMap type: " + type.toString());
    }
}
