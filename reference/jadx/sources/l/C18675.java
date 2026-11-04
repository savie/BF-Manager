package l;

import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N43O */
/* JADX INFO: loaded from: classes5.dex */
public final class C18675 extends C0776 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f60719 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f60720 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f60721 = new ConcurrentMapC17249();

    @Override // l.C0776
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC24329 mo3175(InterfaceC24329 interfaceC24329) {
        return (InterfaceC24329) C23217.computeIfAbsent(this.f60719, interfaceC24329, new Function() { // from class: l.ܰ᩻ۘ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return super/*l.֡᩻ۘ*/.mo3175((InterfaceC24329) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }
        });
    }

    @Override // l.C0776
    /* JADX INFO: renamed from: ۤ */
    public final List mo3174(InterfaceC24329 interfaceC24329) {
        List listMo3174;
        synchronized (this.f60721) {
            listMo3174 = (List) this.f60721.get(interfaceC24329);
            if (listMo3174 == null) {
                listMo3174 = super.mo3174(interfaceC24329);
                this.f60721.put(interfaceC24329, listMo3174);
            }
        }
        return listMo3174;
    }

    @Override // l.C0776
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3173(InterfaceC24329 interfaceC24329) {
        return ((C15867) C23217.computeIfAbsent(this.f60720, interfaceC24329, new C21659(0, this))).isPresent();
    }

    @Override // l.C0776
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo3176(InterfaceC24329 interfaceC24329) {
        return ((Boolean) ((C15867) C23217.computeIfAbsent(this.f60720, interfaceC24329, new C21659(0, this))).map(new C12796(8)).orElse(Boolean.FALSE)).booleanValue();
    }
}
