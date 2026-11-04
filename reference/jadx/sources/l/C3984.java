package l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.material.color.utilities.DynamicScheme;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۘۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAJH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3984 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13633;

    public /* synthetic */ C3984(int i) {
        this.f13633 = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C24247.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f13633) {
            case 0:
                return C11293.m28558((String) obj);
            case 1:
                return C1170.stream((List) obj);
            case 2:
                return ((C8002) obj).m21843();
            case 3:
                ApplicationInfo applicationInfo = ((PackageInfo) obj).applicationInfo;
                if (applicationInfo == null) {
                    return null;
                }
                return applicationInfo.sourceDir;
            case 4:
                return ((DynamicScheme) obj).neutralPalette;
            case 5:
                return ((DynamicScheme) obj).primaryPalette;
            case 6:
                return ((DynamicScheme) obj).primaryPalette;
            case 7:
                EnumC7215 enumC7215 = (EnumC7215) obj;
                return Boolean.valueOf(enumC7215.m19809() || enumC7215 == EnumC7215.WIDER_BY_GENERIC);
            case 8:
                return ((C17973) obj).m41926();
            case 9:
                return (CharSequence) ((Map.Entry) obj).getValue();
            case 10:
                return ((AbstractC22664) obj).mo4935();
            case 11:
                return (C5816) ((Map.Entry) obj).getValue();
            default:
                return (Iterator) obj;
        }
    }
}
