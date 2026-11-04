.class public final Ll/ܳܽܳ;
.super Ljava/lang/Object;
.source "F6G9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ܰ:Ll/᩷ܽܳ;


# direct methods
.method public constructor <init>(Ll/᩷ܽܳ;Ll/۬ܳܳ;)V
    .locals 0

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 170
    iput-object p1, p0, Ll/ܳܽܳ;->ܰ:Ll/᩷ܽܳ;

    return-void
.end method

.method public static synthetic ۙ(Ll/ܳܽܳ;Ll/۬᩻ܳ;)V
    .locals 0

    .line 183
    iget-object p0, p0, Ll/ܳܽܳ;->ܰ:Ll/᩷ܽܳ;

    invoke-static {p0, p1}, Ll/֫ܽܳ;->ۙ(Ll/᩷ܽܳ;Ll/۬᩻ܳ;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 176
    sget-object v0, Ll/۬᩻ܳ;->ܿ:Ll/۬᩻ܳ;

    .line 347
    :try_start_0
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object v1

    invoke-static {}, Ll/۟۠ۧ;->ᩴ()Ll/᩻۠ۧ;

    move-result-object v2

    invoke-static {v1, v2}, Ll/᩷ܺܳ;->ۙ(Landroid/app/Application;Ll/᩻۠ۧ;)Ll/۬᩻ܳ;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    :catchall_0
    new-instance v1, Ll/ᩴܽܳ;

    invoke-direct {v1, p0, v0}, Ll/ᩴܽܳ;-><init>(Ll/ܳܽܳ;Ll/۬᩻ܳ;)V

    invoke-static {v1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void
.end method
