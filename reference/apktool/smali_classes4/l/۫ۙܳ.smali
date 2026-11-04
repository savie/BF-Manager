.class public final Ll/۫ۙܳ;
.super Ljava/lang/Object;
.source "MIRA"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ܰ:Ll/۬ۙܳ;

.field public final ܿ:Ll/ۚۙܳ;

.field public final ᩶:Ll/ۚۙܳ;


# direct methods
.method public constructor <init>(Ll/ۚۙܳ;Ll/ۚۙܳ;Ll/۬ۙܳ;)V
    .locals 0

    .line 156
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 157
    iput-object p1, p0, Ll/۫ۙܳ;->᩶:Ll/ۚۙܳ;

    iput-object p2, p0, Ll/۫ۙܳ;->ܿ:Ll/ۚۙܳ;

    iput-object p3, p0, Ll/۫ۙܳ;->ܰ:Ll/۬ۙܳ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 159
    iget-object v0, p0, Ll/۫ۙܳ;->᩶:Ll/ۚۙܳ;

    invoke-static {v0}, Ll/֫ۙܳ;->ۙ(Ll/ۚۙܳ;)V

    iget-object v0, p0, Ll/۫ۙܳ;->ܿ:Ll/ۚۙܳ;

    invoke-static {v0}, Ll/֫ۙܳ;->ۙ(Ll/ۚۙܳ;)V

    return-void
.end method
