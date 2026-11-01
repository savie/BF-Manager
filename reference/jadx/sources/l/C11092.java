package l;

import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import java.lang.reflect.Array;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: CB2D */
/* JADX INFO: loaded from: classes4.dex */
public class C11092 implements InterfaceC0507, AutoCloseable {

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final InputFilter[] f37657 = new InputFilter[0];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C21799 f37658;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f37659;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock.WriteLock f37660;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f37661;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f37662;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10407 f37663;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock.ReadLock f37664;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2665 f37665;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final C14620 f37666;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f37667;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C1254 f37668;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile int f37669;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile boolean f37670;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InputFilter[] f37671;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C13935 f37672;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f37673;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f37674;

    @Override // android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Editable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // android.text.Editable
    public final /* bridge */ /* synthetic */ Editable insert(int i, CharSequence charSequence) {
        insert(i, charSequence);
        return this;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC10407 m28001() {
        return this.f37663;
    }

    public C11092() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f37674 = reentrantReadWriteLock;
        this.f37664 = reentrantReadWriteLock.readLock();
        this.f37660 = reentrantReadWriteLock.writeLock();
        this.f37663 = new C17441(this);
        this.f37671 = f37657;
        C14744.m35328(0, 0, 0);
        this.f37668 = null;
        C21799 c21799 = new C21799("");
        this.f37658 = c21799;
        c21799.m48560(new C6982(0, 0, "", 0, 0), null);
        this.f37666 = new C14620(this, "", 0);
    }

    public C11092(C1254 c1254) {
        this(c1254, null);
    }

