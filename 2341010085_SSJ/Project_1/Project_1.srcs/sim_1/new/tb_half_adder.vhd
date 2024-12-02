----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 25.11.2024 09:43:20
-- Design Name: 
-- Module Name: tb_half_adder - Behavioral
-- Project Name: 
-- Target Devices: 
-- Tool Versions: 
-- Description: 
-- 
-- Dependencies: 
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
-- 
----------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx leaf cells in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity tb_half_adder is
--  Port ( );
end tb_half_adder;

architecture Dataflow of tb_half_adder is
component halfAdder1 is
port(a, b : in STD_LOGIC;
sum,carry: out STD_LOGIC);
end component halfAdder1;
signal a1= : std_logic;
signal b1= : std_logic;
signal sum1=std_logic;
signal carry1=std_logic;
begin
sum: half_adder port map(a=>a1,b1=>)

end Dataflow;
