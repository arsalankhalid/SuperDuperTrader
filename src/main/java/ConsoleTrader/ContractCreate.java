package ConsoleTrader;

import com.ib.client.Contract;

/**
 * Created by khalida on 1/28/2016.
 */
public class ContractCreate {
    private String symbol;
    private String secType;
    private String strike;
    private String putCall;
    private String multiplier;
    private String exchange;
    private String currency;
    private String localSymbol;
    private String tradingClass;
    private String expiry;

    public ContractCreate() {
        symbol = null;
        secType = null;
        strike = null;
        putCall = null;
        multiplier = null;
        exchange = null;
        currency = null;
        localSymbol = null;
        tradingClass = null;
    }

    public ContractCreate(String symbol, String secType, String strike, String putCall, String multiplier, String exchange, String currency, String localSymbol, String tradingClass, String expiry) {
        this.symbol = symbol;
        this.secType = secType;
        this.strike = strike;
        this.putCall = putCall;
        this.multiplier = multiplier;
        this.exchange = exchange;
        this.currency = currency;
        this.localSymbol = localSymbol;
        this.tradingClass = tradingClass;
        this.expiry = expiry;
    }

    /*
     * Sets everything on Contract object besides ConId
     */
    private void setContractButConId(Contract contract) {
        contract.m_currency = this.currency;
        contract.m_exchange = this.currency;
        contract.m_symbol = this.symbol;
        contract.m_secType = this.secType;
        contract.m_localSymbol = this.localSymbol;
        contract.m_tradingClass = this.tradingClass;
        contract.m_expiry = this.expiry;
    }


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSecType() {
        return secType;
    }

    public void setSecType(String secType) {
        this.secType = secType;
    }

    public String getStrike() {
        return strike;
    }

    public void setStrike(String strike) {
        this.strike = strike;
    }

    public String getPutCall() {
        return putCall;
    }

    public void setPutCall(String putCall) {
        this.putCall = putCall;
    }

    public String getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(String multiplier) {
        this.multiplier = multiplier;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLocalSymbol() {
        return localSymbol;
    }

    public void setLocalSymbol(String localSymbol) {
        this.localSymbol = localSymbol;
    }

    public String getTradingClass() {
        return tradingClass;
    }

    public void setTradingClass(String tradingClass) {
        this.tradingClass = tradingClass;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }
}
