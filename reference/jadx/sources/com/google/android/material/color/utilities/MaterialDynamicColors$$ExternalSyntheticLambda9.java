package com.google.android.material.color.utilities;

import java.util.function.Function;
import l.C4277;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MaterialDynamicColors$$ExternalSyntheticLambda9 implements Function {
    public final /* synthetic */ MaterialDynamicColors f$0;

    public /* synthetic */ MaterialDynamicColors$$ExternalSyntheticLambda9(MaterialDynamicColors materialDynamicColors) {
        this.f$0 = materialDynamicColors;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo33696andThen(Function function) {
        return C4277.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return this.f$0.highestSurface((DynamicScheme) obj);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C4277.$default$compose(this, function);
    }
}
