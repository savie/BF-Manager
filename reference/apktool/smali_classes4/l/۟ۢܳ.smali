.class public final Ll/۟ۢܳ;
.super Ll/᩷ۙ᩻;
.source "E4GI"


# instance fields
.field public final synthetic ֫:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic ۚ:[Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>([Ljava/lang/CharSequence;Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 0

    .line 301
    iput-object p1, p0, Ll/۟ۢܳ;->ۚ:[Ljava/lang/CharSequence;

    iput-object p2, p0, Ll/۟ۢܳ;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p0}, Ll/᩷ۙ᩻;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Lbin/mt/plus/Main;)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۙ(Ll/ۖۖۧ;)V
    .locals 3

    const v0, 0x7f1201a8

    .line 310
    invoke-virtual {p1, v0}, Ll/ۖۖۧ;->᩷(I)V

    new-instance v0, Ll/᩷֫᩸;

    const/4 v1, 0x2

    iget-object v2, p0, Ll/۟ۢܳ;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1, v2}, Ll/᩷֫᩸;-><init>(ILjava/lang/Object;)V

    .line 311
    iget-object v1, p0, Ll/۟ۢܳ;->ۚ:[Ljava/lang/CharSequence;

    const/4 v2, -0x1

    invoke-virtual {p1, v1, v2, v0}, Ll/ۖۖۧ;->ۙ([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    return-void
.end method

.method public final ۙ(Landroid/view/View;)Z
    .locals 0

    .line 316
    iget-object p1, p0, Ll/۟ۢܳ;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