    public C11092(C1254 c1254, CharSequence charSequence) {
        C14620 c14620;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f37674 = reentrantReadWriteLock;
        this.f37664 = reentrantReadWriteLock.readLock();
        this.f37660 = reentrantReadWriteLock.writeLock();
        this.f37663 = new C17441(this);
        this.f37671 = f37657;
        this.f37668 = c1254;
        this.f37658 = null;
        if (charSequence == null) {
            c14620 = new C14620(this, null, 0);
        } else {
            c14620 = new C14620(this, charSequence, charSequence.length());
        }
        this.f37666 = c14620;
        C8872 c8872M4546 = c1254.m4546();
        this.f37662 = true;
        try {
            if (c8872M4546.m23016() >= 0) {
                setSpan(Selection.SELECTION_START, c8872M4546.m23016(), c8872M4546.m23016(), 34);
            }
            if (c8872M4546.m23014() >= 0) {
                setSpan(Selection.SELECTION_END, c8872M4546.m23014(), c8872M4546.m23014(), 34);
            }
        } finally {
            this.f37662 = false;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C6276 m27989() {
        m27988();
        C1254 c1254 = this.f37668;
        return c1254 == null ? this.f37658.m48558() : c1254.m4554();
    }

    @Override // l.InterfaceC0507
    /* JADX INFO: renamed from: ᩸ۙ */
    public final C3329 mo2399() {
        return m27986(false);
    }

    @Override // l.InterfaceC0507
    /* JADX INFO: renamed from: ᩷ */
    public final C3329 mo2398() {
        return m27986(true);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C3329 m27986(boolean z) {
        C1254 c1254;
        this.f37664.lock();
        try {
            if (this.f37659 != 0) {
                throw new IllegalStateException("Text replacement is not published");
            }
            m27988();
            C6276 c6276M27989 = (!z || (c1254 = this.f37668) == null) ? m27989() : c1254.m4545();
            int i = this.f37669;
            this.f37664.unlock();
            return C3329.m9881(c6276M27989, i);
        } catch (Throwable th) {
            this.f37664.unlock();
            throw th;
        }
    }

    @Override // l.InterfaceC0507
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2394(C3329 c3329) {
        C6276 c6276M9895 = c3329 == null ? null : c3329.m9895();
        boolean z = false;
        if (c6276M9895 == null) {
            return false;
        }
        this.f37664.lock();
        try {
            if (!this.f37670 && this.f37659 == 0 && c3329.m9896() == this.f37669) {
                C1254 c1254 = this.f37668;
                if (c1254 == null) {
                    if (this.f37658.m48561(c6276M9895)) {
                        z = true;
                    }
                } else if (c1254.m4542(c6276M9895)) {
                    z = true;
                }
            }
            return z;
        } finally {
            this.f37664.unlock();
        }
    }

    /* JADX INFO: renamed from: ۧۙ */
    public EnumC11839 mo8726() {
        return m27981(false);
    }

    /* JADX INFO: renamed from: ۫ۙ */
    public EnumC11839 mo8727() {
        return m27981(true);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27998(Runnable runnable) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f37660;
        writeLock.lock();
        try {
            m27988();
            C1254 c1254 = this.f37668;
            if (c1254 == null) {
                throw new IllegalStateException("History requires a text session");
            }
            int i = this.f37667;
            if (i != 0 || this.f37661 != 0) {
                throw new IllegalStateException("Cannot group history during text callbacks");
            }
            this.f37667 = i + 1;
            try {
                m28000();
                c1254.m4533(runnable);
                this.f37667--;
                writeLock.unlock();
            } catch (Throwable th) {
                this.f37667--;
                throw th;
            }
        } catch (Throwable th2) {
            writeLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public int mo8732() {
        return hashCode();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private EnumC11839 m27981(boolean z) {
        EnumC11839 enumC11839M4529;
        this.f37660.lock();
        try {
            if (this.f37670) {
                enumC11839M4529 = EnumC11839.UNAVAILABLE;
            } else {
                m27988();
                if (this.f37668 == null) {
                    throw new IllegalStateException("History requires a text session");
                }
                int i = this.f37667;
                if (i != 0 || this.f37661 != 0) {
                    throw new IllegalStateException("Cannot replay history during text callbacks");
                }
                this.f37667 = i + 1;
                try {
                    m28000();
                    enumC11839M4529 = this.f37668.m4529(z, new C6152(this));
                    this.f37667--;
                } catch (Throwable th) {
                    this.f37667--;
                    throw th;
                }
            }
            this.f37660.unlock();
            return enumC11839M4529;
        } catch (Throwable th2) {
            this.f37660.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo8723(boolean z) {
        close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27993(C1254 c1254) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f37660;
        writeLock.lock();
        try {
            m27988();
            if (this.f37668 != c1254) {
                throw new IllegalArgumentException("Text batch belongs to another session");
            }
            if (this.f37661 != 0 || this.f37667 != 0) {
                throw new IllegalStateException("Cannot publish text load during callbacks");
            }
            writeLock.unlock();
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8996 mo27991(C18749 c18749) {
        return c18749.m43301(this.f37663);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27996(C1254 c1254, C19455 c19455, char[] cArr, int i, C8996 c8996, int i2) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f37660;
        writeLock.lock();
        try {
            m27993(c1254);
            return this.f37668.m4543(this.f37663, c19455, cArr, i, c8996, i2);
        } finally {
            writeLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27994(C2665 c2665) {
        int length = length();
        C2665 c2666 = this.f37665;
        this.f37665 = c2665;
        this.f37661++;
        try {
            this.f37666.m35124(length, length, (CharSequence) CharBuffer.wrap(c2665.m8207(), 0, c2665.m8208()), 0, c2665.m8208(), true);
            this.f37666.getClass();
        } finally {
            this.f37665 = c2666;
            this.f37661--;
        }
    }

    @Override // l.InterfaceC0507
    public final void setSelection(int i) {
        setSelection(i, i);
    }

    @Override // l.InterfaceC0507
    public final void setSelection(int i, int i2) {
        this.f37660.lock();
        try {
            if (!this.f37670) {
                Selection.setSelection(this, Math.min(i, length()), Math.min(i2, length()));
            }
        } finally {
            this.f37660.unlock();
        }
    }

    @Override // android.text.Editable
    public C11092 replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m27982(i, i2, charSequence, i3, i4, (C13935) null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m27982(int i, int i2, CharSequence charSequence, int i3, int i4, C13935 c13935) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f37660;
        if (this.f37670) {
            return;
        }
        int length = charSequence.length();
        if (this.f37670) {
            return;
        }
        if (i3 < 0 || i4 < i3 || i4 > length) {
            StringBuilder sbM2791 = C0589.m2791("start = ", i3, ", end = ", ", length = ", i4);
            sbM2791.append(length);
            throw new IndexOutOfBoundsException(sbM2791.toString());
        }
        CharSequence charSequence2 = charSequence;
        int i5 = i3;
        int length2 = i4;
        for (InputFilter inputFilter : this.f37671) {
            if (this.f37670) {
                return;
            }
            CharSequence charSequenceFilter = inputFilter.filter(charSequence2, i5, length2, this, i, i2);
            if (this.f37670) {
                return;
            }
            if (charSequenceFilter != null) {
                charSequence2 = charSequenceFilter;
                length2 = charSequenceFilter.length();
                i5 = 0;
            }
        }
        writeLock.lock();
        try {
            if (!m27987()) {
                writeLock.unlock();
                return;
            }
            m28000();
            C14744.m35328(i, i2, length());
            C14744.m35329(length(), i2 - i, length2 - i5);
            this.f37661++;
            C13935 c13936 = this.f37672;
            C2665 c2665 = this.f37665;
            this.f37672 = c13935;
            this.f37665 = null;
            try {
                this.f37666.m35124(i, i2, charSequence2, i5, length2, false);
                this.f37666.getClass();
                this.f37672 = c13936;
                this.f37665 = c2665;
                this.f37661--;
                writeLock.unlock();
            } catch (Throwable th) {
                this.f37672 = c13936;
                this.f37665 = c2665;
                this.f37661--;
                throw th;
            }
        } catch (Throwable th2) {
            writeLock.unlock();
            throw th2;
        }
    }

    @Override // l.InterfaceC0507
    /* JADX INFO: renamed from: ۤܰ */
    public final int mo2395() {
        return this.f37669;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m27990() {
        if (this.f37674.isWriteLockedByCurrentThread()) {
            return (this.f37661 == 0 && this.f37667 == 0) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [l.۫ܺۖ] */
    /* JADX WARN: Type inference failed for: r8v0, types: [l.ܽܺۖ] */
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
    public final void m27992(final int i, final int i2, final CharSequence charSequence, final int i3, final int i4) {
        this.f37659++;
        if (i != i2 || i3 != i4) {
            try {
                this.f37669++;
            } finally {
                this.f37659--;
            }
        }
        C1254 c1254 = this.f37668;
        if (c1254 == 0) {
            C21799 c21799 = this.f37658;
            c21799.getClass();
            c21799.m48560(new C6982(i, i2, charSequence, i3, i4), null);
        } else {
            C2665 c2665 = this.f37665;
            if (c2665 != null) {
                c1254.m4534(c2665);
            } else {
                C13935 c13935 = this.f37672;
                if (c13935 != null) {
                    c1254.m4536(c13935, (C16736) new Consumer() { // from class: l.ܽܺۖ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C1455.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            ((C15450) obj).m36971(i, i2, charSequence, i3, i4);
                        }
                    });
                } else {
                    c1254.m4535((C12503) new Consumer() { // from class: l.۫ܺۖ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C1455.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            ((C15450) obj).m36971(i, i2, charSequence, i3, i4);
                        }
                    });
                }
            }
        }
    }

    @Override // android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        return replace(i, i, charSequence, i2, i3);
    }

    @Override // android.text.Editable
    public final Editable delete(int i, int i2) {
        return replace(i, i2, "");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27997(int i) {
        replace(0, i, "");
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final void append(CharSequence charSequence) {
        insert(length(), charSequence);
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        int length = length();
        replace(length, length, charSequence, i, i2);
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        int length = length();
        replace(length, length, charSequence, i, i2);
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        insert(length(), (CharSequence) String.valueOf(c));
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        insert(length(), (CharSequence) String.valueOf(c));
        return this;
    }

    @Override // android.text.Editable
    public final void clear() {
        m27997(length());
    }

    @Override // android.text.Editable
    public final void setFilters(InputFilter[] inputFilterArr) {
        this.f37660.lock();
        try {
            if (!this.f37670) {
                if (inputFilterArr == null) {
                    throw new IllegalArgumentException();
                }
                this.f37671 = inputFilterArr;
            }
            this.f37660.unlock();
        } catch (Throwable th) {
            this.f37660.unlock();
            throw th;
        }
    }

    @Override // android.text.Editable
    public final InputFilter[] getFilters() {
        return this.f37671;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        ReentrantReadWriteLock.ReadLock readLock = this.f37664;
        readLock.lock();
        try {
            m27983(i, i2, cArr, i3);
        } finally {
            readLock.unlock();
        }
    }

    @Override // l.InterfaceC0507
    /* JADX INFO: renamed from: ܰ */
    public final void mo2397(int i, int i2, char[] cArr, int i3) {
        m27983(i, i2, cArr, i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27983(int i, int i2, char[] cArr, int i3) {
        C6276 c6276M27985 = m27985();
        try {
            if (c6276M27985 != null) {
                c6276M27985.getChars(i, i2, cArr, i3);
            } else {
                int i4 = i2 - i;
                if (i < 0 || i2 < i || i3 < 0 || i4 > cArr.length - i3) {
                    throw new IndexOutOfBoundsException("Invalid character copy range");
                }
                Arrays.fill(cArr, i3, i4 + i3, (char) 0);
            }
            if (c6276M27985 != null) {
                c6276M27985.close();
            }
        } catch (Throwable th) {
            if (c6276M27985 != null) {
                try {
                    c6276M27985.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        try {
            if (this.f37670) {
                return (char) 0;
            }
            C1254 c1254 = this.f37668;
            if (c1254 == null) {
                C14744 c14744M48559 = this.f37658.m48559(i);
                C16072 c16072 = c14744M48559.f48220;
                try {
                    return c14744M48559.m35331(i);
                } finally {
                    if (c16072 != null) {
                        c16072.m38088();
                    }
                }
            }
            return c1254.m4528(i);
        } catch (C4865 e) {
            if (this.f37670) {
                return (char) 0;
            }
            throw e;
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        try {
            if (this.f37670) {
                return this.f37673;
            }
            C1254 c1254 = this.f37668;
            return c1254 == null ? this.f37658.length() : c1254.length();
        } catch (C4865 e) {
            if (!this.f37670) {
                throw e;
            }
            return this.f37673;
        }
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        char[] cArr = new char[i2 - i];
        getChars(i, i2, cArr, 0);
        return new String(cArr);
    }

    @Override // l.InterfaceC0507
    /* JADX INFO: renamed from: ܰ */
    public final String mo2396(int i, int i2) {
        return ((String) subSequence(i, i2)).toString();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        C6276 c6276M27985 = m27985();
        try {
            String str = c6276M27985 == null ? new String(new char[this.f37673]) : c6276M27985.toString();
            if (c6276M27985 != null) {
                c6276M27985.close();
            }
            return str;
        } catch (Throwable th) {
            if (c6276M27985 != null) {
                try {
                    c6276M27985.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.text.Editable
    public final void clearSpans() {
        C14620 c14620 = this.f37666;
        ReentrantReadWriteLock.WriteLock writeLock = this.f37660;
        writeLock.lock();
        try {
            if (m27987()) {
                c14620.m35123();
                m28000();
            }
        } finally {
            writeLock.unlock();
        }
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        C14620 c14620 = this.f37666;
        ReentrantReadWriteLock.WriteLock writeLock = this.f37660;
        writeLock.lock();
        try {
            if (m27987()) {
                c14620.m35125(obj, i, i2, i3);
                m28000();
            }
        } finally {
            writeLock.unlock();
        }
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        C14620 c14620 = this.f37666;
        ReentrantReadWriteLock.WriteLock writeLock = this.f37660;
        writeLock.lock();
        try {
            if (m27987()) {
                c14620.m35121(obj);
                m28000();
            }
        } finally {
            writeLock.unlock();
        }
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        Object[] objArrM35126;
        this.f37664.lock();
        try {
            if (this.f37670) {
                if (cls == null) {
                    cls = Object.class;
                }
                objArrM35126 = (Object[]) Array.newInstance((Class<?>) cls, 0);
            } else {
                objArrM35126 = this.f37666.m35126(i, i2, cls);
            }
            return objArrM35126;
        } finally {
            this.f37664.unlock();
        }
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        this.f37664.lock();
        try {
            if (!this.f37670) {
                return this.f37666.m35127(obj);
            }
            return -1;
        } finally {
            this.f37664.unlock();
        }
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        this.f37664.lock();
        try {
            if (!this.f37670) {
                return this.f37666.m35122(obj);
            }
            return -1;
        } finally {
            this.f37664.unlock();
        }
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        this.f37664.lock();
        try {
            if (!this.f37670) {
                return this.f37666.m35129(obj);
            }
            return 0;
        } finally {
            this.f37664.unlock();
        }
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        this.f37664.lock();
        try {
            return this.f37670 ? i2 : this.f37666.m35128(i, i2, cls);
        } finally {
            this.f37664.unlock();
        }
    }

    public final boolean equals(Object obj) {
        char cM11802;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C11092 c11092 = (C11092) obj;
                C6276 c6276M27985 = m27985();
                try {
                    C6276 c6276M27986 = c11092.m27985();
                    try {
                        int length = c6276M27985 == null ? this.f37673 : c6276M27985.length();
                        if (length != (c6276M27986 == null ? c11092.f37673 : c6276M27986.length())) {
                            if (c6276M27986 != null) {
                                c6276M27986.close();
                            }
                            if (c6276M27985 != null) {
                                c6276M27985.close();
                                return false;
                            }
                        } else {
                            C4159 c4159Mo33951 = null;
                            C4159 c4159Mo33952 = c6276M27985 == null ? null : c6276M27985.mo33951(0);
                            if (c6276M27986 != null) {
                                try {
                                    c4159Mo33951 = c6276M27986.mo33951(0);
                                } catch (Throwable th) {
                                    if (c4159Mo33952 != null) {
                                        try {
                                            c4159Mo33952.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            if (c4159Mo33952 == null && c4159Mo33951 == null) {
                                if (c4159Mo33951 != null) {
                                    c4159Mo33951.close();
                                }
                                if (c4159Mo33952 != null) {
                                    c4159Mo33952.close();
                                }
                                if (c6276M27986 != null) {
                                    c6276M27986.close();
                                }
                                if (c6276M27985 != null) {
                                    c6276M27985.close();
                                    return true;
                                }
                            } else {
                                for (int i = 0; i < length; i++) {
                                    char cM11803 = c4159Mo33952 == null ? (char) 0 : c4159Mo33952.m11802();
                                    if (c4159Mo33951 == null) {
                                        cM11802 = 0;
                                    } else {
                                        try {
                                            cM11802 = c4159Mo33951.m11802();
                                        } catch (Throwable th3) {
                                            if (c4159Mo33951 != null) {
                                                try {
                                                    c4159Mo33951.close();
                                                } catch (Throwable th4) {
                                                    th3.addSuppressed(th4);
                                                }
                                            }
                                            throw th3;
                                        }
                                    }
                                    if (cM11803 != cM11802) {
                                        if (c4159Mo33951 != null) {
                                            c4159Mo33951.close();
                                        }
                                        if (c4159Mo33952 != null) {
                                            c4159Mo33952.close();
                                        }
                                        if (c6276M27986 != null) {
                                            c6276M27986.close();
                                        }
                                        if (c6276M27985 != null) {
                                            c6276M27985.close();
                                            return false;
                                        }
                                    }
                                }
                                if (c4159Mo33951 != null) {
                                    c4159Mo33951.close();
                                }
                                if (c4159Mo33952 != null) {
                                    c4159Mo33952.close();
                                }
                                if (c6276M27986 != null) {
                                    c6276M27986.close();
                                }
                                if (c6276M27985 != null) {
                                    c6276M27985.close();
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        if (c6276M27986 != null) {
                            try {
                                c6276M27986.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    if (c6276M27985 != null) {
                        try {
                            c6276M27985.close();
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                    }
                    throw th7;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C6276 c6276M27985 = m27985();
        int iM11802 = 0;
        if (c6276M27985 == null) {
            if (c6276M27985 != null) {
                c6276M27985.close();
            }
            return 0;
        }
        try {
            C4159 c4159Mo33951 = c6276M27985.mo33951(0);
            while (c4159Mo33951.m11801()) {
                try {
                    iM11802 = (iM11802 * 31) + c4159Mo33951.m11802();
                } catch (Throwable th) {
                    try {
                        c4159Mo33951.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            c4159Mo33951.close();
            c6276M27985.close();
            return iM11802;
        } catch (Throwable th3) {
            try {
                c6276M27985.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final C16031 m27999() {
        return new C16031(this, -1);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m28000() {
        C1254 c1254 = this.f37668;
        if (c1254 == null || this.f37662) {
            return;
        }
        c1254.m4532(Selection.getSelectionStart(this), Selection.getSelectionEnd(this));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m27987() {
        if (this.f37670) {
            return false;
        }
        C1254 c1254 = this.f37668;
        if (c1254 == null || this.f37662) {
            return true;
        }
        c1254.m4563();
        return true;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private C6276 m27985() {
        if (this.f37670) {
            return null;
        }
        try {
            return m27989();
        } catch (C4865 e) {
            if (this.f37670) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.text.Editable
    public final void insert(int i, CharSequence charSequence) {
        if (this.f37670) {
            return;
        }
        replace(i, i, charSequence, 0, charSequence.length());
    }

    @Override // android.text.Editable
    public final C11092 replace(int i, int i2, CharSequence charSequence) {
        return this.f37670 ? this : replace(i, i2, charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27995() {
        return this.f37670;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m27988() {
        if (this.f37670) {
            throw new C4865("Editable is closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f37660.lock();
        try {
            if (!this.f37670) {
                if (this.f37661 != 0 || this.f37667 != 0) {
                    throw new IllegalStateException("Cannot close during editable replacement");
                }
                C1254 c1254 = this.f37668;
                this.f37673 = c1254 == null ? this.f37658.length() : c1254.length();
                this.f37670 = true;
                C21799 c21799 = this.f37658;
                if (c21799 != null) {
                    c21799.close();
                }
            }
            this.f37660.unlock();
        } catch (Throwable th) {
            this.f37660.unlock();
            throw th;
        }
    }
}
