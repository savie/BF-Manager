.class public final synthetic Ll/᩻ܺܳ;
.super Ljava/lang/Object;
.source "CIUF"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/ܺܺܳ;

.field public final synthetic ᩶:Ll/᩵ܿ᩻;


# direct methods
.method public synthetic constructor <init>(Ll/ܺܺܳ;Ll/᩵ܿ᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ܺܳ;->ܰ:Ll/ܺܺܳ;

    iput-object p2, p0, Ll/᩻ܺܳ;->᩶:Ll/᩵ܿ᩻;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 218
    iget-object v0, p0, Ll/᩻ܺܳ;->ܰ:Ll/ܺܺܳ;

    iget-object v0, v0, Ll/ܺܺܳ;->ܰ:Ll/ܽܺܳ;

    invoke-static {v0}, Ll/ܽܺܳ;->ۤ(Ll/ܽܺܳ;)Ll/᩵ܿ᩻;

    move-result-object v1

    iget-object v2, p0, Ll/᩻ܺܳ;->᩶:Ll/᩵ܿ᩻;

    if-ne v1, v2, :cond_0

    invoke-virtual {v2}, Ll/᩵ܿ᩻;->᩷()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ll/ܽܺܳ;->᩵()V

    :cond_0
    return-void
.end method
